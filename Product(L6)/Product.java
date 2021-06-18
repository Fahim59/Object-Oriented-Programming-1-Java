import java.lang.*;
public class Product{
	private int productId;
	private String productName;
	private double price;
	private int availableQuantity;
	
	public void setProductId(int productId){
	this.productId=productId;}
	
	public void setProductName(String productName){
	this.productName=productName;}
	
	public void setPrice(double price){
	this.price=price;}
	
	public void setAvailableQuantity(int availableQuantity){
	this.availableQuantity=availableQuantity;}
	
	public int getProductId(){
	return this.productId;}
	
	public String getProductName(){
	return this.productName;}
	
	public double getPrice(){
	return this.price;}
	
	public int getAvailableQuantity(){
	return this.availableQuantity;}
	
	Product(){
	}
	
	Product(int productId,String productName,double price,int availableQuantity){
	this.productId=productId;
    this.productName=productName;
	this.price=price;
	this.availableQuantity=availableQuantity;}
	
	public void buyProducts(int quantity){
		availableQuantity=availableQuantity+quantity;
	}
	
	public void sellProducts(int quantity){
		if(availableQuantity>=quantity){
		availableQuantity=availableQuantity-quantity;}
		else{
		System.out.println("Not enough Quantity");
		}
	}
}