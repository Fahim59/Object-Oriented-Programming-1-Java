public class Account{
	private String accName;
	private String acId;
	private int balance;
	
	private boolean reason;
	private int duration=7;               //assuming a student is allowed to keep book for 7 days
	private int fine;
	private double discount=0.5;          //assuming fine discount 50% for valid reason
	private Account Library;
	
	Account(){
	}
	
	Account(String accName,String acId,int balance){
		this.accName=accName;
		this.acId=acId;
		this.balance=balance;
        //this.reason=reason;
        //this.fine=fine;		
	}
	
	public void deposit(int amount){
		if(amount<0){
			System.out.println("Amount can not be negative");
		}
		else{
		balance=balance+amount;
		System.out.println("Deposited Money to " +accName +"'s account is " +amount);
		}
	}

	public void Withdraw(int amount){
		if(balance>=amount){
			balance=balance-amount;
			System.out.println("\nWithdrawal Money from " +accName + "'s account is " +amount);
		}
		else
		{ 
	        System.out.println("\nInsifficient Balance");
		}
	}
	/*public void checkBalance(){
		System.out.println("Current Balance:" +balance);
	}*/
	
	public void transfer(int amount,Account receiver){
		if(amount<0){
		System.out.println("Amount can not be negative");
		}
        else if(balance>=amount){
			Withdraw(amount);
			receiver.deposit(amount);
        System.out.println("\n" +accName + " has transfered " +amount + " taka to " +receiver.accName + "'s account" );
		}
        else{
            System.out.println("Insufficient Balance");
		}
		System.out.println("\n" +accName + "'s current balance is " +balance);
		System.out.println(receiver.accName + "'s current balance is " +receiver.balance);
    }
	
	public void depositeBook(int days){
		if(days<duration)
		{
			System.out.println("\nBook deposited in time");
		}
		else if(days>=duration)
		{
			fine=(days-duration)*10;
			System.out.println("\nBook returned with late fine " +fine +" Taka" +" for being " +(days-duration)+ " days late");
		}
		else{
		}
	}
		
	public void payFine(boolean reason,Account receiver){
		if(reason==false)
		{
			transfer(fine,receiver);
			System.out.println("Payment by " +this.accName +" has completed");
		}
		else if(reason==true)
		{
            transfer((int)(fine*discount),receiver);
			System.out.println("Payment by " +this.accName +" has completed with discount");
		}
	}			
}