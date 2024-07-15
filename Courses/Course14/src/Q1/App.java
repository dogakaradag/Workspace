package Q1;

import java.util.ArrayList;
import java.util.List;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
       
        List<Book> books = new ArrayList<>();
        books.add(new Book("C#", "Anders Hejlsberg", 700.0));
        books.add(new Book("Effective Java", "Joshua Bloch", 450.0));
        books.add(new Book("Clean Code", "Robert C. Martin", 500.0));
        
        BookStore bookStore = new BookStore();
        bookStore.addBooksToFile("books.txt", books);

        List<Book> readBooks = bookStore.readBooksFromFile("books.txt");
        bookStore.displayBooks(readBooks);
    }
}
