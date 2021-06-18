public class Employee{                                                   
	public String empId;                                                      
	public String empName;                                                  
	public double salary;                                                   
	public String designation;
	
	public String EmpId;                                                       
	public String EmpName;                                                  
	public double Salary;                                                   
	public String Designation;
	
	public void setempId(String empId){
	this.empId=empId;}
	public void setempName(String empName){
	this.empName=empName;}
	public void setsalary(double salary){
	this.salary=salary;}
	public void setdesignation(String designation){
	this.designation=designation;}
	
	public String getempId(){
	return this.empId;}
	public String getempName(){
	return this.empName;}
	public double getsalary(){
	return this.salary;}
	public String getdesignation(){
	return this.designation;}
	
	
	public void setEmpId(String EmpId){
	this.EmpId=EmpId;}
	public void setEmpName(String EmpName){
	this.EmpName=EmpName;}
	public void setSalary(double Salary){
	this.Salary=Salary;}
	public void setDesignation(String Designation){
	this.Designation=Designation;}
	
	public String getEmpId(){
	return this.EmpId;}
	public String getEmpName(){
	return this.EmpName;}
	public double getSalary(){
	return this.Salary;}
	public String getDesignation(){
	return this.Designation;}
	
	Employee(){                                                           
	}
	Employee(String EmpId,String EmpName,double Salary,String Designation){                             
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.Salary=Salary;
		this.Designation=Designation;
	}
	
	public void viewInformation(){                                        
		System.out.println("Employee Information:");
		System.out.println("ID:" +empId);
		System.out.println("Name:" +empName);
		System.out.println("Salary:" +salary);
		System.out.println("Designation:" +designation);
	}
	
	public void viewInformations(){                                        
		System.out.println("Employee Information:");
		System.out.println("ID:" +EmpId);
		System.out.println("Name:" +EmpName);
		System.out.println("Salary:" +Salary);
		System.out.println("Designation:" +Designation);
	}
}