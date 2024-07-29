/* This program Illustrates the Usage of SubString */

public class SubStringDemo
{
	public static void main(String[] args) 
	{
		String a = "Java is PowerFull.";
        System.out.println(a);
        
		String b = a.substring(5);
		// b is the String "is PowerFull."
		
		System.out.println(b);
		String c = a.substring(5,7);
		// c is the String "is"
		
		System.out.println(c);

		String d = a.substring(5,a.length());
		// d is "is great.
		
		System.out.println(d);
    }
}
