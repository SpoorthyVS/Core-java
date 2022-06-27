class Movie{
	
	static String movies[] = {"charlie 777","vikram","Bhool bhulaiyya","KGF2"};
	
	public static void main (String a[]){
		String value = getMovie("Avengers");
		System.out.println("come... we will watch "+value);
		
	}
	public static String getMovie(String movie){
		String movieName = null;
		for(int i=0; i< movies.length ; i++){
			if (movies[i] == movie){
				movieName = movies[i];
				
				
			}
		
		}
	return movieName;
	}
    
}