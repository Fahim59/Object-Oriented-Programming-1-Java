import java.lang.*;
public class BookShop{
	
	private String name;
	private TextBook textBooks[];
	private StoryBook storyBooks[];
	
	public void setBookShopName(String name){
		this.name = name;
	}
	
	public String getBookShopName(){
		return this.name;
	}
	
	BookShop(){}
	
	BookShop(String name, int sizeOfArray){
		this.name = name;
		this.textBooks = new TextBook[sizeOfArray];
		this.storyBooks = new StoryBook[sizeOfArray];
	}
	
	public boolean insertTextBook(TextBook tb){
		for(int i=0; i<textBooks.length;i++){
			if(textBooks[i] == null){
				textBooks[i] = tb;
				break;
			}
		}
		return true;
	}
	
	public boolean removeTextBook(TextBook tb){
		for(int i=0;i<textBooks.length;i++){
			if(textBooks[i] == tb){
				textBooks[i] = null;
				break;
			}
		}
		return true;
	}
	
	public TextBook searchTextBook(String isbn){
		for(int i=0;i<textBooks.length;i++){
			if(textBooks[i].getIsbn() == isbn){
				return textBooks[i];
			}
		}
		return null;
	}
	
	public void showAllTextBooks(){
		System.out.println("BookShop Name: " +name);
		for(int i=0;i<textBooks.length;i++){
			if(textBooks[i] != null){
				System.out.println("\n--- Text Book Info ---\n");
				System.out.println("TextBook ISBN: " +this.textBooks[i].getIsbn());
				System.out.println("TexBook title " +this.textBooks[i].getBookTitle());
				System.out.println("Text Book Author Name: " +this.textBooks[i].getAuthorName());
				System.out.println("Text Book Price: " +this.textBooks[i].getPrice());
				System.out.println("Text Book Available Quantity: " +this.textBooks[i].getAvailableQuantity());
				System.out.println("Text Book Standard: " +this.textBooks[i].getStandard());
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