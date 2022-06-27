class Ncr{
	public static void main(String a[]){
	int Ncr= fact(15)/(fact(6)*fact(15-6));
	System.out.println(Ncr);
	}
	public static int fact (int factNumber){
		System.out.println("invoke fact()");
		System.out.println("Paramter value"+ factNumber);
		int f=1;
		for(int i=1; i<=factNumber; i++){
			f=  f*i;
		}
		System.out.println("end of fact()");
		return f;
	}



}