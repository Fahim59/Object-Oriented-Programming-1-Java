import java.lang.*;
import java.util.*;

public class IScientificCalculator implements IBasicCalculator{
	public int sum(int x,int y){
		return x+y;
	}
	
	public int sub(int x,int y){
		return x-y;
	}
	
	public int multiplication(int x,int y){
		return x*y;
	}
	
	public int division(int x,int y){
		return x/y;
	}
	
	public int XtoY(int x,int y){
		return (int)Math.pow(x, y);
		//return Math.pow(x, y);         //if parameters are double
	}
	
	public double trig(double angle){
		System.out.println("\nEnter s for sin, c for cos, t for tan");
		Scanner sc = new Scanner(System.in);
		char function;
		
		function = sc.next().charAt(0);
		
		if(function == 's'){
			return Math.sin(angle);
		}
		else if(function == 'c'){
			return Math.cos(angle);
		}
		else if(function == 't'){
			return Math.tan(angle);
		}
		else
			return 0.00;
	}
}