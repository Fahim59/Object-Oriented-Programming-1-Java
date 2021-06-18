public class Main{
	public static void main(String args[]){
		Library l1=new Library("Adarsha Library","Khilgaon,Dhaka");
		
		Book b1=new Book("Data Structure","Jahid Uddin Ahmed","101-A","Education",10);
		Book b2=new Book("Algorithm","Manzurul Hasan","102-B","Education",15);
		Book b3=new Book("Java","Mohaimen Noor","103-C","Education",5);
		
		l1.addNewBook(b1);
		l1.addNewBook(b2);
		l1.addNewBook(b3);
		
		l1.showLibInfo();
		
		l1.deleteBook(b1);
		
		l1.showLibInfo();
		
		l1.addNewBookCopy(b2,5);
		
		l1.showLibInfo();
	}
}