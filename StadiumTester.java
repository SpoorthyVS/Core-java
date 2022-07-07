class StadiumTester{

	public static void main(String[] args){
		
		StadiumDTO sta = new StadiumDTO();
		sta.setName("Bapuji");
		sta.setAddress("davangere");
		sta.setSeatNo(7);
		sta.setArea(1076547.76);
		sta.setContactNumber(876535647l);
		sta.playSports();
		
		System.out.println("The stadium name is "+ sta.getName());
		System.out.println("The address is "+ sta.getAddress());
		System.out.println("Total number of seats are "+ sta.getSeatNo());
		System.out.println("Total area is "+sta.getArea());
		System.out.println("Contact number "+sta.getContactNumber());
		
	}
	





}