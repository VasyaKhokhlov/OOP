package HW3;
import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour {
    private Queue<Person> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void addPerson(String name, List<String> products, int price) {
        Person person = new Person(name, products, price);
        enqueue(person);
    }

    @Override
    public void removePerson(Person name) {
        queue.removeIf(person -> person.getName().equals(name));
    }

    @Override
    public void update() {
        if (!queue.isEmpty()) {
            Random random = new Random();
            int id = random.nextInt(90000) + 10000;
            Person person = dequeue();
            System.out.println("Заказ на имя " + person.getName() + " принят, № заказа: " + id);
            System.out.println("Cостав заказа - " + person.getProducts());
            System.out.println("Общаяя сумма заказа: " + person.getPrice() + " рублей");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Обработка заказа №" + id);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Заказ №" + id + " выдан, получатель: " + person.getName());
            removePerson(person);
        } else {
            System.out.println("В очереди нет заказов");
        }
    }

    @Override
    public void enqueue(Person person) {
        queue.add(person);
    }

    @Override
    public Person dequeue() {
        return queue.poll();
    }

    @Override
    public int size() {
        return queue.size();
    }


    public void sortByProductCount(Comparator<Person> personComparator) {
        List<Person> personList = new ArrayList<>(queue);
        personList.sort(Comparator.comparingInt(person -> person.getProducts().size()));
        queue = new LinkedList<>(personList);

    }

    public void sortByPrice(Comparator<Person> personComparator) {
        List<Person> personList = new ArrayList<>(queue);
        personList.sort(Comparator.comparingInt(Person::getPrice));
        queue = new LinkedList<>(personList);

    }

    public void printQueue() {
        for (Person person : queue) {
            System.out.println("Имя: " + person.getName());
            System.out.println("Список товаров: " + person.getProducts());
            System.out.println("Цена: " + person.getPrice());
            System.out.println();
        }
    }
}