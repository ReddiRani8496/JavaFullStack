package training.iqgateway;

public class Movie {
    private int id;
        private String title;
        private String rating;
        
        public Movie(){
        }

    public Movie(int id, String title, String rating) {
        super();
        this.id = id;
        this.title = title;
        this.rating = rating;
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
        return "Movie details: [ " + this.getId() + ", " + this.getRating() + ", "+this.getTitle()+" ]";
    }
}
