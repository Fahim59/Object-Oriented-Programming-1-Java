import java.util.*;

public class Start{
	public static void main(String  args[]){
		IScientificCalculator sc= new IScientificCalculator();
		System.out.println("\nEnter an angle: ");
		Scanner input = new Scanner(System.in);
		
		double angle;
		int x, y;
		
		angle = input.nextDouble();
		System.out.print(sc.trig(angle));
		
		System.out.print("\nEnter two integers to Addition: ");
		System.out.print(sc.sum(input.nextInt(), input.nextInt()));
		
		System.out.print("\nEnter two integers to Subtraction: ");
		System.out.print(sc.sub(input.nextInt(), input.nextInt()));
		
		System.out.print("\nEnter two integers to Multiplication: ");
		System.out.print(sc.multiplication(input.nextInt(), input.nextInt()));
		
		System.out.print("\nEnter two integers to Division: ");
		System.out.print(sc.division(input.nextInt(), input.nextInt()));
		
		System.out.print("\nEnter two integers, where first integer to the power of the second integer, separated by a space: ");
		System.out.print(sc.XtoY(input.nextInt(), input.nextInt()));
	}
}