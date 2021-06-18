public class Burger extends FoodItem{
	
	private int numOfPatties;
	
	public void setNumOfPatties(int numOfPatties){
	this.numOfPatties=numOfPatties;}
	
	public int getNumOfPatties(){
	return this.numOfPatties;}
	
	Burger(){
	}
	
	Burger(int numOfPatties,double price,String name){
		super(price,name);
		this.numOfPatties=numOfPatties;
	}
	
	public void showDetails()
    {
		System.out.println("***Burger***");
    	super.showDetails();
    	System.out.println("Number Of Patties: "+numOfPatties);
		System.out.println("----------------------");
    }
}