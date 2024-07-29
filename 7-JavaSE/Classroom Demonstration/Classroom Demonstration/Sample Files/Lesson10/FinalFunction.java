class FinalEx
{
	public void display()
	{
				System.out.println(" Hello ");
	}
}

public class FinalFunction  extends FinalEx
{
	public final int salary;

	public FinalFunction()
	{
		salary=70000;
	} 
	public void Ex()	
	{
			//salary=0;
	}

/*	public void changeSalary()
	{
			salary=0;
	}*/


	public void display()
	{
				System.out.println(" Hello in Derived .... ");
	}

	public static void main(String[] args) 
	{
			FinalFunction obj=new FinalFunction();
			System.out.println(obj.salary);
	}
}
