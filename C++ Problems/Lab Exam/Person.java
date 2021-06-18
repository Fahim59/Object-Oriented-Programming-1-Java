public class Person{
	protected String name;
	protected String mobileNumber;
	
	public Person(){
	}
	
	public Person(String name,String mobileNumber){
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void detectMobileOperator(){
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
	}
	
	/*public void print(){
		System.out.println("\nAccount Name: " +name);
		//System.out.println("Account Balance: " +balance);
		System.out.println("Mobile Number: " +mobileNumber);
	}*/
}