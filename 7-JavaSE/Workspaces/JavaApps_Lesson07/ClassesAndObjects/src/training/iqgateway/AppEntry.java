package training.iqgateway;

public class AppEntry {
    public static void main(String[] args) {
        
        Movie movRef1 = new Movie();
        movRef1.setMovId(1001);
        movRef1.setTitle("Kantara");
        movRef1.setRating("Awesome");
        movRef1.displayDetails();
                
        Movie movRef2 = new Movie();
        movRef2.setMovId(1002);
        movRef2.setTitle("Three");
        movRef2.setRating("Thrilling");
        movRef2.displayDetails();
        
        Movie movRef3 = new Movie();
        movRef3.setMovId(1003);
        movRef3.setTitle("DJ");
        movRef3.setRating("Fabulous");
        movRef3.displayDetails();
        
        System.out.println("After assigning the references ");
        movRef2 = movRef3;
        movRef2.displayDetails();
        movRef3.displayDetails();
    }
}
