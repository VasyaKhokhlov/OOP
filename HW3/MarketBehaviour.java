package HW3;

import java.util.List;

interface MarketBehaviour {
    void addPerson(String name, List<String> products, int price);
    void removePerson(Person name);
    void update();
}
