package HW2;

import java.util.Timer;

import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) {
    Market market = new Market();
        market.addPerson("Владимир");
        market.addPerson("Антон");
        market.addPerson("Елизавета");
        market.addPerson("Григорий");
        market.addPerson("Анатолий");
        market.addPerson("Иван");
        market.addPerson("Алексей");

        market.removePerson("Антон");
        market.removePerson("Алексей");
        for (int i = market.size(); i >= 0 ; i--){
            market.update();

            if (market.size() == 0){
                market.update();
                break;
            }else {
                System.out.println("В очереди " + market.size() + " человек(а)");
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}

