public class Teacher extends Person{
	private String employeeId;
	private String joiningDate;
	
	public Teacher(){
	}
	
	public Teacher(String name,String email,String employeeId,String joiningDate){
		super(name,email);
		this.employeeId=employeeId;
		this.joiningDate=joiningDate;
	}
	
	public void showTeacher(){
		System.out.println("\nPrinting Teacher------");
		System.out.println("ID: " +employeeId);
		System.out.println("Joining Date: " +joiningDate);
		System.out.println("Name: " +name);
		System.out.println("Email: " +email);
		System.out.println("-----------------------");
	}
}