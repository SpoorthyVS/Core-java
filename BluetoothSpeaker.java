class BluetoothSpeaker{

		static string brand ="Boat";
		static double price = 2500.00;
		static String color ="red";
		static boolen isConnected;
	// Ac, Tv, grinder, Microwave, WashingMachine.
	public static void onoroff(){
	System.out.println("invoking onoroff()");
	if(isConnected == false){
	isConnected=true;
	System.out.println("Speaker is turned onn...Available for connect");
	}
	else if (isConnected==true){
	isConnected=false;
	System.out.println("Speaker is turned off...");
	}
	System.out.println("end");
	}
	
		public static void main (String a[]){
		onOroff();
		onOroff();
		}

		public static void increaseVolume(){
			System.out.println("increaseVolume method started");
			if(isConnected == true){
				System.out.println("Speaker is turned onn");
			if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
					System.out.println("the currentVolume is:"+currentVolume);
			}
			else if{
				System.out.println("max volume reached");
			}
			else if{
				System.out.println("please turn on the Speaker");
			}
			}
			
			
			System.out.println("increaseVolume method ended");
		}
		
		
		public static void decreaseVolume(){
			System.out.println("increaseVolume method started");
			if(isConnected == true){
				System.out.println("Speaker is turned onn");
			if(currentVolume > minVolume){
				currentVolume = currentVolume - 1;
					System.out.println("the currentVolume is:"+currentVolume);
			}
			else if{
				System.out.println("max volume reached");
			}
			else if{
				System.out.println("please turn on the Speaker");
			}
			}
			
			
			System.out.println("increaseVolume method ended");



}