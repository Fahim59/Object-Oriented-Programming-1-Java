public class Main{
	public static void main(String []args){
		
		Mobile m1= new Mobile("Mustafizur Rahman","+8801686026037",50,"Android",false);
		//m1.showInfo();        //before recharge
		
		m1.callSomeone(15.45);
		m1.recharge(50);
		m1.showInfo();       //after recharge and calling someone
		
		Mobile m2= new Mobile("Fahim Shahriar","+8801521435492",100,"IOS",true);
		//m2.showInfo();
		
		m2.callSomeone(10);
		m2.recharge(30);
		m2.showInfo();
		
		System.out.println("--------------------------------");
		
		Course c1=new Course ("Java","MD Abdur Rahman","Data Structure","CSC 1201",40,true);
		c1.showInfo();
		
		Course c2=new Course ("PL2","MD Abdur Rahim","PL1","CSC 1200",35,false);
		c2.showInfo();
	}
}