public class Student{
	private String name;
	private String id;
	private String department;
	private double cgpa;
	
	Student(){
		System.out.println("Empty Constructor");
	}
	
	Student(String name,String id,String department,double cgpa){
		this.name=name;
		this.id=id;
		this.department=department;
		this.cgpa=cgpa;
		
		System.out.println("Valued Constructor");
	}
	
	public void setName(String name){
	this.name=name;}
	
	public void setId(String id){
	this.id=id;}
	
	public void setDepartment(String department){
	this.department=department;}
	
	public void setCgpa(double cgpa){
	this.cgpa=cgpa;}
	
	public String getName(){
	return this.name;}
	
	public String getId(){
	return this.id;}
	
	public String getDepartment(){
	return this.department;}
	
	public double getCgpa(){
	return this.cgpa;}
	
	public void showInfo(){
		System.out.println("\n--- Student Information ---");
		System.out.println();
		
		System.out.println("Student Name: " +name);
		System.out.println("Student Id: " +id);
		System.out.println("Student Department: " +department);
		System.out.println("Student Cgpa: " +cgpa);
	}
}
		