/* This program is to illustrate the Usage of Continue Statement */
public class ContinueDemo 
{
	public static void main(String args[]) 
	{
		for(int i=0; i<10; i++) 
		{
			System.out.print(i + " ");
			
			// checking for i is even or not. If it is even loop continues without printing a new 6. //line
			
			if (i%2 == 0) continue;
			System.out.println("");
		}
	}
}
