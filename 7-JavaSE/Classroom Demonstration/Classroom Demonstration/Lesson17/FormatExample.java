import java.text.*;
import java.util.*;
public class FormatExample 
{
	public static void main(String[] args) 
	{
		Date dobj = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy G");
		System.out.println(sdf.format(dobj));


		double salary = 10000000000.4545454545;
		DecimalFormat df = new DecimalFormat("$###,###.##");
		System.out.println(df.format(salary));
	}
}
