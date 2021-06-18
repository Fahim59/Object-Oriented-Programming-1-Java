public class Bank{
	private static int count=0;
	protected static Account accounts[];
	
	Bank(int sizeOfArray){
		this.accounts=new Account[sizeOfArray];                     //initializing object array  //int[] accounts=new int []
	}

	public static void addAccount(Account a){
		for(int i=0;i<accounts.length;i++){
			if(accounts[i]==null){
				accounts[i]=a;
				break;
			}
		}
	}
	
	public static void showAllAccounts(){
		short index = 0;
		while(index < count){
			if(accounts[index] != null){
				//continue;//break;
				accounts[index].showInformation();
				System.out.println();
			}
			index++;
		}
	}

	public static Account searchAccount(int id){
		for(int i=0;i<accounts.length;i++){
			if(accounts[i].getAccId()==id){
				return accounts[i];
			}
		}
		return null;
	}

	public void removeAccount(int id){
		for(int i=0;i<accounts.length;i++){
			if(accounts[i].getAccId()==id){
				accounts[i]=null;
				break;
			}
		}
	}
}