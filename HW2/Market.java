package HW2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Market implements MarketBehaviour, QueueBehaviour{
    private Queue<String> queue;
    public Market(){
        this.queue = new LinkedList<>();
    }

    @Override
    public void addPerson(String person) {
        enqueue(person);
    }

    @Override
    public void removePerson(String person) {
        queue.remove(person);
    }

    @Override
    public void update() {
        if (!queue.isEmpty()) {
            Random random = new Random();
            int id = random.nextInt(90000) + 10000;
            String person = dequeue();
            System.out.println("Заказ на имя " + person + " принят, № заказа: " + id);
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
            System.out.println("Заказ №" + id + " выдан, получатель: " + person);
        } else {
            System.out.println("В очреди нет заказов");
        }
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        return queue.remove();
    }

    @Override
    public int size() {
        return queue.size();
    }
}