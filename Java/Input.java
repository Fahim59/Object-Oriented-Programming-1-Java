import java.util.Scanner;

public class Input{

    public static void main(String[] args){
		
        Scanner scan = new Scanner(System.in);
        
		System.out.print("Enter Your String: ");
		
        String s = scan.nextLine();
        
        System.out.println("\nString: " + s);
    }
}