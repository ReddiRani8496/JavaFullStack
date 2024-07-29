/* This Program illustrates the Usage of If Else */

public class IfElseIfDemo 
{
	public static void main(String[] args) 
	{
		int marks = 96;
		String rating;
		
		if (marks >= 90)
		{
			rating = "Distinction Class";
		}
		else if (marks >= 80) 
		{
			rating = "First Class";
		} 
		else if (marks >= 70)
		{
			rating = "Second Class";
		} 
		else if (marks >= 60)
		{
			rating = "Pass Class";
		}
		else
		{
			rating = "Fail";
		}

		System.out.println("Rating = " + rating);
	}
}
