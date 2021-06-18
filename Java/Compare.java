public class Compare{
	
  public static void main(String[] args){
	
    String str = "LISTEN";
	String str1 = "SILENT";
	
    int sum=0;
	int sum1=0;
	
    for(int i=0; i<str.length(); i++){
      int asciiValue = str.charAt(i);
      sum = sum+ asciiValue;
    }
	
	for(int i=0; i<str1.length(); i++){
      int asciiValue1 = str.charAt(i);
      sum1 = sum1+ asciiValue1;
    }
	
	if(sum==sum1){
		System.out.println("The Strings are Same");
	}
	else{
		System.out.println("The Strings are not Same");
	}
  }
}