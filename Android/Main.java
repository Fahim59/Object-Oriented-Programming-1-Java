public class Main{
	public static void main(String[] args){
	Androidcellphone a1=new Androidcellphone();
	a1.setcompanyName("Nokia");
	a1.setandroidVersion(7);
	a1.setPrice(5000);
	a1.viewInformation();
	a1.versionName();
		
	Androidcellphone a2= new Androidcellphone("Samsung",8,10000);
	a2.viewInformation();
	a2.versionName();
	}
}