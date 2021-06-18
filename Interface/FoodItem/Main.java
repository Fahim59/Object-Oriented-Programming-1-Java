public class Main{
	public static void main(String args[]){
		//Menu m = new Menu()        //Error
		Menu m = new Menu(5);
		
//We have parameterized constructor in Pizza class but we can not call showDetails() function from FoodItem class because it has no body. So we have to use empty constructor.		
		Pizza p1=new Pizza();
		p1.setId(101);
		p1.setName("Chicken Pizza");
		p1.setPrice(500);
		p1.setSize("5'");
		
		Pizza p2=new Pizza();
		p2.setId(102);
		p2.setName("Beef Pizza");
		p2.setPrice(800);
		p2.setSize("8'");
		
		Burger b1=new Burger();
		b1.setId(103);
		b1.setName("Chicken Burger");
		b1.setPrice(300);
		b1.setNumberOfPatties(3);
		
		Burger b2=new Burger();
		b2.setId(104);
		b2.setName("Beef Burger");
		b2.setPrice(400);
		b2.setNumberOfPatties(4);
		
		m.addFoodItem(p1);
		m.addFoodItem(p2);
		m.addFoodItem(b1);
		m.addFoodItem(b2);
		
		m.showAllFoodItems();
		
		m.removeFoodItem(p2);
		m.removeFoodItem(b2);
		
		m.showAllFoodItems();
		
		FoodItem f=m.getFoodItem(101);
		if(f!=null)
		{
			System.out.println("Food Item available");
		}
		else
		{
			System.out.println("Food Item is not available");
		}
		
		f=m.getFoodItem(104);
		if(f!=null)
		{
			System.out.println("Food Item Exists");
		}
		else
		{
			System.out.println("Food Item is not available");
		}
		
		//m.showAllFoodItems();
	}
}