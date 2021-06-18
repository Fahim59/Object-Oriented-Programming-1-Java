public class Student{
	private String name;
	private String id;
	private String department;
	private double CGPA;
	private Course listOfCourses[];
	private int totalCourses;
	
	public Student()
	{
	}
	
	public Student(String name, String id, String department, double CGPA)
	{
		this.name = name;
		this.id = id;
		this.department = department;
		this.CGPA = CGPA;
		this.listOfCourses = new Course[5];
		this.totalCourses = 0;
	}
	
	public void setValues(String name, String id, String department, double CGPA)
	{
		this.name = name;
		this.id = id;
		this.department = department;
		this.CGPA = CGPA;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getID()
	{
		return this.id;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public double getCGPA()
	{
		return this.CGPA;
	}
	
	public void showStudentInfo()
	{
		System.out.print("\nStudent's name:" + this.getName() + "\nStudent's ID: "+ this.getID()+"\nStudent's department: "+this.getDepartment()+"\nStudent's CGPA: "+this.getCGPA());
	}
	
	//---------------------------------------------------UPDATE-----------------------------------------------------------------
	public void addCourseWithStudent(Course C) 
	{
		if(this.totalCourses<5)                
		{
			this.listOfCourses[this.totalCourses] = C;  
			totalCourses++;                             
		}
		else
			System.out.print("\nStudent has reached maximum number of courses possible");
		
		C.addStudentWithoutCourse(this);      
	}
	
	public void addCourseWithoutStudent(Course C) 
	{
		if(this.totalCourses<5)                
		{
			this.listOfCourses[this.totalCourses] = C;  
			totalCourses++;                             
		}
		else
			System.out.print("\nStudent has reached maximum number of courses possible");
	}
	
	public void deleteCourseWithStudent(Course C) 
	{
		System.out.print("\n"+this.name+" has dropped ");
		for(int i=0;i<this.totalCourses;i++)      
		{
			if(this.listOfCourses[i] == C)        
			{
				this.listOfCourses[i] = listOfCourses[totalCourses-1];   
				totalCourses--;                                          
			}
		}
		
		C.deleteStudentWithoutCourse(this);      
	}
	
	public void deleteCourseWithoutStudent(Course C)  
	{
		System.out.print(this.name);
		for(int i=0;i<this.totalCourses;i++)     
		{
			if(this.listOfCourses[i] == C)        
			{
				this.listOfCourses[i] = listOfCourses[totalCourses-1];   
				totalCourses--;                                         
			}
		}
	}
	public void showCourse(){ 
		System.out.print("\nThe courses that "+this.name +" has enrolled for are: ");
		System.out.print("\n--------------------------Course-----------------------------");
		for(int i=0;i<totalCourses;i++)
		{
			listOfCourses[i].showCourseInfo();
			System.out.print("\n");
		}
	}
}