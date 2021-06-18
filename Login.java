import java.util.*;
public class Login{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String username, password;
		
		/*Random rd = new Random();
		int x = rd.nextInt(9999)+10000;
		
		System.out.println("\nPassword is :" +x);*/
		
		System.out.println("Enter your username: ");
		username = sc.nextLine(); 
		
		System.out.println("Enter your Password: ");
		password = sc.nextLine();
		
		if(username.equals("admin") && (password.equals("admin"))){
		//if(username.equals("admin") && (password.equals(x+""))){
			System.out.println("*** Welcome to the Project ***");
		}
		else{
			System.out.println("Wrong username or password, try again...");
		}
	}
}