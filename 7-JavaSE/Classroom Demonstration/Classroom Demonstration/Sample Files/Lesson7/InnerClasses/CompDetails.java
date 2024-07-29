public class CompDetails 
{
	// Attributes
	private String compName = "Oracle";
	
	public static int ageLimit = 65;

	// Operations
	public void sayHello()
	{
		System.out.println(" Welcome to " + compName );
	}

	public void accessInnerDetails()
	{
		Address addr = new Address();
		addr.displayAddress();
		System.out.println(addr.city);
	}

	private class Address 
	{
		private String city = " Bangalore";
		private String area = " PTP ";

		public void displayAddress()
		{
			System.out.println("Name : "+ compName);
			System.out.println("Area : " + area);	
			System.out.println("City : " + city);
			System.out.println(ageLimit);
			sayHello();
		}
	}
	
	public static void main(String[] args) 
	{
		CompDetails CD_Obj = new CompDetails();

		Address addrObj = CD_Obj.new Address();

		addrObj.displayAddress();

	}
}
