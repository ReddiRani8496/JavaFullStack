/* This Program illustrates the Usage of Do While Loop */

public class DoWhileDemo 
{
	public static void main(String args[])
	{
		int i = 10;
		System.out.println(" This illustration leads in Execution of Loop Atleast Once in the cycle even though the condition is False or True ");
		do
			{
				
				System.out.println("Value of i is  " + i);
				// incrementing i
				i++;
				
				// checking for the value of i whether it is less than 10.
				// till the condition satisfies the loop continues. 

			}while(i<10);
	}
}
