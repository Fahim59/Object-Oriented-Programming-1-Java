public class Person{
	protected String name;
	protected String email;
	
	Person(){
	}
	
	Person(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	public void showPerson(){
		System.out.println("\nPrinting Person-----");
		System.out.println("Name: " +name);
		System.out.println("Email: " +email);
		System.out.println("-----------------------");
	}
}