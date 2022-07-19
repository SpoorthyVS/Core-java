class Switch1Tester{

	public static void main(String a[]){
	
		Switch1 sw = new TubeLightImpl();
		sw.sOnn();
		sw.sOff();
		
		Switch1 swi = new LedImpl();
		swi.sOnn();
		swi.sOff();
	
	}



}