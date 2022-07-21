interface Library{


	public boolean searchBook(BookDTO dto);
	public void getBookDetails();
	public boolean UpdateBookPriceById(int id , int price);
	public boolean UpdateBookPriceByName(String name , int price);
	public boolean deleteBookById(int id);
	public boolean deleteBookByName(String name;
	


}