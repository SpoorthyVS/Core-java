interface Hotel{

	public boolean createFoodItem(FoodItemsDTO foodItem);
	public void getFoodItemDetails();
	public boolean updatePriceByName(String name, int price);
	public boolean deleteByName(String name);
	public boolean deleteById(int id);
	



}