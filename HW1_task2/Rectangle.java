package HW1_task2;

public class Rectangle {
    private int width;
    public int height;

    public Rectangle(){
        this(10,10);
    }
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int calculateArea(Rectangle rectangle){
        int area = rectangle.getWidth() * rectangle.getHeight();
        return area;
    }

    public int calculatePerimeter(Rectangle rectangle){
        int perimeter = (2 * (rectangle.getHeight() + rectangle.getWidth()));
        return perimeter;
    }
}