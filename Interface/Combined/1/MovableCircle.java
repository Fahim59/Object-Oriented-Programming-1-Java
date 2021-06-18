public class MovableCircle implements Movable{
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	private int radius;
	public MovablePoint center;
	
	public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
		this.center=new MovablePoint(x,y,xSpeed,ySpeed);
		this.radius=radius;
	}
	
	public String toString(){
		return "\nCircle's center: "+center.toString();
	}
	
	public void moveUp(){
		this.y = this.y + this.ySpeed;
	}
	
	public void moveDown(){
		this.y = this.y - this.ySpeed;
	}
	
	public void moveRight(){
		this.x = this.x + this.xSpeed;
	}
	
	public void moveLeft(){
		this.x = this.x - this.xSpeed;
	}
	
	/*public void showDetails(){
		System.out.println("Place of center: " +toString);
	}*/
}