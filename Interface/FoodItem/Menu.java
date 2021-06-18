//This class is inheriting the Interface(IFoodItemOperations)

public class Menu implements IFoodItemOperations{
	public FoodItem items[];
	
	public Menu(){}
	public Menu(int sizeOfArray)
	{
		items=new FoodItem[sizeOfArray];
	}
	
	public void addFoodItem(FoodItem f){
		for(int i=0;i<items.length;i++)
		{
			if(items[i]==null)
			{
				items[i]=f;
				break;
			}
		}
	}
	
	public void removeFoodItem(FoodItem f){
		for(int i=0;i<items.length;i++)
		{
			if(items[i]==f)
			{
				items[i]=null;
				break;
			}
		}
	}
	
	public FoodItem getFoodItem(int id){
		FoodItem f=null;
		for(int i=0;i<items.length;i++)
		{
			if(items[i]!=null)
			{
				if(items[i].getId()==id)
				{
					f=items[i];
					break;
				}
			}
		}
		return f;
	}
	
	public void showAllFoodItems(){
		for(int i=0;i<items.length;i++)
		{
			if(items[i]!=null)
			{
				System.out.println("-----------------------");
				items[i].showDetails();
				System.out.println();
			}
		}
	}
}