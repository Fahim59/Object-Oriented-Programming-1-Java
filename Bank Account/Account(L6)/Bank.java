public class Bank{
	private String name;
	private SavingsAccount sa;
	private FixedAccount fa;
	
	public void setName(String name){
	this.name=name;}
	
	public void setSavingsAccount(SavingsAccount sa){
	this.sa=sa;}
	
	public void setFixedAccount(FixedAccount fa){
	this.fa=fa;}
	
	public String getName(){
	return this.name;}
	
	public SavingsAccount getSavingsAccount(){
	return this.sa;}
	
	public FixedAccount getFixedAccount(){
	return this.fa;}
	
	Bank(){
	}
}