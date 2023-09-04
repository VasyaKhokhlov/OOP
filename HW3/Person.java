package HW3;

import java.util.List;

public class Person implements Price, Products {
    private String name;
    private List<String> products;
    private int price;

    public Person(String name, List<String> products, int price) {
        this.name = name;
        this.products = products;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public List<String> getProducts() {
        return products;
    }
}

