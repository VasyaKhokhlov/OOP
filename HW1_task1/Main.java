package HW1_task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Owner owner = new Owner("Виталий");
        cat.setName("Барсик");
        cat.setAge(2);
        cat.setOwnerName(owner);
        cat.greet();
    }
}

