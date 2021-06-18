public class Start{
	public static void main(String [] args){
		BookShop s1 = new BookShop("Tasmia Store", 100);
		
		Book b1,b2,b3,b4,b5;
		TextBook t1,t2,t3,t4,t5;
		StoryBook u1,u2,u3,u4,u5;
		
		t1 = new TextBook("T-1","Java","Tasmia",500.0,10,4);
		/*t2 = new TextBook("T-2","C#","Tasmia",600.0,15,5);
		t3 = new TextBook("T-3","OS","Tasmia",600.0,15,5);
		t4 = new TextBook("T-4","SE","Tasmia",600.0,15,5);
		t5 = new TextBook("T-5","TOC","Tasmia",600.0,15,5);*/
		
		u1 = new StoryBook("U-1","Java","Tasmia",500.0,10,"CS");
		/*u2 = new StoryBook("U-2","C#","Tasmia",600.0,15,"CS");
		u3 = new StoryBook("U-3","OS","Tasmia",600.0,15,"CS");
		u4 = new StoryBook("U-4","SE","Tasmia",600.0,15,"CS");
		u5 = new StoryBook("U-5","TOC","Tasmia",600.0,15,"CS");*/
		
		b1 = new Book("U-1","Java","Tasmia",500.0,10,"CS");
		b2 = new Book("U-2","C#","Tasmia",600.0,15,"CS");
		b3 = new Book("U-3","OS","Tasmia",600.0,15,"CS");
		b4 = new Book("U-4","SE","Tasmia",600.0,15,"CS");
		b5 = new Book("U-5","TOC","Tasmia",600.0,15,"CS");
		
		/*s1.insertTextBook(t1);
		s1.insertTextBook(t2);
		s1.insertTextBook(t3);
		s1.insertTextBook(t4);
		s1.insertTextBook(t5);
		
		s1.insertStoryBook(u1);
		s1.insertStoryBook(u2);
		s1.insertStoryBook(u3);
		s1.insertStoryBook(u4);
		s1.insertStoryBook(u5);*/
		
		b1.insertBook(t1);
		//s1.insertBook(b1);
		//s1.insertBook(b2);
		//s1.insertBook(b3);
		//s1.insertBook(b4);
		//s1.insertBook(b5);
		
		//s1.showAllTextBooks();
		//s1.showAllStoryBooks();
		s1.showAllBooks();
		
		//s1.searchTextBook("T-1");
		s1.searchBook("T-1");
		
		if(b1!= null)
		{
			System.out.println("\n Book Found");
		}
		else
		{
			System.out.println("\nNot Found");
		}
		
		/*s1.searchStoryBook("U-1");
		
		if(u1!= null)
		{
			System.out.println("\nStory Book Found");
		}
		else
		{
			System.out.println("\nNot Found");
		}*/
		
		/*s1.searchTextBook("T-1").addQuantity(5);
		s1.searchTextBook("T-2").addQuantity(10);
		s1.searchTextBook("T-3").addQuantity(15);
		s1.searchTextBook("T-4").addQuantity(20);
		s1.searchTextBook("T-5").addQuantity(25);
		
		s1.searchStoryBook("U-1").addQuantity(5);
		s1.searchStoryBook("U-2").addQuantity(10);
		s1.searchStoryBook("U-3").addQuantity(15);
		s1.searchStoryBook("U-4").addQuantity(20);
		s1.searchStoryBook("U-5").addQuantity(25);*/
		
		s1.searchBook("T-1").addQuantity(5);
		
		System.out.println("\n--- After Updating ---\n");
		
		//s1.showAllTextBooks();
		//s1.showAllStoryBooks();
		s1.showAllBooks();
		
		/*s1.searchTextBook("T-1").sellQuantity(5);
		s1.searchTextBook("T-2").sellQuantity(5);
		s1.searchTextBook("T-3").sellQuantity(5);
		s1.searchTextBook("T-4").sellQuantity(5);
		s1.searchTextBook("T-5").sellQuantity(5);
		
		s1.searchStoryBook("U-1").sellQuantity(5);
		s1.searchStoryBook("U-2").sellQuantity(5);
		s1.searchStoryBook("U-3").sellQuantity(5);
		s1.searchStoryBook("U-4").sellQuantity(5);
		s1.searchStoryBook("U-5").sellQuantity(5);*/
		
		s1.searchBook("U-1").sellQuantity(5);
		
		System.out.println("\n--- After Updating ---\n");
		
		//s1.showAllTextBooks();
		//s1.showAllStoryBooks();
		
		s1.showAllBooks();
		
		/*s1.removeTextBook(t2);
		s1.removeTextBook(t5);
		
		s1.removeStoryBook(u1);
		s1.removeStoryBook(u4);*/
		s1.removeBook(b2);
		
		System.out.println("\n--- After Updating ---\n");
		
		//s1.showAllTextBooks();
		//s1.showAllStoryBooks();
		
		s1.showAllBooks();
	}
}