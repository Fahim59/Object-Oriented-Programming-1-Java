import java.util.Scanner;

public class A {
	 
private static final Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
    	
    	System.out.print("Enter input: ");
    	
        int N = scanner.nextInt();
        
        for(int i=1;i<=10;i++) {
        	
        	System.out.println(N + " x " + i +" = " + N*i);
        }
 
    }
}