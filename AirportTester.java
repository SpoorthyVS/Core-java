class AirportTester{

	public static void main(String a[]){
	
	Airport port = new Airport();
	port.setName("kempegowda");
	port.setId(35);
	port.setType("international airport");
	port.setNoOfFlight(76543);
	port.setTurminalName('A');
	port.canTravel();
	
	System.out.println("The name of the airport is "+port.getName()+" and the id is "+port.getId()+"........... it is and "+port.getType()+"......... the flight number is "+port.getNoOfFlight()+"......... we need to go the the "+port.getTurminalName()+" turminal........ ");
	
	
	
	
	
	
	
	
	}



}