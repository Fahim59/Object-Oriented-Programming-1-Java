public class Book{
	private String bookId;
	private String bookTitle;
	private String authorName;
	private int publicationYear;
	
	public void setBookId(String bookId){
	this.bookId=bookId;}
	
	public void setBookTitle(String bookTitle){
	this.bookTitle=bookTitle;}
	
	public void setAuthorName(String authorName){
	this.authorName=authorName;}
	
	public void setPublicationYear(int publicationYear){
	this.publicationYear=publicationYear;}
	
	public String getBookId(){
	return this.bookId;}
	
	public String getBookTitle(){
	return this.bookTitle;}
	
	public String getAuthorName(){
	return this.authorName;}
	
	public int getPublicationYear(){
	return this.publicationYear;}
	
	Book(){
	}
	
	Book(String bookId,String bookTitle,String authorName,int publicationYear){
		this.bookId=bookId;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.publicationYear=publicationYear;
	}
	
	public void showDetails(){
		System.out.println("Book Details:");
		System.out.println("Book Id" +bookId);
		System.out.println("Book Title:" +bookTitle);
		System.out.println("Book Author:" +authorName);
		System.out.println("Publication Year:" +publicationYear);
		System.out.println("----------------");
	}
}