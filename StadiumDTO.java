public class StadiumDTO{
	
	public StadiumDTO(){
		
	}
	private String name;
	private String address;
	private int seatNo;
	private double area;
	private long contactNumber;
	
	
	public String getName(){
		return name;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String getAddress(){
		return address;
	}
	
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getSeatNo(){
		return seatNo;
	}
	
	public void setSeatNo(int seatNo){
		this.seatNo = seatNo;
	}

	
	public double getArea(){
		return area;
	}
	
	public void setArea(double area){
		this.area = area;
	}
	
	public long getContactNumber(){
		return contactNumber;
	}
	
	public void setContactNumber(long contactNumber){
		this.contactNumber = contactNumber;
	}

	public static void playSports(){
		System.out.println("WE CAN PALY DIFFERENT TYPESOF SPORTS AS IT HAS VAST SPACE");
	}
}