package business.concretes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import business.abstracts.Recipe;
import entity.concretes.Calories;
import entity.concretes.Foods;

public class FoodManager {
	

   public void foodDetail(Recipe recipe) {
	   
       recipe.ingredients();
       System.out.println("**************************");
	   recipe.recipe();
	   
   }
	
	public void totalCalorie(Foods product) {
		double calorie=0;
		Calories calories = new Calories();
		for ( String key : product.getMap().keySet()) {
			calorie +=(calories.getCalorieHashMap().get(key)*product.getMap().get(key))/100;
				
		}
		System.out.println("Total calorie of "+product.getName()+" is "+calorie);
		
	}
	

	



}
