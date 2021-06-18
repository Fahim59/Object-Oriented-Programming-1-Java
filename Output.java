class Output{
	public static void main(String [] arg){
		int ax=10;
        System.out.println(ax);
        System.out.println("The value of ax is:"+ax);
        int bx=5;
		System.out.println(ax+bx + "Hello"); //15Hello
		System.out.println("Hello" + ax+bx); //Hello105
		System.out.println("Hello" + (ax+bx)); //Hello15
	}
}