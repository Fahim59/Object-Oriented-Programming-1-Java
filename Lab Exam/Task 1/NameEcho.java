import java.util.Scanner;

public class Name {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner( System.in );
    
        String name;
        
        System.out.print("\nPlease enter your name: ");
        name = sc.nextLine();

		String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
		
        lastName=lastName.toUpperCase();
		
        System.out.println(firstName + " " + lastName);
    }
}
