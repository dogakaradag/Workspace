import java.util.ArrayList;
import java.util.List;

public class ReadingMaterial extends CourseContent implements Searchable{
    private int numberOfPages;
    private int ratingsSum;
    private int ratingsCount;

    public ReadingMaterial(String title, int duration, String difficultyLevel, String description, int numberOfPages) {
        super(title, duration, difficultyLevel, description);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void accessContent() {
        System.out.println("Opening the reading material...");
    }

    @Override
    public void rateContent(int rating) {
        ratingsSum = rating;
        ratingsCount++;
        System.out.println("New Rating: " + rating);
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching for " + keyword + " in reading material");
    }

    @Override
    public int getEstimatedCompletionTime() {
        return duration * numberOfPages;
    }

    public void updateDescription(String newDescription){
        this.description = description;
    }
}
