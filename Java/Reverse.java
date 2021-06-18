import java.util.*;
public class Reverse{
	public static void main(String args[]){
		int digit,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		
		num = sc.nextInt();
		
		while(num>0){
			digit= num%10;
			
			if(digit%2 !=0){
				System.out.print(digit);
			}
			num /=10;
		}
	}
}