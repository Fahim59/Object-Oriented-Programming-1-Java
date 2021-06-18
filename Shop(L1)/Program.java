public class Program{
	public static void main(String[] args){
		Product p1=new Product();
		p1.setproductId(1);
		p1.setproductName("Router");
		p1.setmanufacturerName("MI");
		p1.setprice(1000);
		p1.setavailableQuantity(100);
		p1.viewInformation();
		
		Product p2=new Product(2,"Modem","TP Link",1500,50);
		p2.viewInformations();
		
		
		Employee e1=new Employee();
		e1.setempId("12-1");
		e1.setempName("MD Hasan");
		e1.setsalary(5000);
		e1.setdesignation("Manager");
		e1.viewInformation();
		
		Employee e2=new Employee("13-1","MD Bashir",1000,"CEO");
		e2.viewInformations();
	}
}