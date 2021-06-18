public class Main{
	public static void main(String []args){
		
		Student s1=new Student();
		
		s1.setName("Fahim");
		s1.setId("18-1");
		s1.setDepartment("CSSE");
		s1.setCgpa(3.75);
		
		Student s2=new Student("Shahriar","19-1","SE",3.91);
		
		s1.showInfo();
		s2.showInfo();
		
		System.out.println();
		
		Account a1=new Account("Savings Account","19-90",2500);    
		
		/*System.out.println("\n--- Account Information ---");            //this can be possible if the member variables are public. since there is no set get method and show method we can not print via set get process.  
		System.out.println("Account Name: " +a1.accName);
		System.out.println("Account Id: " +a1.acId);
		System.out.println("Account Balance: " +a1.balance);*/
		
		a1.deposit(1000);
		a1.deposit(-500);
		//a1.checkBalance();
		a1.Withdraw(2500); 
        //a1.checkBalance();		
        a1.Withdraw(1500);  
        //a1.checkBalance();		
		
		Triangle t1=new Triangle(1,1,1);
		t1.showInfo();
		t1.testTriangle();
		
		Triangle t2=new Triangle(1,1,2);
		t2.showInfo();
		t2.testTriangle();
		
		Triangle t3=new Triangle(1,2,3);
		t3.showInfo();
		t3.testTriangle();
	}
}