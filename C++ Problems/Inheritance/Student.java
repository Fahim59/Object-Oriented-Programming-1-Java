public class Student extends Person{
	private String studentId;
	private String admissionDate;
	
	public Student(){
	}
	
	public Student(String name,String email,String studentId,String admissionDate){
		super(name,email);
		this.studentId=studentId;
		this.admissionDate=admissionDate;
	}
	
	public void showStudent(){
		System.out.println("\nPrinting Student------");
		System.out.println("ID: " +studentId);
		System.out.println("Admission Date: " +admissionDate);
		System.out.println("Name: " +name);
		System.out.println("Email: " +email);
		System.out.println("-----------------------");
	}
}