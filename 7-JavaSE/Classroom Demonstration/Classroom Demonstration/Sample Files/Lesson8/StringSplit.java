public class StringSplit 
{
	public static void main(String[] args) 
	{
		String shirts = "Blue Shirt, Red Shirt, Black Shirt, White Shirt ";

		String results[] = shirts.split(", ");

		for(String tempRes : results)
		{
			System.out.println(tempRes);
		}
	}
}
