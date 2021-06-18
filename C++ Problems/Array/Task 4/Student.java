public class Student{
	private String id;
	private String name;
	private int quiz1,quiz2,quiz3;
	private static int objectCount;
	private Student S[];
	
	public Student(String id,String name,int quiz1,int quiz2,int quiz3){
		this.id=id;
		this.name=name;
		this.quiz1=quiz1;
		this.quiz2=quiz2;
		this.quiz3=quiz3;
		
		this.S=new Student[10];
		objectCount++;
	}
	
	public void averageMarks(){
		int average=(quiz1+quiz2+quiz3)/3;
		
		System.out.println("Average marks of the quizes: " +average);
	}
	
	public void showInfo(){
		System.out.println("\nStudent ID: " +id);
		System.out.println("Student Name: " +name);
		System.out.println("Total Student Objects: " +objectCount);
	}
}