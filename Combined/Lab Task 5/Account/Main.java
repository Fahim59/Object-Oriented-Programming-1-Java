public class Main{
	public static void main(String[]args){
		
		Account a1=new Account("Hasan","1234",2500);
		Account a2=new Account("Fahim","5678",3500);
		Account lib=new Account("Library","1122",5000);
		/*a1.deposit(1000);
		a1.deposit(-500);
		a1.Withdraw(2500); 	
        a1.Withdraw(1500);
		
		//a1.transfer(3500,a2);          //insufficient balance
		a1.transfer(500,a2);*/
		
		a1.depositeBook(8);
		a1.payFine(false,lib);
		
		a2.depositeBook(10);
		a2.payFine(true,lib);
		
		/*a2.depositeBook(6);
		a2.payFine(false,lib);*/        //curious mind wants to know :p 
	}
}
		