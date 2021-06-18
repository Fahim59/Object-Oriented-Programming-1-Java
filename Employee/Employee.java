public class Employee{                                                   //defining a class
	public int id;                                                       //field/data member/instance variable
	public String name;                                                  //field/data member/instance variable
	public int salary;                                                   //field/data member/instance variable
	public String designation;                                           //field/data member/instance variable
	
	public void setid(int id){
	this.id=id;}
	public void setname(String name){
	this.name=name;}
	public void setsalary(int salary){
	this.salary=salary;}
	public void setdesignation(String designation){
	this.designation=designation;}
	
	public int getid(){
	return this.id;}
	public String getname(){
	return this.name;}
	public int getsalary(){
	return this.salary;}
	public String getdesignation(){
	return this.designation;}
	
	Employee(){                                                          //default constructor 
	    System.out.println("Default Constructor is created");
	}
	Employee(int id,String name,int salary,String designation){                             //parameterised construstor
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		System.out.println("Non Default Constructor is created");
	}
	
	public void distributeSalary(){
		System.out.println("Basic Salary:" +(salary*0.6));
		System.out.println("House Rent:" +(salary*0.3));
		System.out.println("Medical Fee:" +(salary*0.1));
	}
	
	public void viewInformation(){                                        //method to display the value of id and name
		System.out.println("Employee Information:");
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
		System.out.println("Salary:" +salary);
		System.out.println("Designation:" +designation);
	}
}