public class NestedIf
{
	public static void main(String args[])
	{
		int speed = 50;
		
		if (speed >= 25) 
		{
			if (speed > 65)
			{
				System.out.println("Speed over 65");
			}
			else
			{
				System.out.println("Speed >= 25 but <= 65");
			}
		}
		else
		{
			System.out.println("Speed under 25");
		}
	}
}