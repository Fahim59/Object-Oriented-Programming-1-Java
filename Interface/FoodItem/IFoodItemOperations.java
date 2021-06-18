//This is interface

public interface IFoodItemOperations{
	
	public void addFoodItem(FoodItem f);
	
	public void removeFoodItem(FoodItem f);
	
	public FoodItem getFoodItem(int id);
	
	public void showAllFoodItems();
}