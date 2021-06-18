public class Start{
	public static void main(String []args){
		
		Coordinate c1=new Coordinate();
		c1.setLongitude(100);
		c1.setLatitude(50);
		
		Coordinate c2=new Coordinate(200,60);
		
		//c1.showInformation();
		//c2.showInformation();
		
		Schedule s1=new Schedule();
		s1.setHour(5);
		s1.setMinute(30);
		
		Schedule s2=new Schedule(8,15);
		
		//s1.showInformation();
		//s2.showInformation();
		
		Airport a1=new Airport();
		a1.setName("Dhaka International Airport");
		a1.setLocation(c1);
		
		//System.out.println("\nAirport Name: " +a1.getName());
		//System.out.println("Location: ");
		//System.out.println("Longitude: " +a1.getLocation().getLongitude());
		//System.out.println("Latitude: " +a1.getLocation().getLatitude());
		
		Airport a2=new Airport();
		a2.setName("Sylhet International Airport");
		a2.setLocation(c2);
		
		//System.out.println("\nAirport Name: " +a2.getName());
		//System.out.println("Location: ");
		//System.out.println("Longitude: " +a2.getLocation().getLongitude());
		//System.out.println("Latitude: " +a2.getLocation().getLatitude());
		
		Flight f1=new Flight();
		f1.setFlightId("18A3BC");
		f1.setCapacity(500);
		f1.setDepartureFrom(a1);
		f1.setDepartureTime(s1);
		f1.setFlyingTo(a1);
		f1.setArrivalTime(s1);
		
		System.out.println("\n--- Flight Information For Object 1 ---");
		System.out.println("Flight ID: " +f1.getFlightId());
		System.out.println("Flight Capacity: " +f1.getCapacity());
		System.out.println("Flight Departure From: " +f1.getDepartureFrom().getName());
		System.out.println("Flight Departure Time: ");
		System.out.println("Hour: " +f1.getDepartureTime().getHour());
		System.out.println("Minute: " +f1.getDepartureTime().getMinute());
		System.out.println("Flight Flying To: " +f1.getFlyingTo().getName());
		System.out.println("Flight Arrival Time: ");
		System.out.println("Hour: " +f1.getArrivalTime().getHour());
		System.out.println("Minute: " +f1.getArrivalTime().getMinute());
		
		Flight f2=new Flight();
		f2.setFlightId("167VC8");
		f2.setCapacity(350);
		f2.setDepartureFrom(a2);
		f2.setDepartureTime(s2);
		f2.setFlyingTo(a2);
		f2.setArrivalTime(s2);
		
		System.out.println("\n--- Flight Information For Object 2---");
		System.out.println("Flight ID: " +f2.getFlightId());
		System.out.println("Flight Capacity: " +f2.getCapacity());
		System.out.println("Flight Departure From: " +f2.getDepartureFrom().getName());
		System.out.println("Flight Departure Time: ");
		System.out.println("Hour: " +f2.getDepartureTime().getHour());
		System.out.println("Minute: " +f2.getDepartureTime().getMinute());
		System.out.println("Flight Flying To: " +f2.getFlyingTo().getName());
		System.out.println("Flight Arrival Time: ");
		System.out.println("Hour: " +f2.getArrivalTime().getHour());
		System.out.println("Minute: " +f2.getArrivalTime().getMinute());
	}
}