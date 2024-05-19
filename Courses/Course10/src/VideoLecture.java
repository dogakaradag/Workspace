public class VideoLecture extends CourseContent {
    private int videoLength;
    private int ratingsSum;
    private int ratingsCount;

    public VideoLecture(String title, String description, int duration, String difficultyLevel, int videoLength) {
        super(title, duration, difficultyLevel, description);
        this.videoLength = videoLength;
        this.ratingsSum = 0;
        this.ratingsCount = 0;
    }

    @Override
    public void accessContent() {
        System.out.println("Playing the video lecture: " + title);
    }

    @Override
    public void rateContent(int rating) {
        ratingsSum = rating;
        ratingsCount++;
        System.out.println("New Rating: " + rating);
    }

    @Override
    public int getEstimatedCompletionTime() {
        return videoLength;
    }

    public void updateDescription(String newDescription){
        this.description = newDescription;
    }

    public void skipTo(int minute){
        if (minute < 0 || minute > videoLength){
            System.out.println("Invalid minute to skip to!");
        }
        else{
            System.out.println("Skipping to minute: " + minute);
        }
    }
}

