public interface DBMSOperation
{

	public void executeOnDB();

	public default void connectToDB()
	{
		System.out.println(" Connected To DB From Interface ");
	}

}  

