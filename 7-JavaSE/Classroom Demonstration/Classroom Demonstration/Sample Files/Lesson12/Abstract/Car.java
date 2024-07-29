/* <Access Modifier > abstract class <Class Name>
{
		Member Variables
		<Acess Modifier > <Acess Modifier > Datatype Variables;

		public Constructors()
		{

		}

		Concrete Member Functions
		<Acess Modifier > <Acess Modifier > <Return Type> < Function Name>(Parameter List) 
		{
			Defination.....
		}

		Can Include Your Abstract Functions
		<Acess Modifier > abstract <Return Type> < Function Name>(Parameter List);

}
*/

abstract class Vehicle
{
	// Abstract Methods
	 public abstract void start();
	
	 public abstract void stop();
	
	// Concrete Methods
	 public void buy()
	 {
		System.out.println(" Buying a Vehicle");
	 }
	
}

abstract class Motor extends Vehicle
{
		
	public void start()
	{
		System.out.println("starting a vehicle");
	}

	// public abstract void stop();

}

public class Car extends Vehicle
{

	// Method from Vehicle but Defined Here
	
	// Forcable Override
	public void start()
	{
		System.out.println(" Starting a Car");
	}

	// Forcable Override
	public void stop()
	{
		System.out.println(" Stopping a Car");
	}

	// Method of Car Class 
	public void sayHello()
	{
		System.out.println(" Happy Driving ! ");
	}

	// Optional Override
	public void buy()
	{	
		System.out.println(" I am Purchasing a Car ");
	}

	public static void main(String arg[])
  	{
		//Vehicle v1=new Vehicle();
		
		Vehicle v1 = new Car();
		
		//Car v1=new Car();
		
		v1.buy();
		v1.start();
	    v1.sayHello();
		v1.stop();
		
	}
}

