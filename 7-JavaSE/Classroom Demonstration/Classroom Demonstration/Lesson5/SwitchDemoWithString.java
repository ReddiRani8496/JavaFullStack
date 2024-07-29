public class SwitchDemoWithString
{
	public static void main(String args[])
	{
		String month = "JUL";
		int noOfDaysInMonth = 0;
		
		switch (month) 
		{
		  case "JAN":
			 noOfDaysInMonth=31;
			 break;

		  case "FEB":
			 noOfDaysInMonth=28;
			 break;

		  case "MAR":
			 noOfDaysInMonth=31;
			 break;
			 
		  case "APR":
			 noOfDaysInMonth=30;
			 break;
			 
		  case "MAY":
			 noOfDaysInMonth=31;
			 break;
		 
		  case "JUN":
			 noOfDaysInMonth=30;
			 break;
		  
		   case "JUL":
			 noOfDaysInMonth=31;
			 break;

		  case "AUG":
			 noOfDaysInMonth=31;
			 break;

		  case "SEP":
			 noOfDaysInMonth=30;
			 break;
			 
		  case "OCT":
			 noOfDaysInMonth=31;
			 break;
			 
		  case "NOV":
			 noOfDaysInMonth=30;
			 break;
		 
		  case "DEC":
			 noOfDaysInMonth=31;
			 break;
			 
		  default:
			 System.out.println("Invalid Month");
			 break;
		  
		}
		
		System.out.println(" No of Days in Month : " + noOfDaysInMonth );
	}
}