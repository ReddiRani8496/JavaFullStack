public class AppEntry 
{
	public static void main(String[] args) 
	{
		Movie mov1 = new Movie();
		System.out.println(mov1.id);
		mov1.setTitle("Transporter 2 ");
		System.out.println(mov1.getTitle());
	}
}
