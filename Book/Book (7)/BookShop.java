import java.lang.*;
public class BookShop{
	
	private String name;
	//private TextBook textBooks[];
	private Book books[];
	
	public void setBookShopName(String name){
		this.name = name;
	}
	
	public String getBookShopName(){
		return this.name;
	}
	
	BookShop(){}
	
	BookShop(String name, int sizeOfArray){
		this.name = name;
		//this.textBooks = new TextBook[sizeOfArray];
		//this.storyBooks = new StoryBook[sizeOfArray];
		this.books = new Book[sizeOfArray];
	}
	
	public boolean insertBook(Book b){
		for(int i=0; i<books.length;i++){
			if(books[i] == null){
				books[i] = b;
				break;
			}
		}
		return true;
	}
	
	public boolean removeBook(Book b){
		for(int i=0;i<books.length;i++){
			if(books[i] == b){
				books[i] = null;
				break;
			}
		}
		return true;
	}
	
	public Book searchBook(String isbn){
		for(int i=0;i<books.length;i++){
			if(books[i].getIsbn() == isbn){
				return books[i];
			}
		}
		return null;
	}
	
	public void showAllBooks(){
		System.out.println("BookShop Name: " +name);
		for(int i=0;i<books.length;i++){
			if(books[i] != null){
				System.out.println("\n--- Text Book Info ---\n");
				System.out.println("Book ISBN: " +this.books[i].getIsbn());
				System.out.println("Book title " +this.books[i].getBookTitle());
				System.out.println("Book Author Name: " +this.books[i].getAuthorName());
				System.out.println("Book Price: " +this.books[i].getPrice());
				System.out.println("Book Available Quantity: " +this.books[i].getAvailableQuantity());
				//System.out.println("Book Standard: " +this.books[i].getStandard());
			}
		}
	}
    public boolean insertStoryBook(StoryBook sb){
		for(int i=0; i<storyBooks.length;i++){
			if(storyBooks[i] == null){
				storyBooks[i] = sb;
				break;
			}
		}
		return true;
	}
	
	public boolean removeStoryBook(StoryBook sb){
		for(int i=0;i<storyBooks.length;i++){
			if(storyBooks[i] == sb){
				storyBooks[i] = null;
				break;
			}
		}
		return true;
	}
	
	public StoryBook searchStoryBook(String isbn){
		for(int i=0;i<storyBooks.length;i++){
			if(storyBooks[i].getIsbn() == isbn){
				return storyBooks[i];
			}
		}
		return null;
	}
	
	public void showAllStoryBooks() {
		System.out.println("BookShop Name: " +name);
		for(int i=0;i<storyBooks.length;i++){
			if(storyBooks[i] != null){

                System.out.println("\n--- story Book Info ---\n");
				System.out.println("storyBook ISBN: " +this.storyBooks[i].getIsbn());
				 System.out.println("storyBook title: " +this.storyBooks[i].getBookTitle());
				System.out.println("story Book Author Name: " +this.storyBooks[i].getAuthorName());
				System.out.println("story Book Price: " +this.storyBooks[i].getPrice());
				System.out.println("story Book Available Quantity: " +this.storyBooks[i].getAvailableQuantity());
				System.out.println("story Book Standard: " +this.storyBooks[i].getCategory());
			}
		}
	}
}