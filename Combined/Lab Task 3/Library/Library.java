public class Library{
	private String libName;
	private String libAddress;
	private Book listOfBooks[];
	private int totalBook;
	
	Library(){
	}
	
	Library(String libName,String libAddress){
		this.libName=libName;
		this.libAddress=libAddress;
		this.listOfBooks = new Book[10];
		this.totalBook=0;
	}
	
	public void showLibInfo() 
	{
		System.out.print("\n--------------------Library Information-------------------");
		System.out.print("\nName of Library: "+libName+"\nAddress: "+libAddress); 
		System.out.print("\n----------------------Book Information-------------------");
		for(int i=0;i<totalBook;i++)
		{
			listOfBooks[i].showInfo();
		}
	}
	
	public void addNewBook(Book book){
		for(int i=0;i<listOfBooks.length;i++){
			if(listOfBooks[totalBook]==null){
				listOfBooks[totalBook]=book;
				totalBook++;
				break;
			}
		}
	}
	
	public void deleteBook(Book book)
	{
		for(int i=0;i<totalBook;i++) 
		{
			if(listOfBooks[i]==book) 
			{
				listOfBooks[i]=listOfBooks[totalBook-1]; 
				totalBook--;
				break; 
			}
		}
	}
	
	public void addNewBookCopy(Book book, int copy)
	{
		for(int i=0;i<listOfBooks.length;i++)
		{
			if(listOfBooks[i]==book)
			{
				listOfBooks[i].addBookCopy(copy);
			}
		}
	}
}