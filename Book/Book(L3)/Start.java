public class Start{
	public static void main(String [] args){
		StoryBook s1 = new StoryBook();
		
		s1.setIsbn("123-456-55-433");
		s1.setBookTitle("Java");
		s1.setAuthorName("Tasmia");
		s1.setPrice(500);
		s1.setAvaiableQuantity(5);
		s1.setCategory("CS");
		StoryBook.setDiscountRate(5);
		
		s1.showDetails();
		
		s1.addQuantity(5);
		s1.sellQuantity(3);
		
		s1.showDetails();
		
		StoryBook s2 = new StoryBook("453-456-77-455","Device","Printhu",1000,6,"EEE");
		
		s2.setDiscountRate(10);
		
		s2.showDetails();
		
		s2.addQuantity(5);
		s2.sellQuantity(3);
		
		s2.showDetails();
		
		////////////////////////////////
		TextBook t1 = new TextBook();
		
		t1.setIsbn("123-456-55-433");
		t1.setBookTitle("Java");
		t1.setAuthorName("Tasmia");
		t1.setPrice(500);
		t1.setAvaiableQuantity(5);
		t1.setStandard(5);
		TextBook.setDiscountRate(5);
		
		t1.showDetails();
		
		t1.addQuantity(5);
		t1.sellQuantity(3);
		
		t1.showDetails();
		
		TextBook t2 = new TextBook("453-456-77-455","Device","Printhu",1000,6,10);
		
		t2.setDiscountRate(10);
		
		t2.showDetails();
		
		t2.addQuantity(5);
		t2.sellQuantity(3);
		
		t2.showDetails();
	}
}