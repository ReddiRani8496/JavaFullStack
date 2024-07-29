package training.iqgateway;

public class Movie {
    
    private int id;
    private String title;
    private String rating;

    // no arg constructor
    public Movie() {
        this.id = 1000;
        this.title = "NA";
        this.rating = "NA";    
    }

    // prameterised constructor
    public Movie(int id, String title, String rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
    }

    // copy constructor
    public Movie(Movie movObjToCopy) {
        this.id  = movObjToCopy.id;
        this.title = movObjToCopy.title;
        this.rating = movObjToCopy.rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
    @Override
    public String toString() {
        return "Movie Details: [ id : " + id + ", title : " + title + ", rating : " + rating + " ]";
    }
}
