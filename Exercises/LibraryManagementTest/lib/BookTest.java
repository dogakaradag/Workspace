
package LibraryManagementTest.lib;

public class BookTest {

    @Test

    public void testBorrowBook() {
        Book book = new Book("Title", "Author", "12345");
        book.borrowBook();
        assertFalse(book.isAvailable(), "Book should be marked as borrowed");

    }

}