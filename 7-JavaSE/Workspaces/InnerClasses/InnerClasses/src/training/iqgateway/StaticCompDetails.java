package training.iqgateway;

class StaticCompDetails 
{
	// Instance Variables
	private String compName = "IQ Gateway";
	
	// Class Variables
	private static int compLocID = 100;

	// Instance Methods
	public void sayHello()
	{
		System.out.println(" Welcome to " + compName );
	}

	// Class Methods
	public static void Welcome()
	{
		System.out.println(" Welcome to Our Company Hope You Will Enjoy Working with US ");
	}
	
	public void accessInnerDetails()
	{
		Address addr = new Address();
		addr.displayAddress();
		addr.city = "Delhi";
		System.out.println(addr.hashCode());
	}
	
	static class Address
	{
		public String city = " Bangalore";
		public String area = " WhiteField ";
		
		public void displayAddress()
		{
			//System.out.println("Name : "+ compName);
			System.out.println("Area : " + area);
			System.out.println("City : " + city);
			System.out.println(" Location : " + compLocID);
			Welcome();
			//sayHello();
		}
	}
	
	public static void main(String[] args) 
	{

		//CompDetails cdRef = new CompDetails();
		//cdRef.accessInnerDetails();
		
		Address addr = new Address();

		//CompDetails cd = new CompDetails();
		addr.city = "Cochin";
		//System.out.println(addr.hashCode());
		addr.displayAddress();
	}
}
