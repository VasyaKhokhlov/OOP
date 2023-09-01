package HW1_task3;

import java.util.ArrayList;
import java.util.Formattable;

public class Library {
    private ArrayList<Book> catalog;


    public Library() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(Book book){
        this.catalog.add(book);

    }

    public void removeBook(Book book){
        this.catalog.remove(book);
    }

    public void displayAvailableBooks(){
        System.out.println();
        System.out.println("Книги с доступностью да:");
        for (Book book : catalog) {
            if (book.getAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author){
        System.out.println();
        System.out.println("Книги автора " + author + ":");
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }
}
