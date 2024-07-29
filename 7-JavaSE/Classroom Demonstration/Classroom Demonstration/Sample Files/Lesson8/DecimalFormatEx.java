
import java.text.*;
class DecimalFormatEx 
{
	public static void main(String[] args) 
	{

		DecimalFormat df = new DecimalFormat("$###,###.##");

		double salary = 1000000000000.343434;

		System.out.println(df.format(salary));
	}
}
