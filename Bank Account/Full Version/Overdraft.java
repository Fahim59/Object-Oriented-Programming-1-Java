public class Overdraft extends Account{
	private double interestRate;
	private double limitAmount=500;
	
	public void setInterestRate(double interestRate){
	this.interestRate=interestRate;}
	
	public double getInterestRate(){
	return this.interestRate;}
	
	public Overdraft(int accId,String accName, String OpeningDate, double balance,double interestRate){
		super(accId,accName,OpeningDate,balance);
		this.interestRate=interestRate;
	}
	
	public void withdraw(double amount){
		if(amount<0){
            System.out.println("\nSorry, you can not withdraw a negative amount.");
		}
        else if (this.getBalance() - amount < -limitAmount){
            System.out.println("\nSorry, this withdrawal would exceed the overdraft limit");
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