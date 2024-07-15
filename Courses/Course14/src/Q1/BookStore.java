package Q1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BookStore {

    void addBooksToFile(String fileName, List<Book> books) {
        try (FileWriter writer = new FileWriter(new File(fileName))) {
            for (Book book : books) {
                writer.write(book.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    List<Book> readBooksFromFile(String fileName) {
        List<Book> list = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File(fileName));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");

                String title = parts[0];
                String author = parts[1];
                double price = Double.parseDouble(parts[2]);

                Book book = new Book(title, author, price);
                list.add(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return list;
    }

    void displayBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

}
