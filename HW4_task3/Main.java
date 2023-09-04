package HW4_task3;

public class Main {
    public static void main(String[] args) {
       System.out.println(getMax(10, 129));
       System.out.println(getMax("computer", "car"));
       System.out.println(getMax(12.2, 23.1));
    }

    public static <T extends Comparable<T>> T getMax(T parametr1, T parametr2){
        return parametr1.compareTo(parametr2) >= 0 ? parametr1 : parametr2;
    }
}