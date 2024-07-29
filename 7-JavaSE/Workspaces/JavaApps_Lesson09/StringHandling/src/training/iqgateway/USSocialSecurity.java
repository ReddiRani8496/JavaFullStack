package training.iqgateway;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class USSocialSecurity {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]{3}-[0-9]{2}-[0-9]{4}");
//        Matcher m = p.matcher("456-90-7865");
         Matcher m = p.matcher("456-9-7865");
        boolean result = m.matches();
        System.out.println(result);
    }
}
