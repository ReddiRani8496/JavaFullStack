public class Movie 
{

	private int id;

	private String title;

	private String rating;

	public final static int NO_OF_ACTORS = 200;

	public static int nextMovId;

	static
	{	
		nextMovId = 1000;
		System.out.println(" Hey I am Static Block ");
	}


	public Movie()
	{
		this.id = 1001;
		this.title="Terminator Salvation";
		this.rating="Awesome";
	}

	public Movie(int newId, String newTitle, String newRating)
	{
		this.id = newId;
		this.title = newTitle;
		this.rating = newRating;
	}

	public void sayHi()
	{
		System.out.println(" Say Hi");
	}

	public static void sayHello()
	{
		System.out.println(" Say Hello ");
	}

	public static void accessStaticVarAndStaticMethods()
	{
		System.out.println(nextMovId);
		sayHello();
	}

	public void setId(int newId)
	{
		this.id = newId;
	}

	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}

	public void setRating(String newRating)
	{
		this.rating = newRating;
	}

	public String toString()
	{
		return "Movie Details [ ID  : " + this.id + " Title  : " + this.title + " Rating  : " + this.rating + " UID  : " + this.hashCode()+ " ]";
	}

	public static void main(String args[])
	{
	//	Movie mov1 = new Movie();
	//	System.out.println(mov1);

		Movie mov2 = new Movie(1002,"Transporter 2","Awesome");
		System.out.println(mov2.toString());

		Movie mov3 = new Movie(1003,"HIT" , "Average");
		System.out.println(mov3.toString());
		

		System.out.println(Movie.nextMovId);

		Movie mov1 = new Movie();
		System.out.println(mov1.nextMovId);
	
	}
	
}
