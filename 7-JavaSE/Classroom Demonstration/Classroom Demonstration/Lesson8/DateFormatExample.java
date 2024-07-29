import java.text.*;
import java.util.*;
class DateFormatExample 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yy G");

		Date dobj = new Date();

		long salary = 100000000;

		DecimalFormat df = new DecimalFormat("$###,###.##");

		System.out.println(sdf.format(dobj));

		System.out.println(df.format(salary));
	}
}
