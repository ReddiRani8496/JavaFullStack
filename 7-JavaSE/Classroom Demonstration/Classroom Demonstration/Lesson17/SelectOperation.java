class SelectOperation implements DBMSOperation 
{
	public void executeOnDB()
	{
		System.out.println(" SELECT ");
	}

	public static void main(String args[])
	{
		DBMSOperation obj = new SelectOperation();
		obj.executeOnDB();

		obj.connectToDB();

	}
}
