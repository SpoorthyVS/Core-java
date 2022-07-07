class NovelTester{

	public static void main(String a[]){
	
	NovelDTO nov = new NovelDTO();
	nov.setName("The blue umbrella");
	nov.setEdition(61.32);
	nov.setPapers(81);
	nov.setPrice(266);
	nov.setReview(4.5);
	nov.toRead();
	
	System.out.println("The name of the book is "+nov.getName()+" and the edition is "+nov.getEdition()+"........... it has "+nov.getPapers()+" papers "+"......... the price of the book is "+nov.getPrice()+"........the review is "+nov.getReview()+" ........ ");
	
	}







}