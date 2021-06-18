public class Triangle{
	private int x;
	private int y;
	private int z;
	
	Triangle(){
	}
	
	Triangle(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void showInfo(){
		System.out.println("\n--- Triangle Info ---");
		
		System.out.println("\nValue of X: " +x);
		System.out.println("Value of Y: " +y);
		System.out.println("Value of Z: " +z);
	}
	
	public void testTriangle(){
		if(x == y && x == z){
			System.out.println("\nTriangle is Equilateral");
		}
		else if((x==y && x!=z) || (x==z && x!=y) || (y==z && y!=x)){
			System.out.println("\nTriangle is Isosceles");
		}
		else{
			System.out.println("\nTriangle is Scalene");
		}
	}
}