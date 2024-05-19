package Q2;

public class Library {
    private Book[] books;
    private int bookCount;
    private static final int MAX_BOOKS = 10;

    public Library(){
        this.bookCount = 0;
        this.books = new Book[MAX_BOOKS];
    }

    public void addBook(Book book){
        if (bookCount<MAX_BOOKS){
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book has been added successfully.");
        }
        else{
            System.out.println("Library is full. ");
        }
    }

    public void displayBooks(){
        for(int i =0;i<bookCount;i++){
            books[i].displayBook();
        }
    }

    public Book searchByTitle(String title){
        for (Book b : books){
            if (b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    public Book searchByAuthor(String author){
        for (Book b : books){
            if (b.getAuthor().equalsIgnoreCase(author)){
                return b;
            }
        }
        return null;
    }

    public void removeBook(String isbn) {
        for (int i =0;i<bookCount;i++){
            if (books[i].getIsbn().equals(isbn)) {
                for(int j=i;j<bookCount-1;j++){
                    books[j] = books[j+1];
                }
                books[bookCount-1] = null;
                bookCount -= 1;
            }
        }
    }

    // Remove book
    // A B C E F G null
    //       X
}
