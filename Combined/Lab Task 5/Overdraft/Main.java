public class Main{
	public static void main(String args[]){
		
		OverdraftAccount a1 = new OverdraftAccount("Overdraft Account","101-01",2500);  
		
		a1.showInformation();
		
		a1.deposit(1000);
		a1.Withdraw(3500);
		
		a1.Withdraw(4000);	
		//a1.showInformation();
	}
}