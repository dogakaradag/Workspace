public class Book extends MediaItem{

    private String author;

    public Book(String title, int year, int copiesAvailable, String author) {
        super(title, year, copiesAvailable);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void checkout() {
        if (getCopiesAvailable()>0){
            setCopiesAvailable(getCopiesAvailable()-1);
            System.out.println("Book checked out: " + getTitle());
        }
        else{
            System.out.println("No copies available to check out for: " + getTitle());
        }
    }

    @Override
    public void returnItem() {
        System.out.println("Book returned successfully: " + getTitle());
        setCopiesAvailable(getCopiesAvailable()+1);
    }

    @Override
    public String toString() {
        return String.format("Book [Title: %s, Year: %d, Copies Available: %d, Author: %s]",
                getTitle(), getYear(), getCopiesAvailable(), author);
    }

}
