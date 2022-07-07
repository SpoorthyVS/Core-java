class AirportTester{

	public static void main(String a[]){
	
	AirportDTO dto = new AirportDTO();
	dto.setName("kempegowda");
	dto.setId(35);
	dto.setType("international airdto");
	dto.setNoOfFlight(76543);
	dto.setTurminalName('A');
	dto.canTravel();
	
	System.out.println("The name of the airdto is "+dto.getName()+" and the id is "+dto.getId()+"........... it is and "+dto.getType()+"......... the flight number is "+dto.getNoOfFlight()+"......... we need to go the the "+dto.getTurminalName()+" turminal........ ");
	
	
	
	
	
	
	
	
	}



}