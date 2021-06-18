import java.lang.*;

public class StoryBook extends Book
{
	private String category;
	
	public StoryBook()
	{
		super();
		System.out.println("Empty Story book");
	}
	
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity, String category)
	{
		super(isbn, bookTitle, authorName, price, avaiableQuantity);
		System.out.println("parameter storybook");
		this.category = category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	}
}
	