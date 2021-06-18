public class Main{
	public static void main(String args[]){
		
		Contract c1=new Contract("Abir","11",15,"01686026037",'M');
		Contract c2=new Contract("Ahana","12",16,"01686026037",'F');
		Contract c3=new Contract("Babul","13",17,"01686026037",'M');
		Contract c4=new Contract("Bubli","14",18,"01686026037",'F');
		
		AddressBook a1=new AddressBook("Shahriar Rahman","Personal Contract");
		
		a1.addContract(c1);
		a1.addContract(c2);
		a1.addContract(c3);
		a1.addContract(c4);
		
		a1.showAllContractInfo();
		
		a1.deleteContract(c4);
		
		a1.showAllContractInfo();
	}
}