import java.lang.*;
public class Shop{
	private String shopName;
	private Product products[];                                       //creating a Product type array  // int[] products
	
	public void setShopName(String shopName){
	this.shopName=shopName;}
	
	public String getShopName(){
	return this.shopName;}
	
	Shop(){
	}
	
	Shop(String shopName,int sizeOfArray){
		this.shopName=shopName;
		this.products=new Product[sizeOfArray];                     //initializing object array  //int[] products=new int []
	}

	public Product getProductId(int productId){
		for(int i=0;i<products.length;i++){
			if(products[i].getProductId()==productId){
				return products[i];
			}
		}
		return null;
	}
	
	public void addProduct(Product P){
		for(int i=0;i<products.length;i++){
			if(products[i]==null){
				products[i]=P;
				break;
			}
		}
	}

	public void removeProduct(Product p){
		for(int i=0;i<products.length;i++){
			if(products[i]==p){
				products[i]=null;
				break;
			}
		}
	}
		
	public void showInfo(){
		System.out.println("Shop Name:" +shopName);
		for(int i=0;i<products.length;i++)
		{if(products[i] != null)
		{ System.out.println("\n--- Product Info ---\n");
	      System.out.println("Product Id: " +this.products[i].getProductId());
		  System.out.println("Product Name: " +this.products[i].getProductName());
		  System.out.println("Product Price: " +this.products[i].getPrice());
		  System.out.println("Available Quantity: " +this.products[i].getAvailableQuantity());
		}
		}
	}
}