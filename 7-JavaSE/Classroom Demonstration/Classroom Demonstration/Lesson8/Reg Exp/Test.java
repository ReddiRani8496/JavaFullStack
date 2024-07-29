import java.util.*;

class Test 
{
	public static void main(String[] args) 
	{

		Scanner scanObj = new Scanner(System.in);

		System.out.println(" Enter Your Emp ID " );
		int empId = scanObj.nextInt();

		System.out.println(" Enter Your Emp Name ");
		String empName = scanObj.next();

		System.out.println(" Enter Your Salary ");
		float empSal = scanObj.nextFloat();

		System.out.println(empId + "\t" + empName + "\t" + empSal);

	}
}
