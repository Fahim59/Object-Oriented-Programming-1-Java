public class Androidcellphone{
	private String companyName;
	private int androidVersion;
	private int price;
	
	public void setcompanyName(String companyName){
		this.companyName=companyName;
	}
	public void setandroidVersion(int androidVersion){
		if(androidVersion>6 && androidVersion<10)
		{	
		   this.androidVersion=androidVersion;
		}
	else 
	    {      
           //this.androidVersion=-1;
		   System.out.println("Invalid Android Version");
		}
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	public String getcompanyName(){
		return this.companyName;
	}
	public int getandroidVersion(){
		return this.androidVersion;
	}
	public int getPrice(){
		return this.price;
	}
	
	
	    Androidcellphone(){                                                          
	    System.out.println("Default Constructor is created");
	}
	    Androidcellphone(String companyName,int androidVersion,int price){          
		System.out.println("Parameterised Constructor is created");
		this.companyName=companyName;
		this.androidVersion=androidVersion;
        this.price=price;
	}
     
	public void versionName(){
		if(androidVersion==7){
			System.out.println("Naugat");
		}
		if(androidVersion==8){
			System.out.println("Oreo");
		}
		if(androidVersion==9){
			System.out.println("Pie");
		}
	}
	
	public void viewInformation(){
		System.out.println("Android Info");
		System.out.println("Company Name:" +companyName);
		System.out.println("Andoid Version:" +androidVersion);
		System.out.println("Price:" +price);
	}
}