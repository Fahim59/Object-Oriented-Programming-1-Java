public class SavingsAccount extends Account{
	private double interestRate;
	
	public void setInterestRate(double interestRate){
	this.interestRate=interestRate;}
	
	public double getInterestRate(){
	return this.interestRate;}
	
	SavingsAccount(){
	}
	
	SavingsAccount(double interestRate){
	this.interestRate=interestRate;}
}