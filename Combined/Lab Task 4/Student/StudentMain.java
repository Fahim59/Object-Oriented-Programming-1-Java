public class StudentMain{
	public static void main(String args[]){
		Course C1 = new Course("Theory of Computation", "CSC 3113", "Algorithms");
		Course C2 = new Course("Object Oriented Analysis & Design", "CSC 2210", "Introduction to Database");
		Course C3 = new Course("Object Oriented Programming 1", "CSC 2209", "Data Structure");
		Course C4 = new Course("Operating Systems", "CSC 2208", "Computer Organization and Architecture");
		Course C5 = new Course("Basic Graph Theory", "CSC 3119", "Algorithms");
		Course C6 = new Course("Programming Language 2", "CSC 2001", "Programming Language 1");
		
		Student S1 = new Student("Hero Alam", "696969", "CSEEE", 4.01);
		Student S2 = new Student("Shakib Khan", "12345", "EECS", 200);
		
		S1.addCourseWithStudent(C1);
		S1.addCourseWithStudent(C2);
		//S1.addCourseWithStudent(C3);
		
		//S2.addCourseWithStudent(C1);
		//S2.addCourseWithStudent(C5);*/
		
		C1.addStudentWithCourse(S1);
		C1.addStudentWithCourse(S2);
		
		//C2.addStudentWithCourse(S1);
		//C3.addStudentWithCourse(S1);
		
		//C5.addStudentWithCourse(S2);
		
		S1.showCourse();
		//S2.showCourse();
		
		C1.showStudent();
		
		//S1.deleteCourseWithStudent(C1);
		//C1.deleteStudentWithCourse(S2);
		
		//S1.showCourse();
		//S2.showCourse();
		
		//C1.showStudent();
		
	}	
}