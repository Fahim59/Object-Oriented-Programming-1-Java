public class Course{
	private String courseName;
	private String courseTeacher;
	private String prerequisite;
	private String courseCode;
	private int noOfStudent;
	private boolean courseAvailability;
	
	Course(){
	}
	
	Course(String courseName,String courseTeacher,String prerequisite,String courseCode,int noOfStudent,boolean courseAvailability){
		this.courseName=courseName;
		this.courseTeacher=courseTeacher;
		this.prerequisite=prerequisite;
		this.courseCode=courseCode;
		this.noOfStudent=noOfStudent;
		this.courseAvailability=courseAvailability;
	}
	
	public void showInfo(){
		System.out.println("\n--- Course Information ---");
		System.out.println("Course Name: " +courseName);
		System.out.println("Course Teacher: " +courseTeacher);
		System.out.println("Prerequisite:" +prerequisite);
		System.out.println("Course Code: " +courseCode);
		System.out.println("No of Student: " +noOfStudent);
		
		if(courseAvailability==true){
			System.out.println("Course is available");
		}
		else{
			System.out.println("Course is not available! Try in the next semester");
		}
	}
}