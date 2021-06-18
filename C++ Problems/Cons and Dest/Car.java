public class Car{
	private int numberOfWheels;
	private int weight;
	private static int count; 
	
	public Car(){
	}
	
	public Car(int n,int w){
		this.numberOfWheels=n;
		this.weight=w;
		count++;
	}
	
	public void setWeight(int i){
		this.weight=i;
	}
	
	public void setNOWheels(int i){
		this.numberOfWheels=i;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getNOWheel(){
		return numberOfWheels;
	}
	
	public void print(){
		System.out.println("\nWeight of the car: " +weight);
		System.out.println("No of Wheel of the car: " +numberOfWheels);
	}
	
	public void showCount(){
		System.out.println("No of object created: " +count);
	}
}	