public abstract class CourseContent {
    protected String title;
    protected String description;
    protected int duration;
    protected String difficultyLevel;

    public CourseContent(String title, int duration, String difficultyLevel, String description) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.difficultyLevel = difficultyLevel;
    }

    public abstract void accessContent();

    public abstract void rateContent(int rating);

    public void displayContentDetails(){
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration);
        System.out.println("Difficulty: " + difficultyLevel);
        System.out.println();
    }

    public abstract int getEstimatedCompletionTime();
}

