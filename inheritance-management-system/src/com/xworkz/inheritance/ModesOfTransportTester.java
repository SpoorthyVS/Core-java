package com.xworkz.inheritance;

public class ModesOfTransportTester {
	
	public static void main(String[] args){
		
		
		   Bus bus=new Bus();
		   bus.noOfHours=10;
		   bus.destination="dharwad";
		   bus.placeOfOrigin="Bangalore";
		   bus.price=800;
		   bus.noOfSeats=32;
		   bus.busName = "Airavatha";
		  
		   bus.toTravel();
		   
			System.out.println(" the total number of hours is " + bus.noOfHours + ".........destination is  " + bus.destination + "from " + bus.placeOfOrigin+ "......ticket price is " + bus.price + "and number of seats are " + bus.noOfSeats + " .......bus name is " +bus.busName);
		  
		  }


}
