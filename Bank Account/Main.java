public class Main{
	public static void main(String[] args){
		Account a1=new Account();
        a1.setaccountNumber(12345);
		a1.setname("Mustafizur Rahman");
		a1.setamount(5000);
		a1.display();
		a1.checkBalance();
		a1.deposite(2000);
		a1.checkBalance();
		a1.withdraw(8000);
		a1.checkBalance();
		a1.withdraw(3000);
		a1.checkBalance();
		}
    }