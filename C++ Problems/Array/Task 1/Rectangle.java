public class Rectangle{
	private int width;
	private int height;
	
	public Rectangle(){
	}
	
	public void setDimension(int x,int y){
		this.width=x;
		this.height=y;
	}
	
	public void showArea(){
		System.out.println("Rectangle Area: " +width*height);
	}
	
	public int getArea(){
		return height*width;
	}
}