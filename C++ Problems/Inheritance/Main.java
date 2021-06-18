public class Main{
	public static void main(String args[]){
		
		Person p = new Person("James Bond","example@aiub.edu");
		
		Student s = new Student("James Bond","bond@aiub.edu","00-00000-0","13/01/2015");
		
		Teacher t = new Teacher("Karl Ei","karl@aiub.edu","00-00000-0","13/01/2015");
		
		p.showPerson();
		s.showStudent();
		t.showTeacher();
	}
}