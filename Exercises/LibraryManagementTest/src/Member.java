import java.util.ArrayList;
import java.util.List;

/**
 * Member
 */
public class Member {

    String name;
    String memberID;
    List<Book> borrowedBooks = new ArrayList<Book>();

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    void boorowBook(Book book) {
        book.borrowBook();
    }

    void returnBook(Book book) {
        book.returnBook();
    }

    List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}