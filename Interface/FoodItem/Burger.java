public class Burger extends FoodItem{
	private int numberOfPatties;
	
	Burger(){
	}
	
	Burger(int numberOfPatties,double price,String name){
		this.numberOfPatties=numberOfPatties;
		this.price=price;
	    this.name=name;
	}
	
	public void setNumberOfPatties(int numberOfPatties){
	this.numberOfPatties=numberOfPatties;}
	
	public int getNumberOfPatties(){
	return this.numberOfPatties;}
	
	public void showDetails()
	{
		System.out.println("Food Id: " +id);
		System.out.println("Food Name: " +name);
		System.out.println("Food Price: " +price);
		System.out.println("Burger's Number of Patties: " +numberOfPatties);
	}
}