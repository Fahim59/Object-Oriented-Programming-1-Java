public class Main{
	public static void main(String[]args){
		
		Account a1=new Account("Hasan","1234",2500);
		Account a2=new Account("Fahim","5678",3500);
		
		a1.deposit(1000);
		a1.deposit(-500);
		a1.Withdraw(2500); 	
        a1.Withdraw(1500);
		
		//a1.transfer(3500,a2);          //insufficient balance
		a1.transfer(500,a2);
		
		System.out.println("\n---------------------------------------");
		
		Rectangle r1=new Rectangle(1,1,1,1);
		Rectangle r2=new Rectangle(1,2,1,2);
		Rectangle r3=new Rectangle(1,2,3,4);
		
		r1.check();
		r2.check();
		r3.check();
		
	    System.out.println("\n---------------------------------------");
		
		Book b1=new Book("Data Structure","Jahid Uddin","DS-11","Computer Science",5);
		Book b2=new Book("Intrigal Calculus","Rowshanara Begum","MT-11","Mathematics",6);
		Book b3=new Book("Java","Hasan Rahman","JV-11","Computer Science",7);
		
		b1.addBookCopy(5);
		b1.showInfo();
		
		b2.addBookCopy(6);
		b2.showInfo();
		
		b3.addBookCopy(7);
		b3.showInfo();
		
		Book.showTotalBookInfo();
			
		System.out.println("\n---------------------------------------");
		
		Contract c1=new Contract("Mustafizur Rahman","M-97",21,"+8801686026037",'M');
		Contract c2=new Contract("Fahim Shahriar","M-98",21,"+8801521435492",'M');
		
		c1.showPersonInfo();
		c1.detectMobileOperator();
		
		c2.showPersonInfo();
		c2.detectMobileOperator();
	}
}
		