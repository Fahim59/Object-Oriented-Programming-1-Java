import java.util.*;
public class Exception{
	int x, y;
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Exception e = new Exception();
		
		boolean a = true;
		
		do{
		    try{
			    System.out.print("Please Enter an Integer 1: ");
			    e.x = sc.nextInt();
			
			    System.out.print("Please Enter an Integer 2: ");
			    e.y = sc.nextInt();
			
			    int r = e.x/e.y;
			    System.out.println(r);
		    }
			
			catch(InputMismatchException ime){
			    System.out.println("InputMismatchException Occured");
				sc.nextLine();
				System.out.println("java.util.InputMismatchExecption: You must enter integer. Please try again");
		    }
			
		    catch(ArithmeticException ae){
			    System.out.println("ArithmeticException Occured");
				System.out.println("java.lang.ArithmeticException: / by zero. You must enter integer. Please try again");
		    }
		}
		while(a);
	}
}