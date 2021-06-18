public class Account{
	protected String accName;
	protected String acId;
	protected int balance;
	
	Account(){
	}
	
	Account(String accName,String acId,int balance){
		this.accName=accName;
		this.acId=acId;
		this.balance=balance;	
	}
	
	public void deposit(int amount){
		if(amount<0){
			System.out.println("Amount can not be negative");
		}
		else{
		balance=balance+amount;
		System.out.println("Deposited Money: " +amount);
		}
	}

	public void Withdraw(int amount){
		if(balance>=amount){
			balance=balance-amount;
			System.out.println("Withdrawal Money: " +amount);
		}
		else
		{ System.out.println("Insifficient Balance");
		}
	}
	/*public void checkBalance(){
		System.out.println("Current Balance:" +balance);
	}*/
	
	
}