class Npr{
	public static void main(String a[]){
	int factvalue= fact(5)/fact(5-3);
	System.out.println(factvalue);
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