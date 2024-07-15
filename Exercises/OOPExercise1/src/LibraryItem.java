public abstract class LibraryItem {
    private int id;
    private String title;
    private int yearPublished;


    public LibraryItem(int id, String title, int yearPublished) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
    }

   

    public int getId() {
        return id;
    }






    public String getTitle() {
        return title;
    }





    public int getYearPublished() {
        return yearPublished;
    }






    public abstract void displayInfo();
    
    
}
