public class AirportDTO{

	public AirportDTO(){
		
		
	}
	private String name;
	private int id;
	private String type;
	private int noOfFlight;
	private char turminalName;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}

	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	public int getNoOfFlight(){
		return noOfFlight;
	}
	
	public void setNoOfFlight(int noOfFlight){
		this.noOfFlight=noOfFlight;
	}
	
	public char getTurminalName(){
		return turminalName;
	}
	
	
	public void setTurminalName(char turminalName){
		this.turminalName=turminalName;
	}


	public static void canTravel(){
		System.out.println("We can travel through out the world");
	}







}