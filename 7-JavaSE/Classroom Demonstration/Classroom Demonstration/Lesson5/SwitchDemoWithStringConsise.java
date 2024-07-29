public class SwitchDemoWithStringConsise
{
	public static void main(String args[])
	{
		String month = "JUL";
		int noOfDaysInMonth = 0;
		
		switch (month) 
		{
		  case "JAN":
		  case "MAR":
		  case "MAY":
		  case "JUL":
		  case "AUG":
		  case "OCT":
		  case "DEC":
			 noOfDaysInMonth=31;
			 break;

		  case "FEB":
			 noOfDaysInMonth=28;
			 break;

		  case "APR":
		  case "JUN":
		  case "SEP":
		  case "NOV":
			 noOfDaysInMonth=30;
			 break;
			 
		  default:
			 System.out.println("Invalid Month");
			 break;
		  
		}
		
		System.out.println(" No of Days in Month : " + noOfDaysInMonth );
	}
}