package HW1_task3;

public class Book {
    private String title;
    private  String author;
    private boolean available;

    public Book(String title, String author, boolean available){
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable(){
        return this.available;
    }

    public void displayInfo(){
        System.out.println("Название: " + getTitle() + "\nАвтор:  " + getAuthor() +"\nДоступность: " + (getAvailable() ? "Да" : "Нет"));
        System.out.println();
    }

}
