	import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMethodExample {
  public static void main(String args[]) {
    reusePatternMethodExample();
  }

  public static void reusePatternMethodExample() {
    Pattern p = Pattern.compile("\\d");
    Matcher matcher = p.matcher("5");
    boolean isOk = matcher.matches();
    System.out.println("original pattern matches " + isOk);

    String tmp = p.pattern();
    Pattern p2 = Pattern.compile(tmp);
    matcher = p.matcher("5");
    isOk = matcher.matches();
    System.out.println("second pattern matches " + isOk);
  }
}
