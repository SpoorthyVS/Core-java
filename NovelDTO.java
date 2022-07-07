public class NovelDTO{

	public NovelDTO(){
		
	}
	private String name;
	private double edition;
	private int papers;
	private int price;
	private double review;
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	public double getEdition(){
		return edition;
	}
	public void setEdition(double edition){
		this.edition=edition;
	}
	
	
	public int getPapers(){
		return papers;
	}
	public void setPapers(int papers){
		this.papers=papers;
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
	
	public static void toRead(){
		System.out.println("This is a very good novel book");
	}




}