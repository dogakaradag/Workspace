public class Book extends LibraryItem {
    
    Author author;
    private String genre;

    public Book(int id, String title, int yearPublished, Author author, String genre) {
        super(id, title, yearPublished);
        this.author = author;
        this.genre = genre;
    }
    
    public Author getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Author: " + author.getName());
        System.out.println("Genre: " + genre);
        System.out.println();
    }
}
