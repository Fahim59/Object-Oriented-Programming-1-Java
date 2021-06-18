public class Start{
	public static void main(String[] args){
		Pizza p1=new Pizza();
			p1.setSize("Small");
			p1.setPrice(500);
			p1.setName("Margherita");
		    p1.showDetails();
			
		Pizza p2=new Pizza("Large",1500,"Marinara");
		p2.showDetails();
		
		
		Burger b1=new Burger();
		b1.setNumOfPatties(3);
		b1.setPrice(400);
		b1.setName("Double Cheese Chiicken");
		b1.showDetails();
		
		Burger b2=new Burger(2,350,"Beef Burger");
		b2.showDetails();
	}
}
