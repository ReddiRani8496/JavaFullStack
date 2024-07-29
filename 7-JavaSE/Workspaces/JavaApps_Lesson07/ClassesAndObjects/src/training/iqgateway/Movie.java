package training.iqgateway;

public class Movie {
    
    //Attributes
    private int movId;
    private String title;
    private String rating;
    
    //operations
    public void setMovId(int givenMovId) {
        this.movId = givenMovId;
    }

    public void setTitle(String givenTitle) {
        this.title = givenTitle;
    }

    public void setRating(String givenRating) {
        this.rating = givenRating;
    }
    
    public void displayDetails() {
        System.out.println("Movie Details ");
        System.out.println("Id     :" + this.movId);
        System.out.println("Title  :" + this.title);
        System.out.println("Rating :" + this.rating);
        System.out.println("UID    :" + this.hashCode());
        System.out.println();
    }
}
