public class StoryBook{
	public String isbn;
	public String bookTitle;
	public String authorName;
	public double price;
	public int availableQuantity;
	public String category;
	protected static double discountRate;
	
	public StoryBook(){}
	public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category)
	{
		this. isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.category = category;
	}
	
	public void setIsbn(String isbn)
	{
		this. isbn = isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this. authorName = authorName;
	}
	public void setPrice(double price)
	{
		this. price = price;
	}
	public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public static void setDiscountRate(double rate)
	{
		discountRate = rate;
	}
	
	public String getIsbn()
	{
		return this.isbn;
	}
	public String getBookTitle()
	{
		return this.bookTitle;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	public int getAvailableQuantity()
	{
		return this.availableQuantity;
	}
	public String getCategory()
	{
		return this.category;
	}
	public static double getDiscountRate()
	{
		return discountRate;
	}
	
	public void addQuantity(int amount)
	{
		this.availableQuantity += amount;
	}
	public void sellQuantity(int amount)
	{
		this.availableQuantity -= amount;
	}
	
	public void showDetails()
	{
		System.out.println("Book Details\n");
		System.out.println("ISBN: " +this.isbn);
		System.out.println("Book Title: " +this.bookTitle);
		System.out.println("Author Name: " +this.authorName);
		System.out.println("Price: " +this.price);
		System.out.println("Available Quantity: " +this.availableQuantity);
		System.out.println("Category: " +this.category);
		System.out.println("Discount Rate: " +this.discountRate);
	}
}