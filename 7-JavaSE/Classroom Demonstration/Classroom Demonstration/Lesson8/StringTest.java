class  StringTest
{
	public static void main(String[] args) 
	{
		String s1 = "Robert ";
		String s2 = "Bosch";

		System.out.println(s1 + "\t " + s1.hashCode());
		System.out.println(s2 + "\t " + s2.hashCode());
	
		s1 = s1 + s2;
		System.out.println(" After Concatenation ");
		System.out.println(s1 + "\t " + s1.hashCode());
		System.out.println(s2 + "\t " + s2.hashCode());
		

		String s = new String("Friday");

		if (s == "Friday")
		{
			System.out.println("Equal A");
		}
		if(s.equals("Friday"))
		{
			System.out.println("Equal B");
		}











		

	}
}
