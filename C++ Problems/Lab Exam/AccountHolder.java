public class AccountHolder extends Person{
	//private String name;
	private double balance;
	//private String mobileNumber;
	private AccountHolder AH[];
	
	public AccountHolder(){
	}
	
	public AccountHolder(String name,double balance,String mobileNumber){
		super(name,mobileNumber);
		//this.name=name;
		this.balance=balance;
		//this.mobileNumber=mobileNumber;
		this.AH=new AccountHolder[5];
	}
	
	/*public void setName(String name){
		this.name=name;
	}*/
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	/*public String getName(){
		return this.name;
	}*/
	
	public double getBalance(){
		return this.balance;
	}
	
	/*public void detectMobileOperator(){
		if(mobileNumber.charAt(2)=='1'){
			System.out.println("Mobile Operator is Citycell");
		}
		else if(mobileNumber.charAt(2)=='5'){
			System.out.println("Mobile Operator is Teletalk");
		}
		else if(mobileNumber.charAt(2)=='6'){
			System.out.println("Mobile Operator is Airtel");
		}
		else if(mobileNumber.charAt(2)=='7'){
			System.out.println("Mobile Operator is GrameenPhone");
		}
		else if(mobileNumber.charAt(2)=='9'){
			System.out.println("Mobile Operator is Banglalink");
		}
		else{
			System.out.println("Invalid Number");
		}
	}*/
	
	public void print(){
		System.out.println("\nAccount Name: " +name);
		System.out.println("Account Balance: " +balance);
		System.out.println("Mobile Number: " +mobileNumber);
	}
}