public class Author extends Person {

    private String bio;

    public Author(String name, String email, String bio) {
        super(name, email);
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }
}
