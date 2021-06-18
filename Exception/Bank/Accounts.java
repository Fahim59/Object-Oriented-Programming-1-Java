import java.util.Scanner;

public class Accounts{
	private String accName;
	private String acID;
	private int balance;
	
	public Accounts()
	{
		
	}
	
	public Accounts(String accName, String acID, int balance)
	{
		this.accName = accName;
		this.acID = acID;
		this.balance = balance;
	}
	
	public void deposit(int amount)
	{
		try{ 
			if(amount == 0)
			{
				throw new ZeroAsException();                     //a new instance of ZeroAsException is created with the default constructor of ZeroAsException
			}
			if(amount < 0)
			{
				throw new NegativeResultException();             //a new instance of NegativeResultException is created with the default constructor of NegativeResultException
			}
			this.balance = this.balance + amount;
			System.out.print("\nA1 Balance: "+this.balance);
		}
		
		catch(ZeroAsException Z){
			
		}
		catch(NegativeResultException N){

		}
	}
	
	public void withdraw(int amount)
	{
		try{
			if(amount == 0)
			{
				throw new ZeroAsException();
			}
			if(amount < 0)
			{
				throw new NegativeResultException();
			}
			this.balance = this.balance - amount;
			System.out.print("\nA2 Balance: "+this.balance);
		}
		
		catch(ZeroAsException Z){
		
		}
		catch(NegativeResultException N){
		
		}
	}
	
	public void transfer(int amount, Accounts receiver)
	{
		try{ 
			if(amount == 0)
			{
				throw new ZeroAsException();                    
			}
			if(amount < 0)
			{
				throw new NegativeResultException();
			}
			this.withdraw(amount);
			receiver.deposit(amount);
		}
		
		catch(ZeroAsException Z){
		
		}
		catch(NegativeResultException N){
		
		}
	}
	
	public static void main(String args[])
	{
		Accounts A1 = new Accounts("Mr. X", "1234", 10000);
		Accounts A2 = new Accounts("Mr. Y", "2345", 5000);
        
		Scanner S1 = new Scanner(System.in);
		
		System.out.print("\nPlease enter a value for A1 to deposit: ");
		A1.deposit(S1.nextInt());
		System.out.print("\nPlease enter a value for A2 to withdraw: ");
		A2.withdraw(S1.nextInt());
		System.out.print("\nPlease enter a value for A1 to transfer to A2: ");
		A1.transfer(S1.nextInt(), A2);
		
		
	}
}