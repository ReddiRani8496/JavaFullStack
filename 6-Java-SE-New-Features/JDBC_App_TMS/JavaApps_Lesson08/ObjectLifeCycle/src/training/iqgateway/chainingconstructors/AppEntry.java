package training.iqgateway.chainingconstructors;

public class AppEntry {
    public static void main(String[] args) {
        
        // accessing via class name
        System.out.println(Movie.nextMovId);
        
        // accessing via object reference
        Movie mov1 = new Movie();
        System.out.println(mov1.nextMovId);
        
        // accessing static methods via class name
        Movie.sayHello();
        Movie.accessStatic();
        
        // accessing static methods via obj reference
        mov1.sayHello();
        mov1.accessStatic();
    }
}
