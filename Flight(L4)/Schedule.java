public class Schedule{
	private int hour;
	private int minute;
	
	public void setHour(int hour){
	this.hour=hour;}
	
	public void setMinute(int minute){
	this.minute=minute;}
	
	public int getHour(){
	return this.hour;}
	
	public int getMinute(){
	return this.minute;}
	
	Schedule(){
	}
	
	Schedule(int hour,int minute){
		this.hour=hour;
		this.minute=minute;
	}
	
	public void showInformation(){
		System.out.println("\nSchedule Details: ");
		System.out.println("\nHour: " +hour);
		System.out.println("Minute: " +minute);
	}
	
}