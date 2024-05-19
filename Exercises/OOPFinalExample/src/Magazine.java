public class Magazine extends MediaItem{
    private int issueNumber;

    public Magazine(String title, int year, int copiesAvailable, int issueNumber) {
        super(title, year, copiesAvailable);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void checkout() {
        if (getCopiesAvailable()>0){
            setCopiesAvailable(getCopiesAvailable()-1);
            System.out.println("Magazine checked out: " + getTitle());
        }
        else{
            System.out.println("No copies available to check out for: " + getTitle());

        }

    }

    @Override
    public void returnItem() {
        System.out.println("Magazine returned successfully: " + getTitle());
        setCopiesAvailable(getCopiesAvailable()+1);
    }

    @Override
    public String toString() {
        return String.format("Magazine [Title: %s, Year: %d, Copies Available: %d, Issue Number: %d]",
                getTitle(), getYear(), getCopiesAvailable(), issueNumber);
    }
}
