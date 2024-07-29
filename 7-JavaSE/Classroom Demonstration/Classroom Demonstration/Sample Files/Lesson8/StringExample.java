/* This Program illustrates the usage of String */

public class StringExample
{

	public static void main(String args[])
	{
		String s = new String();
		// creates an empty string.

		String s = new String(String value);
		// initializes the String object value to the
		// value described in the parentheses.

		char chars[] = { 'a', 'b', 'c' };
		// initializing char array

		String s = new String(chars);
		// initializes a string by an array of characters.

		char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		
		String s = new String(chars, 2, 3); 
		//initializing string with some elements of char array.
	}
}