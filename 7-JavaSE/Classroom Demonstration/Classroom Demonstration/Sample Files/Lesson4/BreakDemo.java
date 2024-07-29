/* This Program is to Illustrate the Usage of Break Statement */

public class BreakDemo 
{
		public static void main(String[] args) 
		{
			int[] array = { 1,2,3,4,5,6,7,8 };
			int search = 7;
			int i;
			boolean found = false;
			
			for (i=0 ; i < array.length; i++) 
			{
				if (array[i] == search)
				{
					found = true;
					 // if the condition is true then the break statement will execute and will exit from 
					break;
				}
			}

			if (found) 
			{
				 // displaying the search result if found id true 
					System.out.println("Found " + search + " at index " + i);
			} 
			else
			{
				 // if the previous condition is not satisfied the else statement will get executed
					System.out.println(search + "not in the array");
			}
		}
}
