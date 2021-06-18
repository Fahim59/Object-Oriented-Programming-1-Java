public class OverdraftAccount extends Account{
	private int limitAmount=500;
	
	public OverdraftAccount(){
	}
	
	public OverdraftAccount(String accName,String accId,int balance){
		super(accName,accId,balance);
	}
	
	public void Withdraw(int amount){
		if(amount<0){
            System.out.println("\nSorry, you can not withdraw a negative amount.");
		}
		else if (this.balance - amount < -limitAmount){
            System.out.println("\nSorry, this withdrawal would exceed the overdraft limit");
		}
        else{
            this.balance = (this.balance - amount);
			System.out.println("\nWithdrawal money from " +this.getAccName() + "'s account is " +amount);
			System.out.println(balance);
		}
		
		//System.out.println("\n" +accName + "'s current balance is " +balance);
		//System.out.println(balance);
	}
	
	/*public override void Withdraw(int amount)
		{
			if(amount < 0)
            {
                Console.WriteLine("\nCannot Withdraw,Invalid Or Insufficient Amount...");
            }
            else if(this.balance >= amount)
            {
                Console.WriteLine("\nPrevious Balance was: " + balance);
                Console.WriteLine(+amount + " $ Withdrawn...");

                this.balance = (this.balance - amount);

                Console.WriteLine("\nAvailable balance: " + this.balance);
                Console.WriteLine("\nExtra Limit: " + creditLimit);
            }
            else
            {
                int x = amount - this.balance;

                if (x <= this.creditLimit)
                {
                    this.balance = 0;
                    this.creditLimit -= x;
                    Console.WriteLine("\nAvailable Balance: " + balance);
                    Console.WriteLine("\nRemaining extra limit: " + creditLimit);
                }
                else
                {
                    Console.WriteLine("\nSorry, this withdrawal would exceed the overdraft limit");
                }
            }
		}*/
	
	/*public void Withdraw(int amount){
		if(balance>=amount){
			balance=balance-amount;
			System.out.println("Withdrawal Money: " +amount);
		}
		else
		{ System.out.println("Insifficient Balance");
		}
	}*/
	
	public void showInformation(){
		super.showInformation();
	}
}