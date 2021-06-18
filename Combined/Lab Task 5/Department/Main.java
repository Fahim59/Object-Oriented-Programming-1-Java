public class Main{
	public static void main(String args[]){
		Department d1,d2,d3;
		
		d1 = new CS("CS",5500);
		d2 = new EEE("EEE",5500);
		d3 = new BBA("BBA",5500);
		
		Student S1 = new Student("Fahim",d1);
		Student S2 = new Student("Shahriar",d2);
		Student S3 = new Student("Hasan",d3);
		
		//S1.showStudentInfo();
		
		d1.addStudent(S1);
		d2.addStudent(S2);
		d3.addStudent(S3);
		
		d1.showDeptInfo();
		d1.calculateSemesterFee(148);
		
		d2.showDeptInfo();
		d2.calculateSemesterFee(142);
		
		d3.showDeptInfo();
		d3.calculateSemesterFee(130);
	}
}
		