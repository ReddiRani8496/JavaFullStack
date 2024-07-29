/* This Program illustrates the Usage of Switch Case */

public class SwitchDemo 
{
	public static void main(String args[])
	{
		
		for(float i=0.0F; i<6.0F; i++)
		{
			switch(i)
			{
				case 0:
					System.out.println("i value is Zero.\n ");
					break;

				case 1:
					System.out.println("i value is One.\n ");
					break;

				case 2:
					System.out.println("i value is Two.\n ");
					break;

				case 3:
					System.out.println("i value is Three.\n ");
					break;

				default:
					System.out.println("i is greater than 3.\n ");
			}
		}
	}
}
