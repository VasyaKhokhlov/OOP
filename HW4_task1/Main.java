package HW4_task1;

public class Main {
    public static void main(String[] args) {
        printElement("Hello");
        printElement(4323423);
        printElement(323.232);
    }
    public static <T> void printElement(T element){
        System.out.println(element);
    }
}
