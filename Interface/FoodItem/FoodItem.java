public abstract class FoodItem{                  //given method(showDetails) is abstract so class must be abstract
	protected int id;
	protected double price;
	protected String name;
	
	FoodItem(){
	}
	
	public void setId(int id){
	this.id=id;}
	
	public void setPrice(double price){
	this.price=price;}
	
	public void setName(String name){
	this.name=name;}
	
	public int getId(){
	return this.id;}
	
	public double getPrice(){
	return this.price;}
	
	public String getName(){
	return this.name;}
	
	public abstract void showDetails();         //abstract method has no body
	
}