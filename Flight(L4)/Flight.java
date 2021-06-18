public class Flight{
	private String flightId;
	private int capacity;
	private Airport departureFrom;
	private Schedule departureTime;
	private Airport flyingTo;
	private Schedule arrivalTime;
	
	public void setFlightId(String flightId){
	this.flightId=flightId;}
	
	public void setCapacity(int capacity){
	this.capacity=capacity;}
	
	public void setDepartureFrom(Airport departureFrom){
	this.departureFrom=departureFrom;}
	
	public void setDepartureTime(Schedule departureTime){
	this.departureTime=departureTime;}
	
	public void setFlyingTo(Airport flyingTo){
	this.flyingTo=flyingTo;}
	
	public void setArrivalTime(Schedule arrivalTime){
	this.arrivalTime=arrivalTime;}
	
	public String getFlightId(){
	return this.flightId;}
	
	public int getCapacity(){
	return this.capacity;}
	
	public Airport getDepartureFrom(){
	return this.departureFrom;}
	
	public Schedule getDepartureTime(){
	return this.departureTime;}
	
	public Airport getFlyingTo(){
	return this.flyingTo;}
	
	public Schedule getArrivalTime(){
	return this.arrivalTime;}
	
	Flight(){
	}
	
	Flight(String flightId,int capacity,Airport departureFrom,Schedule departureTime,Airport flyingTo,Schedule arrivalTime){
		this.flightId=flightId;
		this.capacity=capacity;
		this.departureFrom=departureFrom;
		this.departureTime=departureTime;
		this.flyingTo=flyingTo;
	    this.arrivalTime=arrivalTime;
	}
}