public class Start{
	public static void main(String[]args){
		
		Book b1=new Book("10-1","Let us C","Shahrin Chowdhury",2007);
		Book b2=new Book("10-2","Data Structure","Zahid Uddin Ahmed",2008);
		Book b3=new Book("10-3","Theory of Computation","Tohedul Islam",2010);
		Book b4=new Book("10-4","Algorithm","Manzurul Hasan",2003);
		
		Book bookList[]=new Book[5];    //Syntax=class object[]=new class[length]
		
		bookList[0]=b1;                //assigning objects in the array
		bookList[1]=b2;
		bookList[2]=b3;
		bookList[3]=b4;
		
		for(int i=0;i<bookList.length;i++)   //printing details
		{if(bookList[i]!=null)
			{bookList[i].showDetails();
			}
		}
		
		bookList[2]=null;              //assigning null value
		
		for(int i=0;i<bookList.length;i++)    //printing after assigning null value
		{if(bookList[i]!=null)
			{bookList[i].showDetails();
			}
		}
	}
}