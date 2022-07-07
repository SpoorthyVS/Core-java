class MusicPlayerTester{

	public static void main(String a[]){
	
	MusicPlayerDTO music = new MusicPlayerDTO();
	music.setName("Resso");
	music.setIsAvailable(true);
	music.setNumber(1000);
	music.setPrice(199);
	music.setSubscription(false);
	music.toListen();
	
	System.out.println("The name of the music app is "+ music.getName()+" is this app available  "+music.getIsAvailable()+"...........total number of songs are  "+music.getNumber()+".........the price for ads free app is  "+music.getPrice()+"........Is subscription available "+music.getSubscription()+" ........ ");
	
	}







}