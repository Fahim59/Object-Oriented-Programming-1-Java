public class AddressBook{
	private String ownerName;
	private String info;
	private Contract listOfContract[];
	
	public AddressBook(){
	}
	
	public AddressBook(String ownerName,String info){
		this.ownerName=ownerName;
		this.info=info;
		this.listOfContract=new Contract[10];
	}
	
	public void showAllContractInfo(){
		System.out.println("\n--- Address Book Info ---");
		System.out.println("Owner Name: " +ownerName);
		System.out.println("Owner Info: " +info);
		
		System.out.println("---Contract Info---");
		for(int i=0;i<listOfContract.length;i++){
			
			if(listOfContract[i]!=null){                         //if certain array index is NOT null, then show the info for that index{
		listOfContract[i].showPersonInfo();}
		}
	}
	
	
	public void addContract(Contract con){
		for(int i=0;i<listOfContract.length;i++){
			if(listOfContract[i]==null){
				listOfContract[i]=con;
				break;
			}
		}
	}
	
	public void deleteContract(Contract con){
		for(int i=0;i<listOfContract.length;i++){
			if(listOfContract[i]==con){
				listOfContract[i]=null;
				break;
			}
		}
	}
}
	
	