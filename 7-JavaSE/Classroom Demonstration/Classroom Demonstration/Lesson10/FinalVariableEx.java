public class FinalVariableEx 
{
	// <AS> <AM> <DT> <VN>
	public static final int SALARY=1000000;

	public FinalVariableEx()
	{
    	SALARY=700000;
	} 
	
	public FinalVariableEx(String name)
	{
		this();
    	SALARY=800000;
	}

	public void Ex()	
	{
		SALARY=600000;
	}

	public void changeSalary()
	{
		SALARY=500000;
	}


	public static void main(String[] args) 
	{
			FinalVariableEx obj=new FinalVariableEx();
			System.out.println(obj.SALARY);

			obj.SALARY=800000;
	}
}
