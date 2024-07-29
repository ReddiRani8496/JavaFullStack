import java.util.Date;
import java.text.*;
public class SimpleDateFormatDemo 
{
	public static void main(String[] args) 
	{
		Date dobj = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy G");

		System.out.println(sdf.format(dobj));

		double salary = 1000000000.34734;

		DecimalFormat df = new DecimalFormat("$###,###.##");

		System.out.println(df.format(salary));
	}
}
