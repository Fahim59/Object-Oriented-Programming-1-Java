public class MovablePoint implements Movable{
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x,int y,int xSpeed,int ySpeed){
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	
	public String toString(){
		return "\nPoint is at -x: "+this.x+" and y: "+this.y;
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
		System.out.println("Place of point: " +toString);
	}*/
}