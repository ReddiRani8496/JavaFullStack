package training.iqgateway;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneRegex {
    public static void main(String[] args) {
       Pattern p = Pattern.compile("^[(]{1}[\\d]{3}[)]{1}[\\d]{3}-[\\d]{4}");
       Matcher m = p.matcher("(123)456-6789");
       boolean result = m.matches();
     //  System.out.println(result);
       System.out.println("abc".matches("^a[\\w]c"));
//	System.out.println("12Java".matches("[\\d]{2}[\\w]{4}"));
//	System.out.println("12Java".matches("[\\d]*"));
//	System.out.println("12Java".matches("[\\d]{2}[\\w]{1,15}"));
//	String[] str = "Java".split("[a|v]");
//	for(String s : str)
//	System.out.println(s);
//	System.out.println("Java".split("[av]"));
    }
}
