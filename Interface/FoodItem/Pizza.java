public class Pizza extends FoodItem{
	private String size;
	
	Pizza(){
	}
	
	/*Pizza(String size,double price,String name){
		this.size=size;
		this.price=price;
	    this.name=name;
	}*/
	
	public void setSize(String size){
	this.size=size;}
	
	public String getSize(){
	return this.size;}
	
	public void showDetails()
	{
		System.out.println("Food Id: " +id);
		System.out.println("Food Name: " +name);
		System.out.println("Food Price: " +price);
		System.out.println("Pizza Size: " +size);
	}
}