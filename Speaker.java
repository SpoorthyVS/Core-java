class Speaker{

	String name ;
	static boolean isConnected ;//when the returntype is void then the return value at end is a option if not it is mandatory//
	static int maxVolume = 8;
	static int minVolume ;
	static int currentVolume ;
	
	public Speaker(String name){
		this.name = name;
		
	}

	public static boolean onOrOff()
	{
	System.out.println("Inside onOrOff()");
		if (isConnected == false)
		{
			isConnected = true;
			System.out.println("Speaker on aythu song hakooo");
		}
		else if (isConnected == true)
		{
			isConnected = false;
			System.out.println("Speaker off agide on mado pedda");
		}

	System.out.println("end of onOrOff");
	
	return isConnected;
	}
	
	
	
	public static void increaseVolume(){
		System.out.println("inside increaseVolume");
			if (isConnected == true){
			
		
		
			if (currentVolume < maxVolume)
			{
				currentVolume = currentVolume + 1 ;
				System.out.println("current volume is: "+ currentVolume);	
			}
			else
			{
				System.out.println("Max volume reached");
			}
			}
			else{
				
				System.out.println("gube speaker on madu");
			}
		
		
		System.out.println("end of increaseVolume");
		
		
	}
	
}