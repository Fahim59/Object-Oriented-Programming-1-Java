public class Account{
	public int accountNumber;
	public String name;
	public double amount;
	
	Account(){
		
	}
	
	public void setaccountNumber(int an){
		accountNumber=an;
	}
	public void setname(String n){
		name=n;
	}
	public void setamount(double a){
		amount=a;
	}
	
	public int getaccountNumber(){
		return accountNumber;
	}
	public String getname(){
		return name;
	}
	public double getamount(){
		return amount;
	}
	
	public void deposite(double depAmount){
		amount=amount+depAmount;
		System.out.println(depAmount+ "Deposited");
	}
	public void withdraw(double witAmount){
		if(amount<witAmount){
		System.out.println("Insufficient Balance");
		}
			else{
			amount=amount-witAmount;
			System.out.println(witAmount+ "Withdrawn");
			}
		}
	public void checkBalance(){
		System.out.println("Current Balance:" +amount);
	}
	public void display(){
		System.out.println(accountNumber+" "+name+" "+amount);
	}
}