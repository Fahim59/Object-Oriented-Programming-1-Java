public abstract class Account{
	protected String accName;
	protected int accId;
	private String openingDate;
	protected double balance;
	
	Account(){
	}
	
	Account(int accId,String accName,String openingDate,double balance){
		this.setAccId(accId);
		this.setAccName(accName);
		this.setOpeningDate(openingDate);
		this.setBalance(balance);
	}
	
	public void setAccName(String accName){
		this.accName=accName;
	}
	
	public void setAccId(int accId){
		//this.accId="A-" + accId;
		this.accId=accId;
	}
	
	public void setOpeningDate(String openingDate){
		this.openingDate=openingDate;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public String getAccName(){
		return this.accName;
	}
	
	public int getAccId(){
		return this.accId;
	}
	
	public String getOpeningDate(){
		return this.openingDate;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void deposit(double amount){
		if(amount<0){
			System.out.println("\nDeposited amount can not be negative");
		}
		else{
			this.setBalance(this.getBalance() + amount);
			System.out.println("\nDeposited money to " +accName + "'s account is " +amount);
		}
		//System.out.println("\n" +accName + "'s current balance is " +balance);
	}
	
	public abstract void withdraw(double amount);
	
	/*public void withdraw(double amount){                         //As there is Overdraft method we can not use Withdraw method like this.
		if(amount<0){
			System.out.println("Withdrawal amount can not be negative");
		}
		else if(amount>balance){
			System.out.println("Insufficient Balance");
		}
		else{
			balance=balance-amount;
			System.out.println("Withdrawal money from " +accName + "'s account is " +amount);
		}
	}*/
	
	public void transfer(int amount,Account receiver){
		if(amount<0){
		System.out.println("\nAmount can not be negative");
		}
        else if(balance>=amount){
			withdraw(amount);
			receiver.deposit(amount);
        System.out.println("\n" +accName + " has transfered " +amount + " taka to " +receiver.accName + "'s account" );
		}
        else{
            System.out.println("\nInsufficient Balance");
		}
		
		System.out.println("\n" +accName + "'s current balance is " +balance);
		System.out.println(receiver.accName + "'s current balance is " +receiver.balance);
    }
	
	public void showInformation(){
		System.out.println(this.getAccId());
		System.out.println(this.getAccName());
		System.out.println(this.getOpeningDate());
		System.out.println(this.getBalance());
	}
}