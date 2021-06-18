import java.lang.*;

public class TextBook extends Book
{
	private int standard;
	
	public TextBook()
	{
		super();
	}
	
	public TextBook(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity, int standard)
	{
		super(isbn, bookTitle, authorName, price, avaiableQuantity);
		this.standard = standard;
	}
	
	public void setStandard(int standard)
	{
		this.standard = standard;
	}
	
	public int getStandard()
	{
		return standard;
	}
}