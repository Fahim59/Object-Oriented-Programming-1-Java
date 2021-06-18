public abstract class Department{
	public String deptName;
	public int creditFee;
	public Student[] S;
	public int count=0;
	
	public Department(){
	}
	
	public Department(String deptName,int creditFee){
		this.deptName=deptName;
		this.creditFee=creditFee;
		S= new Student[100];
	}
	
	public void addStudent(Student ob){
		if(count<S.length){
			S[count]=ob;
			count++;
		}
	}
	
	public void showDeptInfo(){
		System.out.println("\n--- Department Info ---");
		System.out.println("Department Name: " +this.deptName);
		
		for(int i=0;i<count;i++){
			S[i].showStudentInfo();
		}
	}
	
	public abstract void calculateSemesterFee(int credit);
}