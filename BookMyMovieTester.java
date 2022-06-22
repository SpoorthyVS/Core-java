class BookMyMovieTester{

	public static void main(String a[]){
		String movies[] = {"OM","Gaalipata","A","Uperndra","Paramathma","Amrutha dhare","kittuputtu"};
		String snacks[] = {"potato chips","Popcorn","Samosa","coco cola","Sprite"};
		BookMyMovie bookMyShow = new BookMyMovie("navarang",150,movies);
		bookMyShow.showTime(20, "Pavan", "Paramathma");
		bookMyShow.buySnacks("potato chips",4,18);
	}



}