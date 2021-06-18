public class Main{
	public static void main(String[]args){
		
		Account a1=new Account("Hasan","1234",2500);
		Account a2=new Account("Fahim","5678",3500);
		//Account a3=new Account("Abdullah","0011",0);
		
		a1.deposit(1000);
		a1.deposit(-500);
		a1.Withdraw(2500); 	
        a1.Withdraw(1500);
		
		//a1.transfer(3500,a2);          //insufficient balance
		a1.transfer(500,a2);
		
		Transaction t1=new Transaction(a1,a2,500);
		Transaction t2=new Transaction(a2,a1,1000);
		
		a1.addTransaction(t1);
		a1.showAllTransactions();
		
		a2.addTransaction(t2);
		a2.showAllTransactions();
	}
}