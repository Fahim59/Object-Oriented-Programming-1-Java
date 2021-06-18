import java.lang.*;
import java.util.*;

public class Calculator{
	
	private static int x,y;
	
	Calculator(){}
	
	Calculator(int x,int y){
		this.x=x;
		this.y=y;
	}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("\nWhat would you like to do?: ");
        int choice = sc.nextInt();
        System.out.println();


        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
		else if (choice == 3){
            multiplication();
        }
		else if (choice == 4){
            division();
        }
     
        System.out.println();
        sc.close();
    }

    public static void addition(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Addition");

            System.out.print("\nFirst Number: ");
            x = sc.nextInt();

            System.out.print("\nSecond Number: ");
            y = sc.nextInt();

            sc.close();
            System.out.println("\nSum: " + x + " + " + y + " = " + (x + y));
		}

    public static void subtraction(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Subtraction");

            System.out.print("\nFirst Number: ");
            x = sc.nextInt();

            System.out.print("\nSecond Number: ");
            y = sc.nextInt();

            sc.close();
            System.out.println("\nSum: " + x + " - " + y + " = " + (x - y));
    }

    public static void multiplication(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        x = sc.nextInt();

        System.out.print("\nSecond Number: ");
        y = sc.nextInt();

        sc.close();
        System.out.println("\nSum: " + x + " x " + y + " = " + (x * y));
    }
	
	public static void division(){
		try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Division");

            System.out.print("\nFirst Number: ");
            x = sc.nextInt();

            System.out.print("\nSecond Number: ");
            y = sc.nextInt();

            sc.close();
            System.out.println("\nSum: " + x + " / " + y + " = " + (x / y));
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException Occured");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
    }
}