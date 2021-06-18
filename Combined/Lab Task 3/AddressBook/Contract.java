public class Contract{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	Contract(){
	}
	
	Contract(String personName,String personId,int age,String mobileNumber,char gender){
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	
	public void showPersonInfo(){
		System.out.println("\n--- Person's contract Info --- ");
		System.out.println("Person Name: " +personName);
		System.out.println("Person Id: " +personId);
		System.out.println("Person Age: " +age);
		System.out.println("Person Mobile Number: " +mobileNumber);
		System.out.println("Person Gender: " +gender);
	}
	
	public void detectMobileOperator(){
		if(mobileNumber.charAt(5)=='1'){
			System.out.println("Mobile Operator is Citycell");
		}
		else if(mobileNumber.charAt(5)=='5'){
			System.out.println("Mobile Operator is Teletalk");
		}
		else if(mobileNumber.charAt(5)=='6'){
			System.out.println("Mobile Operator is Airtel");
		}
		else if(mobileNumber.charAt(5)=='7'){
			System.out.println("Mobile Operator is GrameenPhone");
		}
		else if(mobileNumber.charAt(5)=='9'){
			System.out.println("Mobile Operator is Banglalink");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
}