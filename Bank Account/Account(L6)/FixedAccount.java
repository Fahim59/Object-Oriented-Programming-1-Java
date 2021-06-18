public class FixedAccount extends Account{
	private int tenureYear;
	
	public void setTenureYear(int tenureYear){
	this.tenureYear=tenureYear;}
	
	public int getTenureYear(){
	return this.tenureYear;}
	
	FixedAccount(){
	}
	
	FixedAccount(int tenureYear){
	this.tenureYear=tenureYear;}
}