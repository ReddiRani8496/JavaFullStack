import java.util.*;

class ScanDemo 
{
	public static void main(String[] args) 
	{
		Scanner scanRef = new Scanner(System.in);

		System.out.println("Enter Emp Id ");
		int empId = scanRef.nextInt();

		System.out.println("Enter Emp Salary ");
		float empSal = scanRef.nextFloat();

		System.out.println("Enter Emp Name ");
		String empFirstName = scanRef.next();
		String empLastName = scanRef.nextLine();

		String empName = empFirstName + empLastName;
	
		System.out.println(empId + "\t" + empName + "\t" + empSal );
	}
}
