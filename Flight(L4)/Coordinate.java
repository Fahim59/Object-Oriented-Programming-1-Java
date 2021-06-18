public class Coordinate{
	private double longitude;
	private double latitude;
	
	public void setLongitude(double longitude){
	this.longitude=longitude;}
	
	public void setLatitude(double latitude){
	this.latitude=latitude;}
	
	public double getLongitude(){
	return this.longitude;}
	
	public double getLatitude(){
	return this.latitude;}
	
	Coordinate(){
	}
	
	Coordinate(double longitude,double latitude){
	this.longitude=longitude;
	this.latitude=latitude;}
	
	public void showInformation(){
		System.out.println("\nCoordinate Details: ");
		System.out.println("\nLongitude: " +longitude);
		System.out.println("Latitude: " +latitude);
	}
}