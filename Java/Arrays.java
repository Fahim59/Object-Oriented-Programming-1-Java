import java.util.*;
public class Arrays{
	public static void main(String[] args){
		
		int sum = 0; 
		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the Array: ");
		int arLength = sc.nextInt();
		int myArray[] = new int[arLength];
		
		System.out.print("Enter the elements of the Array: ");
		
		for(int i=0; i<arLength; i++) {
			myArray[i] = sc.nextInt();
			sum = sum + myArray[i];
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println("Sum of the array: " +sum);
		 
	    avg = sum/myArray.length;
		int average = (int)avg;
		System.out.println("Average of the array: " +average);
		
		int max = myArray[0];
		 for (int i = 1; i < arLength; i++)
           if (myArray[i] > max)
               max = myArray[i];

        System.out.println("Max number of the array: " +max);
		
		System.out.print("Enter the index number for replacing value: ");
		int index = sc.nextInt();
		 
		System.out.print("Enter the value for replacing: ");
		int value = sc.nextInt();
		 
		myArray[index] = value;
		 
		System.out.println(Arrays.toString(myArray));
	}
}