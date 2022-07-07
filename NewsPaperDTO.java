public class NewsPaperDTO{

	public NewsPaperDTO(){
		
	}
	private String name;
	private boolean today;
	private int date;
	private int price;
	private double review;
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	public boolean getToday(){
		return today;
	}
	public void setToday(boolean today){
		this.today=today;
	}
	
	
	public int getDate(){
		return date;
	}
	public void setDate(int date){
		this.date=date;
	}
	
	
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	
	public double getReview(){
		return review;
	}
	public void setReview(double review){
		this.review=review;
	}
	
	public static void knowledge(){
		System.out.println("Newspaper givves daily based informations");
	}
}