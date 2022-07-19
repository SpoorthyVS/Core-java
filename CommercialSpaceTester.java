class CommercialSpaceTester{

	public static void main(String a[]){
	//we cannot create object for any interface but we can create object of impl class
	CommercialSpace space = new SriSaiCondimentsImpl();
	space.serve();
	
	
	CommercialSpace  footWare= new BataShowRoomImpl();
	
	footWare.serve();
	}


}