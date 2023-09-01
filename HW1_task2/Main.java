package HW1_task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(12);
        rectangle.setWidth(12);
        System.out.println(rectangle.calculateArea(rectangle));
        System.out.println(rectangle.calculatePerimeter(rectangle));
    }
}
