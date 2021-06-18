public class Student{
	public String stuName;
	public Department dept;
	
	public Student(){
	}
	
	public Student(String stuName,Department dept){
		this.stuName=stuName;
		this.dept=dept;
	}
	
	public void setDepartment(Department dept){
		this.dept=dept;
	}
	
	/*public void changeDepartment(Department dept){
		
	}*/
	
	public void semesterFee(int totalCredit){
		dept.calculateSemesterFee(totalCredit);
	}
	
	public void showStudentInfo(){
		System.out.println("\n--- Student Info ---");
		System.out.println("Student Name: " +this.stuName);
		//System.out.println("Department: " +dept.deptName);
	}
}