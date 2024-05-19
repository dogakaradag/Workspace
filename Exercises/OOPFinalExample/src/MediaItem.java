public abstract class MediaItem {

    private String title;
    private int year;
    private int copiesAvailable;

    public MediaItem(String title, int year, int copiesAvailable) {
        this.title = title;
        this.year = year;
        this.copiesAvailable = copiesAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public abstract void checkout();
    public abstract void returnItem();

    @Override
    public String toString() {
        return String.format("Title: %s, Year: %d, Copies Available: %d", title, year, copiesAvailable);
    }
}
