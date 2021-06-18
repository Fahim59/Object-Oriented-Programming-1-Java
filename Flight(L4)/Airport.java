public class Airport{
	private String name;
	private Coordinate location;
	
	public void setName(String name){
	this.name=name;}
	
	public void setLocation(Coordinate location){
	this.location=location;}
	
	public String getName(){
	return this.name;}
	
	public Coordinate getLocation(){
	return this.location;}
	
	Airport(){
	}
	
	Airport(String name,Coordinate location){
	this.name=name;
	this.location=location;
	}
}