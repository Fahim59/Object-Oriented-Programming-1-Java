public class Start{
	public static void main(String args[]){
	
    SavingsAccount sa = new SavingsAccount();
    sa.setAccountNumber("11111111");
    sa.setAccountHolderName("Hasan Ali");
    sa.setBalance(10000);
    sa.setInterestRate(7.5);
	
	
    FixedAccount fa = new FixedAccount( );
    fa.setAccountNumber("1111112");
    fa.setAccountHolderName("Abdur Rahim");
    fa.setBalance(500000);
    fa.setTenureYear(10);
	
	
    Bank b = new Bank( ) ;
    b.setName("DBBL");
    b.setSavingsAccount(sa);
    b.setFixedAccount(fa);
	
	System.out.println("----- Bank Details -----");
	System.out.println("Bank Name: " +b.getName());
	
	System.out.println("\n---Details of Savings Account ---");                                         
    System.out.println("Account Number: " +b.getSavingsAccount().getAccountNumber());
    System.out.println("Account Holder Name: " +b.getSavingsAccount().getAccountHolderName());
	System.out.println("Balance: " +b.getSavingsAccount().getBalance());
	System.out.println("Interest Rate: " +b.getSavingsAccount().getInterestRate());
	
	System.out.println("\n---Details of Fixed Account ---");                                         
    System.out.println("Account Number: " +b.getFixedAccount().getAccountNumber());
    System.out.println("Account Holder Name: " +b.getFixedAccount().getAccountHolderName());
	System.out.println("Balance: " +b.getFixedAccount().getBalance());
	System.out.println("Tenure Year: " +b.getFixedAccount().getTenureYear());
	}
}