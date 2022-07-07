public class MusicPlayerDTO{
	
	
	public MusicPlayerDTO(){
		
	}


	private String name;
	private boolean isAvailable;
	private int number;
	private int price;
	private boolean subscription;
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	public boolean getIsAvailable(){
		return isAvailable;
	}
	public void setIsAvailable(boolean isAvailable){
		this.isAvailable=isAvailable;
	}
	
	
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number=number;
	}
	
	
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	
	public boolean getSubscription(){
		return subscription;
	}
	public void setSubscription(boolean subscription){
		this.subscription=subscription;
	}
	
	public static void toListen(){
		System.out.println("Music heals");
	}
}