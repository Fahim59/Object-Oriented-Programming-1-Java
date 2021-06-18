import java.util.Scanner;

public class NameEcho{
	
    public static void main(String [] args){
		
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
		
        String word = scan.nextLine();
		for (char ch : word.toCharArray())
			
        System.out.println(ch);
	}
}