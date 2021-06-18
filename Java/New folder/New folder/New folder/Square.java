public class Square implements MyShape{
	public double side;
	
	public Square(double side){
		this.side = side;
	}
	
	public void Area(){
		double area = side*side;
		System.out.println(area);
	}
	
	public void BoundaryLength(){
		double boundaryLength = 4*side;
		System.out.println(boundaryLength);
	}
}