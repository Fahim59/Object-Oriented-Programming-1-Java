public class Current extends Account{
	private double interestRate;
	
	public void setInterestRate(double interestRate){
	this.interestRate=interestRate;}
	
	public double getInterestRate(){
	return this.interestRate;}
	
	public void setAccId(int accId){
		//this.accId="A-" +accId+ "-C";
		this.accId=accId;
	}
	
	public Current(int accId,String accName, String OpeningDate, double balance,double interestRate){
		super(accId,accName,OpeningDate,balance);
		this.interestRate=interestRate;
	}
	
	public void withdraw(double amount){
		if(amount<0){
			System.out.println("\nWithdrawal amount can not be negative");
		}
		else if(amount>this.getBalance()){
			System.out.println("\nInsufficient Balance");
		}
		else{
			this.setBalance(this.getBalance() - amount);
			System.out.println("\nWithdrawal money from " +this.getAccName() + "'s account is " +amount);
		}
		
		//System.out.println("\n" +accName + "'s current balance is " +balance);
	}
	
	public void showInformation(){
		super.showInformation();
		System.out.println(this.getInterestRate());
	}
}
	
	