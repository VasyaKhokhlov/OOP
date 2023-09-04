package HW4_task2;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,3,21,3};
        Double[] doubleArray = {1.3, 2.3, 23.3, 1.9};
        String[] stringArray = {"a", "b", "c"};
        printArray(doubleArray);
        printArray(stringArray);
        printArray(intArray);
    }
    public static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}