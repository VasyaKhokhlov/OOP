package HW1_task3;

public class Main {
    public static void main(String[] args) {
        Book book = new  Book("Сказка о рыбаке и рыбке", "Пушкин", true);
        Book book1 = new  Book("Евгений Онегин", "Пушкин", false);
        Book book2 = new  Book("Герой нашего времени","Лермонтов", true );
        Book book3 = new  Book("Война и мир", "Толстой", true);
        Library library = new Library();;
        

        System.out.println(book.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book2.getAvailable());
        System.out.println();
        book.displayInfo();
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook(book2);
        library.displayAvailableBooks();
        library.searchByAuthor("Пушкин");
    }
}