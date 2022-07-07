class NewsPaperTester{

	public static void main(String a[]){
	
	NewsPaperDTO news = new NewsPaperDTO();
	news.setName("Times of India");
	news.setToday(true);
	news.setDate(4);
	news.setPrice(5);
	news.setReview(4.3);
	news.knowledge();
	
	System.out.println("The name of the paper is "+news.getName()+" is it todays paper "+news.getToday()+"........... it date is "+news.getDate()+"......... the price of the paper is "+news.getPrice()+"........the review is "+news.getReview()+" ........ ");
	
	}







}