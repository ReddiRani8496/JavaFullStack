package training.iqgateway;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class FormatExamples {
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println(date);
        
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM yyyy z");
        System.out.println(sdf.format(date));
        
        float salary = 25000.232323f;
        DecimalFormat df = new   DecimalFormat("##,###.##");
        System.out.println(df.format(salary));
        
        int planet = 7;
        String event = "a disturbance in the Force";

        String result = MessageFormat.format(
            "At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
            planet, new Date(), event);
        System.out.println(result);
    }
}
