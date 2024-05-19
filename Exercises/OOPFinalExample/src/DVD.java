public class DVD extends MediaItem{

    private String director;
    private String genre;

    public DVD(String title, int year, int copiesAvailable, String director, String genre) {
        super(title, year, copiesAvailable);
        director = director;
        genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void checkout() {
        if (getCopiesAvailable() > 0) {
            setCopiesAvailable(getCopiesAvailable() - 1);
            System.out.println("Magazine checked out: " + getTitle());
        } else {
            System.out.println("No copies available to check out for: " + getTitle());

        }
    }

    @Override
    public void returnItem() {
        System.out.println("DVD returned successfully: " + getTitle());
        setCopiesAvailable(getCopiesAvailable()+1);

    }

    @Override
    public String toString() {
        return String.format("DVD [Title: %s, Year: %d, Copies Available: %d, Director: %s, Genre: %s]",
                getTitle(), getYear(), getCopiesAvailable(), director, genre);
    }
}
