//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReadingMaterial book = new ReadingMaterial("Java Basics", 5, "Introduction to Java" , "Beginner", 120);
        VideoLecture video = new VideoLecture("Learn Java", "Video Course on Java", 120, "Intermediate", 60);

        book.displayContentDetails();
        video.displayContentDetails();

        book.accessContent();
        video.accessContent();

        book.rateContent(5);
        video.rateContent(4);

        book.search("Java");
        video.skipTo(30);

        System.out.println("Estimated reading time: " + book.getEstimatedCompletionTime() + " minutes");
        System.out.println("Estimated video duration: " + video.getEstimatedCompletionTime() + " minutes");
    }
}