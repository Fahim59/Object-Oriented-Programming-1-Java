public class Account{
	private String accName;
	private String acId;
	private int balance;
	
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
		System.out.println("Deposited Money to " +accName +"'s account is " +amount);
		}
	}

	public void Withdraw(int amount){
		if(balance>=amount){
			balance=balance-amount;
			System.out.println("\nWithdrawal Money from " +accName + "'s account is " +amount);
		}
		else
		{ System.out.println("\nInsifficient Balance");
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
}