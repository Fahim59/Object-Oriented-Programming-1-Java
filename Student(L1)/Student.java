public class Student{
	public int id;
	public String name;
	public double cgpa;
	
	public void setId(int id){
	this.id=id;}
	
	public void setName(String name){
	this.name=name;}
	
	public void setCgpa(double cgpa){
	this.cgpa=cgpa;}
	
	public int getId(){
	return this.id;}
	
	public String getName(){
	return this.name;}
	
	public double getCgpa(){
	return this.cgpa;}
	
	Student(){
	}
	
	public void viewInformation(){
		System.out.println("Student Information:");
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
		System.out.println("Cgpa:" +cgpa);
	}
}