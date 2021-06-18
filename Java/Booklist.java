import java.util.*;
public class Booklist {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the books of the array 1: ");
		
		String[] booklist1 = new String[3];
		for(int i=0; i<booklist1.length;i++){
			booklist1[i] = sc.nextLine();
		}
		
		System.out.println("Enter the books of the array 2: ");
		String[] booklist2 = new String[3];
		for(int i=0; i<booklist2.length;i++){
			booklist2[i] = sc.nextLine();
		}
		
		System.out.println(Arrays.toString(booklist1));
		System.out.println(Arrays.toString(booklist2));
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<booklist1.length; i++) {
			for(int j=0; j<booklist2.length; j++) {
				if(booklist1[i].equals(booklist2[j])) {
					set.add(booklist1[i]);
				}
			}
		}
		System.out.println("Common Elements: " +(set));
	}
}