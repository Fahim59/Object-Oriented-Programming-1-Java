public class EEE extends Department{
	public EEE(){
	}
	
	public EEE(String deptName,int creditFee){
		super(deptName,creditFee);
	}
	
	public void calculateSemesterFee(int credit){
		int totalFee;
		totalFee=creditFee*credit;
		System.out.println("\nTotal Fee: " +totalFee);
	}
}