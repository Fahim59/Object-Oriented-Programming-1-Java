public class Account{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(String accountNumber){
	this.accountNumber=accountNumber;}
	
	public void setAccountHolderName(String accountHolderName){
	this.accountHolderName=accountHolderName;}
	
	public void setBalance(double balance){
	this.balance=balance;}
	
	public String getAccountNumber(){
	return this.accountNumber;}
	
	public String getAccountHolderName(){
	return this.accountHolderName;}
	
	public double getBalance(){
	return this.balance;}
	
	Account(){
	}
	
	Account(String accountNumber,String accountHolderName,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	public void depositMoney(double amount){
		balance=balance+amount;
		System.out.println("Deposited Money: " +amount);
	}
	
	public void withdrawMoney(double amount){
		if(balance>=amount){
			balance=balance-amount;
			System.out.println("Withdrawal Money: " +amount);
		}
		else
		{ System.out.println("Insifficient Balance");
		}
	}
}