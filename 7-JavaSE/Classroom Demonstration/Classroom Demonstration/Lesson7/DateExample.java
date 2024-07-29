import java.util.*;
import java.text.*;
public class DateExample 
{
	public static void main(String[] args) 
	{
		Date dobj = new Date();


		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yy");
		System.out.println(dobj);

		System.out.println(sdf.format(dobj));
	}
}
