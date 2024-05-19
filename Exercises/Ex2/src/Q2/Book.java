package Q2;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String toString(){
        return "Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.isbn;
    }


    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public void displayBook(){
        System.out.println("Title: " + this.title + "\nAuthor: " + author + "\nISBN: " + isbn);
        System.out.println();
    }

}

