package HW4_task4;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> dataContainer = new DataContainer<>();
        dataContainer.add("car");
        dataContainer.add("macbook");
        dataContainer.add("ruller");
        dataContainer.print();

        dataContainer.sort((element1, element2) -> element2.compareTo(element1));
        System.out.println();
        dataContainer.print();
        System.out.println(dataContainer.get(2));
        dataContainer.sort((element1, element2) -> element1.compareTo(element2));
        System.out.println();
        dataContainer.print();
        System.out.println();
        System.out.println(dataContainer.get(2));
    }
}