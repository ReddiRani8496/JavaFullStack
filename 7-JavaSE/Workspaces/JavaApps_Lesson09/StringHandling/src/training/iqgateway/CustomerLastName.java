package training.iqgateway;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerLastName {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[A-Z][\\w]{1,24}$");
        Matcher m = p.matcher("John");
        boolean result = m.matches();
        System.out.println(result);
        
        System.out.println("abc".matches("a[\\w]c"));
        System.out.println("12Java".matches("[\\d]{2}[\\w]{4}"));
        System.out.println("12Java".matches("[\\d]*"));
        System.out.println("12Java".matches("[\\d]{2}[\\w]{1,15}"));
        System.out.println();
        System.out.println("Java".replaceAll("[av]", "KH"));
        System.out.println("Java".replaceAll("av", "KH"));
        System.out.println("Java".replaceFirst("\\w", "KH"));
        System.out.println("Java".replaceFirst("\\w*", "KH"));
        System.out.println("Java12".replaceAll("\\d", "KH"));
    
        System.out.println();
        System.out.println("Java".split("[a]"));
        System.out.println("Java".split("[av]"));
        System.out.println("Java#HTML#PHP".split("#"));
        System.out.println("JavaToHTMLToPHP".split("T|H"));
    
    }
}
