import java.util.Date;
import java.text.*;

public class DateExample 
{
	public static void main(String[] args) 
	{
		String s1 = "Network Labs";

		String s2 = new String("Network Labs");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		Date dobj = new Date();
	
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd-MMMM-yy");

		System.out.println(sdf.format(dobj));

		double salary = 12340000000.454545;

		DecimalFormat df = new DecimalFormat("$###,###.##");

		System.out.println(df.format(salary));

		String emailPattern = "[a-zA-Z0-9_\.]+@[a-zA-Z]+\.[a-z]{2,4}"

		Pattern p = Pattern.compile(emailPattern);

		Matcher m = p.matcher("rahul@gmail.com");

		boolean result = m.matches();
	}
}
