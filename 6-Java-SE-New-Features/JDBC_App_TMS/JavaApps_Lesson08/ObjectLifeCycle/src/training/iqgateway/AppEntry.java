package training.iqgateway;

public class AppEntry {
    public static void main(String[] args) {
        
        Movie mov1 = new Movie();
        System.out.println("\nMovie Details");
        System.out.println("ID        :" + mov1.getId());
        System.out.println("Title     :" + mov1.getTitle());
        System.out.println("Rating  :" + mov1.getRating());
        
        mov1.setId(1001);
        mov1.setTitle("KGF");
        mov1.setRating("Fantastic");
        
        System.out.println("ID        :" + mov1.getId());
        System.out.println("Title     :" + mov1.getTitle());
        System.out.println("Rating  :" + mov1.getRating());
        
        Movie mov2 = new Movie();
        System.out.println("\nMovie Details");
        System.out.println("ID        :" + mov2.getId());
        System.out.println("Title     :" + mov2.getTitle());
        System.out.println("Rating  :" + mov2.getRating());
        
        mov2.setId(1002);
        mov2.setTitle("Pushpa");
        mov2.setRating("Fabulous");
        
        System.out.println("\nMovie Details");
        System.out.println("ID        :" + mov2.getId());
        System.out.println("Title     :" + mov2.getTitle());
        System.out.println("Rating  :" + mov2.getRating());
        
        // parameterised constructor
        Movie mov3 = new Movie(1003, "RRR", "Superb");
        System.out.println("\nMovie Details");
        System.out.println("ID        :" + mov3.getId());
        System.out.println("Title     :" + mov3.getTitle());
        System.out.println("Rating  :" + mov3.getRating());
        
        Movie mov4 = new Movie(1004, "Aacharya", "Nice");
        System.out.println("\nMovie Details");
        System.out.println("ID        :" + mov4.getId());
        System.out.println("Title     :" + mov4.getTitle());
        System.out.println("Rating  :" + mov4.getRating());
        System.out.println("UID       :" + mov4.hashCode() );
        
        // copy constructor
        Movie mov5 = new Movie(mov4);
//        System.out.println("\nMovie Details");
//        System.out.println("ID        :" + mov5.getId());
//        System.out.println("Title     :" + mov5.getTitle());
//        System.out.println("Rating  :" + mov5.getRating());
//        System.out.println("UID       :" + mov5.hashCode());
        System.out.println(mov5);
        
    }
}
