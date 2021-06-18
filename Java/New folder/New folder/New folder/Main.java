import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int option,input1,input2;
			
			do{
				
				System.out.println("1. Triangle");
		        System.out.println("2. Square");
		        System.out.println("3. Circle");
				System.out.println("4. Exit");
				
				System.out.print("\nEnter any choice To Start: ");
			
			    option= sc.nextInt();
			
			    switch(option){
				case 1:
				System.out.println("1. Triangle Area");
		        System.out.println("2. Triangle BoundaryLength");
				System.out.println("3. Exit");
				do{
			        System.out.print("\nEnter any choice: ");
					
					input1 = sc.nextInt();
					double base,height;
					
					switch(input1){
						case 1:
						System.out.println("Triangle Area");
						
						System.out.print("Enter Base: ");
						base = sc.nextDouble();
						
						System.out.print("Enter Height: ");
						height = sc.nextDouble();
						
						Triangle t1 = new Triangle(base,height);
						
						t1.Area();
						break;
						
						case 2:
						System.out.println("Triangle BoundaryLength");
						
						System.out.print("Enter Base: ");
						base = sc.nextDouble();
						
						System.out.print("Enter Height: ");
						height = sc.nextDouble();
						
						Triangle t2 = new Triangle(base,height);
						
						t2.BoundaryLength();
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input1!= 3);
				break;
				
				case 2:
				System.out.println("1. Square Area");
		        System.out.println("2. Square Boundary Length");
				System.out.println("3. Exit");
				do{
			        System.out.print("\nEnter any choice: ");
					
					input1 = sc.nextInt();
					double side;
					
					switch(input1){
						case 1:
						System.out.println("Square Area");
						
						System.out.print("Enter Side: ");
						side = sc.nextDouble();
						
						Square s1 = new Square(side);
						
						s1.Area();
						
						break;
						
						case 2:
						System.out.println("Square Boundary Length");
						
						
						System.out.print("Enter Side: ");
						side = sc.nextDouble();
						
						Square s2 = new Square(side);
						
						s2.BoundaryLength();
						
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input1!= 3);
				break;
				
				case 3:
				System.out.println("1. Circle Area");
		        System.out.println("2. Circle Boundary Length");
				System.out.println("3. Exit");
				do{
			        System.out.print("\nEnter any choice: ");
					
					input1 = sc.nextInt();
					double radius;
					
					switch(input1){
						case 1:
						System.out.println("Circle Area");
						
						System.out.print("Enter Radius: ");
						radius = sc.nextDouble();
						
						Circle c1 = new Circle(radius);
						
						c1.Area();
						
						break;
						
						case 2:
						System.out.println("Circle Boundary Length");
						
						System.out.print("Enter Radius: ");
						radius = sc.nextDouble();
						
						Circle c2 = new Circle(radius);
						
						c2.BoundaryLength();
						
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input1!= 3);
				break;
				}
			}
			while(option!= 4);
	}
}