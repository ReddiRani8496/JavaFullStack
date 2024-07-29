public class ValidationTest {
  public static void main(String[] args) {
    String candidate = "I love Java ";
    String pattern = "Java \\d";
    System.out.println(candidate.matches(pattern));
  }
}
           
      