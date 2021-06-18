import java.util.*;
public class Series{
	public static void main(String args[]){
		
		int n, n1=0, n2=0, n3=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			System.out.print(n1+ " ");
		}
	}
}