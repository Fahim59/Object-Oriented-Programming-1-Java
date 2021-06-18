import java.util.*;
public class CommonElements{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of booklist1: ");
		String [] booklist1 = new String[3];
		for(int i=0; i<booklist1.length;i++) {
			booklist1[i] = sc.nextLine();
		}
		
		System.out.println("Enter elements of booklist2: ");
		String [] booklist2 = new String[3];
		for (int j=0; j<booklist2.length;j++) {
			booklist2[j] = sc.nextLine();
		}
		
		System.out.println(Arrays.toString(booklist1));
		System.out.println(Arrays.toString(booklist2));
		
		for(int i=0;i<booklist1.length;i++) {
			for(int j=0;j<booklist2.length;j++) {
				if(booklist1[i].equals(booklist2[j])) {
					System.out.println("Common Elements: ");
					System.out.println(booklist1[i]);
				}
			}
		}
	}
}