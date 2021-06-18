public class Product{
	public int productId;
	public String productName;
	public String manufacturerName;
	public double price;
	public int availableQuantity;
	
	public int ProductId;
	public String ProductName;
	public String ManufacturerName;
	public double Price;
	public int AvailableQuantity;
	
	public void setproductId(int productId){
	this.productId=productId;}
	
	public void setproductName(String productName){
	this.productName=productName;}
	
	public void setmanufacturerName(String manufacturerName){
	this.manufacturerName=manufacturerName;}
	
	public void setprice(double price){
	this.price=price;}
	
	public void setavailableQuantity(int availableQuantity){
	this.availableQuantity=availableQuantity;}
	
	
	public void setProductId(int ProductId){
	this.ProductId=ProductId;}
	
	public void setProductName(String ProductName){
	this.ProductName=ProductName;}
	
	public void setManufacturerName(String ManufacturerName){
	this.ManufacturerName=ManufacturerName;}
	
	public void setPrice(double Price){
	this.Price=Price;}
	
	public void setAvailableQuantity(int AvailableQuantity){
	this.AvailableQuantity=AvailableQuantity;}
	
	
	
	public int getproductId(){
	return this.productId;}
	
	public String getproductName(){
	return this.productName;}
	
	public String getmanufacturerName(){
	return this.manufacturerName;}
	
	public double getprice(){
	return this.price;}
	
	public int getavailableQuantity(){
	return this.availableQuantity;}
	
	
	public int getProductId(){
	return this.ProductId;}
	
	public String getProductName(){
	return this.ProductName;}
	
	public String getManufacturerName(){
	return this.ManufacturerName;}
	
	public double getPrice(){
	return this.Price;}
	
	public int getAvailableQuantity(){
	return this.AvailableQuantity;}
	
	
	Product(){
		//System.out.println("Default Constructor is created");
	}
	Product(int ProductId,String ProductName,String ManufacturerName,double Price,int AvailableQuantity){
		this.ProductId=ProductId;
		this.ProductName=ProductName;
		this.ManufacturerName=ManufacturerName;
		this.Price=Price;
	    this.AvailableQuantity=AvailableQuantity;
	}
	
	public void viewInformation(){                                        //method to display the value of id and name
		System.out.println("Product Information:");
		System.out.println("ProductID:" +productId);
		System.out.println("Name:" +productName);
		System.out.println("Manufacturer Name:" +manufacturerName);
		System.out.println("Price:" +price);
		System.out.println("Available Quantity:" +availableQuantity);
	}
	
	public void viewInformations(){                                        //method to display the value of id and name
		System.out.println("Product Information:");
		System.out.println("ProductID:" +ProductId);
		System.out.println("Name:" +ProductName);
		System.out.println("Manufacturer Name:" +ManufacturerName);
		System.out.println("Price:" +Price);
		System.out.println("Available Quantity:" +AvailableQuantity);
	}
}