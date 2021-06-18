import java.util.*;
public class Array{
	public static void main(String args[]){
		
		int arLength, x=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the Array: " );
		
		arLength = sc.nextInt();
		
		int ar[] = new int [arLength];
		
		System.out.print("Enter the elements: ");
		
		for(int i=0; i<ar.length; i++)
			
			ar[i] = sc.nextInt();
			System.out.print("Array Elements are: ");
		    System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.print("Sorted Elements are: ");
		System.out.println(Arrays.toString(ar));
		
		for(int i=0; i<ar.length; i++){
			for(int j=0; j<ar.length; j++){
				if(ar[j] == i){
					x = ar[i];
					ar[i] = ar[j];
					ar[j] = x;
					break;
				}
			}
		}
		System.out.println("Expected Array is: ");
		for(int i=0; i<ar.length; i++){
			System.out.print(ar[i]+ " ");
		}
	}
}