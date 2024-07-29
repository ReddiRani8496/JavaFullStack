public class Calculation
{
	public int add(int a,int b)
	{
		System.out.println(" Calling Int Combination ");
		return a+b;
	}

	public float add(int a,int b)
	{
		System.out.println(" Calling Float Combination ");
		return (a+b);
	}

	public float add(int a,float b,int c)
	{
		System.out.println(" Calling int and float Combination ");
		return a+b+c;
	}
	
	public double add(double a,double b)
	{
		System.out.println(" Calling from Double  Combination");
		//float x=(float) (a+b);
		return (a+b); 
	}

    
	public static void main(String arg[])  
	{
		Calculation objRef=new Calculation();

		System.out.println(objRef.add(2,3));
		System.out.println(objRef.add(2.3f,2.4f));
		System.out.println(objRef.add(2.6f,3,2));
		System.out.println(objRef.add(23.26,34.35));
	}
}

  







