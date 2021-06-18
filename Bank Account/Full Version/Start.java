public class Start{
	public static void main(String args[]){
		
		Account[] a = new Account[3];
		a[0] = new Savings  (101, "Bruce", "12/10/2018", 4000,3);
		a[1] = new Current  (102, "Clerk", "02/09/2018", 3000,6);
		a[2] = new Overdraft(103, "Michel","21/03/2018", 2000,5);
		
		byte c = 0;
		while(c < a.length){
			a[c].showInformation();
			System.out.println();
			c++;
		}
		
		//a[0].deposit(1000);
		//a[1].deposit(600);
		a[2].deposit(2000);
		
		a[2].withdraw(2500);
		a[2].withdraw(500);
		
		//a[1].transfer(500,a[2]);
		
		

		
	}
}