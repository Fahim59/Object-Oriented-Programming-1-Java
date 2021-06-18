public class Rectangle{
	public int x;
	public int y;
	
	Rectangle(){
	}
	
	Rectangle(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public int getX(){
		return this.y;
	}
	
	public int getY(){
		return this.y;
	}
	
	public double getArea(){
		return x*y;
	}
	
	public void showArea(){
		double area;
		area=x*y;
		System.out.println("\nRectangle Area: "+area);
	}
	
	public void check(){
        if(x==y){
			System.out.println("\nX and Y are equal.");
		}
		else{
			System.out.println("\nX and Y are not equal.");
		}
	}		
}