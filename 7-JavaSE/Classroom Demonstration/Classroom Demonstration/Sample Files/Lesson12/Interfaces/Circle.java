interface Shape
{
	void draw();
	void erase();
	void describe();
	void showDetails(int i);
}

interface MathObject
{
	void showDetails();
}

public class Circle implements Shape , MathObject
{
	public void draw()
	{
		System.out.println(" Drawing a circle ");
	}

	public void erase()
	{
		System.out.println(" Erase a circle");
	}
	
	public void describe()
	{
		System.out.println(" This Shape is a Circle ");
	}

	public void showDetails()
	{
		System.out.println(" Hey I am Show Details ");
	}

	public void showDetails(int i)
	{
		System.out.println(" Hey I am Show Details ");
	}

	// Method From Circle..
	public  void sayHello()
	{
		System.out.println(" Hello Everyone, Cirlce Welcomes U ");
	}
	
	public static void main(String arg[])
	{
		
		//Shape c1 = new Shape();

		//Circle c1=new Circle();

		Shape c1 = new Circle();

		c1.draw();
		c1.erase();
		c1.sayHello();
		c1.showDetails();
		c1.describe();
	}
}