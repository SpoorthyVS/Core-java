class BookMyMovie{
	
	String movie[] = {"Paramathma","Arya","Arya 2","Banni","Don","manam"};
	String theatreName;
	int noOfTickets;
	static int ticketPrice = 150;
	int totalNoOfTickets ;
	int totalTicketPrice;
	String snacks[] = {"potato chips","Popcorn","Samosa","coco cola","Sprite"};
	int totalSnack ;
	static int snackPrice = 50;
	int snackQuantity;
	String snackName;
	int seatNo;
	
	public BookMyMovie(String theatreName, int totalNoOfTickets, String movies[])
	{
		System.out.println("Book my movie object is created");
		this.theatreName = theatreName ;
		this.totalNoOfTickets = totalNoOfTickets;
		this.movie =  movie;
		this.seatNo = seatNo;
		
		this.snackQuantity = snackQuantity;
		this.snackPrice = snackPrice;
		this.totalSnack = totalSnack;
	}
	
	
	public int showTime(int noOfTickets, String bookedBy, String movieName){
		   int totalTicketPrice = 0;	
		System.out.println("inside show time().........");
		System.out.println("Arg 1: No of tickets "+ noOfTickets);
		System.out.println("Arg 2: Booked by "+bookedBy);
		System.out.println("Arg 3: Movie Name "+ movieName);
		
		
		for( int index=0; index < movie.length; index++){
			
			if (movieName == movie[index]){
				
				System.out.println("Movie name matched");
				
				if (noOfTickets < totalNoOfTickets)
				{
					totalTicketPrice = totalNoOfTickets*ticketPrice;
					totalNoOfTickets = totalNoOfTickets - noOfTickets;
					System.out.println("For movie: " + movieName +" No of tickect that are remaining are: " + noOfTickets+" total price is: " + totalTicketPrice);
				}
			else{
				System.out.println("Isht ticket illa");
			}
			}
			else{
				System.out.println("Movie not available");
			}
		}
	return totalTicketPrice;
		
	}

	public int buySnacks(String snackName/**use for loop*/ , int quantity, int bookedSeatNo){
		
		int totalSnackPrice = 0;
		 System.out.println("Arg 1: Price of the Snack "+ snackPrice);
		 System.out.println("Arg 2: Quantity of Snack "+ snackQuantity);
		 System.out.println("Arg 3: Name of the Snack "+ snackName);
		 
			for(int i=0; i < snacks.length; i++)
			{
				if(snackName==snacks[i]){
					System.out.println("The Snack name match");
				if(snackQuantity<totalSnack){
					totalSnackPrice = totalSnackPrice - snackQuantity;
					System.out.println("Snack price: "+ snackQuantity + "snack name"+ snackName + "Snack Quantity " + snackQuantity);
				}
				else{
					System.out.println("Snacks illa.......");
					}
				}
			else{
				System.out.println("Snacks not available......");
				}
			}
		return totalSnackPrice;
		
	}
	
	
	

	
}