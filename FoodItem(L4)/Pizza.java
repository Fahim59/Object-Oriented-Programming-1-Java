public class Pizza extends FoodItem{
	private String size;
	
	public void setSize(String size){
	this.size=size;}
		
	public String getSize(){
	return this.size;}
	
	Pizza(){
	}
	
	Pizza(String size,double price,String name){
	  super(price,name);
	  this.size=size;
	}
	
	public void showDetails()
    {
		System.out.println("***Pizza***");
    	super.showDetails();
    	System.out.println("Size: "+size);
		System.out.println("----------------------");
    }
}