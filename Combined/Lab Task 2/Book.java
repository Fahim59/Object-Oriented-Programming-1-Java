public class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	private static int bookCounter;
	
	Book(){
		bookCounter++;
	}
	
	Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy){
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		bookCounter++;
	}
	
	public void showInfo(){
		System.out.println("\n--- Book Information ---");
		System.out.println("Book Name: " +bookName);
		System.out.println("Book Author: " +bookAuthor);
		System.out.println("Book Id: " +bookId);
		System.out.println("Book Type: " +bookType);
		System.out.println("Book Copy: " +bookCopy);
	}
	
	public void addBookCopy(int x){
		bookCopy=bookCopy + x;
	}
	
	public static void showTotalBookInfo(){
		System.out.println("\nTotal Book Objects: " +bookCounter);
	}
}