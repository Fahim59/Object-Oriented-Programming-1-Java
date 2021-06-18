public class Account{
	protected String accName;
	protected String accId;
	protected int balance;
	
	Account(){
	}
	
	Account(String accName,String accId,int balance){
		this.accName=accName;
		this.accId=accId;
		this.balance=balance;	
	}
	
	public void setAccName(String accName){
		this.accName=accName;
	}
	
	public String getAccName(){
		return this.accName;
	}
	
	public void setBalance(int balance){
		this.balance=balance;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public void deposit(int amount){
		if(amount<0){
			System.out.println("\nAmount can not be negative");
		}
		else{
		balance=balance+amount;
		System.out.println("\nDeposited Money: " +amount);
		}
	}

	public void Withdraw(int amount){
		if(balance>=amount){
			balance=balance-amount;
			System.out.println("\nWithdrawal Money: " +amount);
		}
		else
		{ System.out.println("\nInsifficient Balance");
		}
	}
	/*public void checkBalance(){
		System.out.println("Current Balance:" +balance);
	}*/
	
	public void showInformation(){
		System.out.println("Account type: " +this.accName);
		System.out.println("Account Id: " +this.accId);
		System.out.println("Account Balance: " +this.balance);
	}
}