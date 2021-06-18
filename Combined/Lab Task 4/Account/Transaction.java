public class Transaction{
	private Account sender;
	private Account receiver;
	private int amount;
	private String additionalInfo;
	
	Transaction(Account sender,Account receiver,int amount){
		this.sender=sender;
		this.receiver=receiver;
		this.amount=amount;
		this.sender.transfer(amount, this.receiver);
	}
	
	public void showInfo(){
		System.out.println("\n--- Transaction ---");
		System.out.println("Account Sender: " +sender);
		System.out.println("Account Receiver: " +receiver);
		System.out.println("Amount Sent: " +amount);
	}
}