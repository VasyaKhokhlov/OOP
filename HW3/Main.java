package HW3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.addPerson("Витя", Arrays.asList("Наушники Airpods 2", "Ноутбук Macbook Air 13.3"), 11000 + 130000);
        market.addPerson("Иван", Arrays.asList("Видео карта Nvidea RTX 3070 Ti"), 60000);
        market.addPerson("Пётр", Arrays.asList("Зарядка для телефона Type-C", "Жёский диск 2тб", "Пылесос Dyson"), 900 + 5500 + 50000);
        System.out.println("Выбирите тип сортировки заказов: \n1.По колличеству товаров покупателя \n2.По цене товаров покпателя");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1){
            Comparator<Person> personComparator = Comparator.comparingInt(person -> person.getProducts().size());
            market.sortByProductCount(personComparator);
        } else if (choice == 2) {
            Comparator<Person> personComparator = Comparator.comparingInt(Person::getPrice);
            market.sortByPrice(personComparator);
        }
        else {
            System.out.println("Такого варианта сортировки не существует");
        }


        for (int i = market.size(); i >= 0; i--) {
            market.update();

           if (market.size() == 0) {
                market.update();
                break;
            } else {

               System.out.println("В очереди " + market.size() + " человек(а)");
               System.out.println();
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }



    }
}
