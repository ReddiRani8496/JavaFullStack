/**
 *	Movie class is meant to Store Movie Details
 */
public class Movie 
{
	
	/**
	 *  ID Attribute is used to Store Id of the Movie
	 */
	public int id;

	/**
	 *  Title Attribute is Used to Store Title of Movie
	 */
	private String title;

	private String rating;

	/**
	 *  setID Method modifies the Id of the Movie
	 */
	public void setId(int newId)
	{
		this.id = newId;
	}

	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}

	public String getTitle()
	{
		return this.title;
	}
		
}
