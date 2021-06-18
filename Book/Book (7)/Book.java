import java.lang.*;

public class Book
{
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	protected double price;
	protected int availableQuantity;
	
	public Book()
	{ System.out.println("empty");}
	
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		System.out.println("Parameterized");
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
	}
	
	public void setIsbn(String isbn)
	{ 
	    this.isbn=isbn;
	}
	
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvaiableQuantity(int avaiableQuantity)
	{
		this.availableQuantity = avaiableQuantity;
	}
	public String getIsbn()
	    { return isbn; }
	public String getBookTitle()
		{ return bookTitle; }
	public String getAuthorName()
		{ return authorName; }
	public double getPrice()
		{ return price; }
	public int getAvailableQuantity()
		{ return availableQuantity; }
		
	public void addQuantity(int amount)
	{ availableQuantity=availableQuantity+amount;}
	public void sellQuantity(int amount)
	{availableQuantity=availableQuantity-amount ; }	
		
		public void showDetails()
		{
			System.out.println("ISBN: "+ isbn);
			System.out.println("Book Title: "+bookTitle);
			System.out.println("Author Name: "+authorName);
			System.out.println("Price: "+price);
			System.out.println("Available Quantity: "+availableQuantity);
		}
}	
		

