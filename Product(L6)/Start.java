import java.lang.*;

public class Start{
public static void main(String []args){

   Shop s1=new Shop("Madina Store",5);                        //creating object of Shop class

   Product p1,p2,p3,p4;                                      //creating object of Product class
    
   p1=new Product(101,"Biscuit",10,50);                     //assigning values
   p2=new Product(102,"Soap",15,20);
   p3=new Product(103,"Coke",20,15);
   p4=new Product(104,"Egg",11,30);
   
   s1.addProduct(p1);                                      //adding objects in the products[] array
   s1.addProduct(p2);
   s1.addProduct(p3);
   
   s1.showInfo();                                          //displaying info
   
   (s1.getProductId(102)).buyProducts(5);
   (s1.getProductId(103)).sellProducts(5);
   
   System.out.println("\n---After Updating---\n");
   s1.showInfo();
   
   s1.removeProduct(p1);
   s1.addProduct(p4);
   
   System.out.println("\n---After Updating---\n");
   s1.showInfo();
}
}