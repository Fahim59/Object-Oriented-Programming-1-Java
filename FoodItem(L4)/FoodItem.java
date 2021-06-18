public class FoodItem{
	private double price;
	private String name;
	
	public void setPrice(double price){
	this.price=price;}
	
	public void setName(String name){
	this.name=name;}
	
	public double getPrice(){
	return this.price;}
	
	public String getName(){
	return this.name;}
	
	FoodItem(){
	}
	
	FoodItem(double price,String name){
		this.price=price;
		this.name=name;
	}
	
	public void showDetails(){
		System.out.println("FoodItem Details:");
		System.out.println("Name:" +name);
		System.out.println("Price:" +price);
	}
}