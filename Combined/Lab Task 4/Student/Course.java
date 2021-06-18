public class Course{
	private String courseName;           //Stores the name of the course
	private String courseCode;           //Stores the code of the course
	private String coursePreReq;         //Stores the prerequisite of the course
	public Student listOfStudents[];    //Update: Stores all the student objects who have enrolled for this course
	public int totalStudents;
	
	public Course()
	{
		//Default constructor
	}
	
	public Course(String courseName, String courseCode, String coursePreReq)
	{
		//Parameterized constructor
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.coursePreReq = coursePreReq;
		this.listOfStudents = new Student[30];
		this.totalStudents = 0;
	}
	
	public void showCourseInfo() //Shows all information for a particular course
	{
		System.out.print("\nCourse Name: "+this.courseName+"\nCourse code: "+this.courseCode+"\nCourse Prerequisite: "+this.coursePreReq);		
	}
	
	//---------------------------------------------------UPDATE-----------------------------------------------------------------
	
	public void addStudentWithCourse(Student S)   
	{
		if(this.totalStudents<30)                
		{
			this.listOfStudents[this.totalStudents] = S;  
			totalStudents++;                             
		}
		else
			System.out.print("\nCourse has reached maximum number of students possible");
		
		S.addCourseWithoutStudent(this);       
	}
	
	public void addStudentWithoutCourse(Student S)   
	{
		if(this.totalStudents<30)               
		{
			this.listOfStudents[this.totalStudents] = S; 
			totalStudents++;                            
		}
		else
			System.out.print("\nCourse has reached maximum number of students possible");
	}

	
	public void deleteStudentWithCourse(Student S)  
	{
		System.out.print("\n"+this.courseName+" has been dropped by ");
		for(int i=0;i<this.totalStudents;i++)     
		{
			if(this.listOfStudents[i] == S)        
			{
				this.listOfStudents[i] = listOfStudents[totalStudents-1];   
				totalStudents--;                                           
			}
		}
		
		S.deleteCourseWithoutStudent(this);      
	}
	
	
	public void deleteStudentWithoutCourse(Student S)  
	{
		System.out.print(this.courseName);
		for(int i=0;i<this.totalStudents;i++)      
		{
			if(this.listOfStudents[i] == S)       
			{
				this.listOfStudents[i] = listOfStudents[totalStudents-1];   
				totalStudents--;                                          
			}
		}
	}
	
	public void showStudent() 
	{
		System.out.print("\nThe students that have enrolled for "+this.courseName+ " are: ");
		System.out.print("\n--------------------------Student-----------------------------");
		for(int i=0;i<totalStudents;i++)
		{
			listOfStudents[i].showStudentInfo();
			System.out.print("\n");
		}
	}
}