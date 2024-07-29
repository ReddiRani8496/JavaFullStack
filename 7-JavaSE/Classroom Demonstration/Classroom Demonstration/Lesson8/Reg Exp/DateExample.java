import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateExample {

    private static void DateExample() {

        Date date = new Date();
        System.out.println("Current Date and Time is : " + date);
        System.out.println();

        System.out.println("Date object showing specific date and time");
        Date particulardate1 = new Date(24L*60L*60L*1000L);
        Date particulardate2 = new Date(0L);
        System.out.println();
        System.out.println("First Particular date : " + particulardate1);
        System.out.println("Second Particular date: " + particulardate2);
        System.out.println();       

        System.out.println("Demo of getTime() method returning milliseconds");
        System.out.println();
        Date strtime = new Date();
        System.out.println("Start Time: " + strtime);
        Date endtime = new Date();
        System.out.println("End Time is: " + endtime);
        long elapsed_time = endtime.getTime() - strtime.getTime();
        System.out.println("Elapsed Time is:" + elapsed_time + " milliseconds");
        System.out.println();

        System.out.println("Changed date object using setTime() method");
        System.out.println();
        Date chngdate = new Date();
        System.out.println("Date before change is: " + chngdate);
        chngdate.setTime(24L*60L*60L*1000L);
        System.out.println("Now the Changed date is: " + chngdate);
        System.out.println();
  }

    public static void main(String[] args) {
        System.out.println();
        DateExample();
    }

} 