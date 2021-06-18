public class Main{
	public static void main(String args[]){
		
		Student s1=new Student("101-01","Fahim",20,19,18);
		Student s2=new Student("101-02","Hasan",19,17,18);
		
		s1.showInfo();
		s1.averageMarks();
		
		s2.showInfo();
		s2.averageMarks();
	}
}