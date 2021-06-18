public class Mobile{
	public String mobileOwnerName;
	public String mobileNumber;
	public double mobileBalance;
	public String mobileOSName;
	boolean lock;
	
	Mobile(){
	}
	
	Mobile(String mobileOwnerName,String mobileNumber,double mobileBalance,String mobileOSName,boolean lock){
		this.mobileOwnerName=mobileOwnerName;
		this.mobileNumber=mobileNumber;
		this.mobileBalance=mobileBalance;
		this.mobileOSName=mobileOSName;
		this.lock=lock;
	}
	
	public void showInfo(){
		if(lock==false){
		    System.out.println("\n--- Mobile Info ---");
		    System.out.println("Mobile Owner Name: " +mobileOwnerName);
		    System.out.println("Mobile Number: " +mobileNumber);
		    System.out.println("Mobile Balance: " +mobileBalance);
		    System.out.println("Mobile OS Name: " +mobileOSName);
		    System.out.println("Lock Status :" +lock);
		}
		else{
			System.out.println("Phone is locked, Unlock it first");
		}
	}
	
	public void recharge(int amount){
		if(lock==false){
		    mobileBalance= mobileBalance + amount;
		}
		else{
			System.out.println("Phone is lock, Unlock it first");
		}
	}
	
	public void callSomeone(double timeDuration){
		if((lock==false)&&(mobileBalance>=(timeDuration*1))){
		    System.out.println("\nCall duration was " +timeDuration+ " minutes and Cost is " +timeDuration*1+ " taka");
			mobileBalance=mobileBalance - (timeDuration*1);
			System.out.println("Now Balance is " +mobileBalance);
		}
		else if((lock==false)&&(mobileBalance<(timeDuration*1))){
			System.out.println("Insufficient Balance!! Please recharge first");
		}
		else if(lock==true){
			System.out.println("\nPhone is lock, Unlock it first");
		}
	}
}