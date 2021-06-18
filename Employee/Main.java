public class Main{
	public static void main(String[] args){                                  //creating main method
		Employee e1= new Employee();                                         //creating object  ,, calling def constructor
		e1.setid(18);
		e1.setname("Abdur Rahim");
		e1.setsalary(50000);
		e1.setdesignation("Manager");
		e1.viewInformation();
		e1.distributeSalary();
		
		Employee e2= new Employee(20,"MD Hasan", 45000, "Assistant");
		e2.viewInformation();
		e2.distributeSalary();
	}
}