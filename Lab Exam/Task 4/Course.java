public class Course{
	private String courseName;
	private double credit;
	private String typeOfCourse;
	
	Course(){
	}
	
	Course(String courseName,double credit,String typeOfCourse){
		this.courseName=courseName;
		this.credit=credit;
		this.typeOfCourse=typeOfCourse;
	}
	
	public void setCourseName(String courseName){
		this.courseName=courseName;
	}
	
	public void setCredit(double credit){
	    this.credit=credit;
	}
	
	public void setTypeOfCourse(String typeOfCourse){
		this.typeOfCourse=typeOfCourse;
	}
	
	public String getCourseName(){
		return this.courseName;
	}
	
	public double getCredit(){
	    return this.credit;
	}
	
	public String getTypeOfCourse(){
		return this.typeOfCourse;
	}
	
	public void show(){
		System.out.println(this.courseName +" with credit " +this.credit +" is a " +this.typeOfCourse +" course.");
	}
}
	
	