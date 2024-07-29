class NewSyntax 
{

	public static void printSummary()
	{
		System.out.println(" Printing ... ");
	}

	public static void main(String[] args) 
	{
		NewSyntax.printSummary();

		NewSyntax::printSummary();
	
	}
}
