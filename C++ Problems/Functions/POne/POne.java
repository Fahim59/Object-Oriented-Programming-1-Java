public class POne{
	private int result;

	public void square(int a){
		result=a*a;
		System.out.println("Square= " +result);
	}
	
	public void qube(int a){
		result=a*a*a;
		System.out.println("Qube= " +result);
	}
	
	public void modulus(int a,int b){
		result=a-b;
		System.out.println("Modulus= " +result);
	}
	
	public void power(int a,int b){
		long result = 1;
        while (b != 0){
            result *= a;
            --b;
        }
		System.out.println("Power= " +result);
	}
}