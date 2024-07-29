package training.iqgateway.chainingconstructors;

public class Movie {
    
    private int id;
    private String title;
    private String rating;
    private final int NO_OF_ACTORS = 8;
    
    public static int nextMovId;
    
    static {
        // static block is meant for initialization of static variable
        // static block is called only one once in the life cycle of a class
        // when the class is loaded then static block is automatically executed
        
        nextMovId = 2000;
        System.out.println("Hey I am static block .......");
    }

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
    
    public static void sayHello() {
        System.out.println("Hello from static methods......");
    }
    
    public static void accessStatic() {
        System.out.println(nextMovId);
        sayHello();
    }
    
    // instance method
    public void accessInstanceAndStatic() {
        System.out.println(this.id); // accessing instance variables
        System.out.println(this.getTitle()); // accessing instance methods
        
        System.out.println(this.nextMovId); // accessing static variables
        this.sayHello(); // accessing static methods
        
    }
}
