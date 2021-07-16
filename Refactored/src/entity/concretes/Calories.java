package entity.concretes;

import java.util.HashMap;

public class Calories {

	private HashMap<String, Double> calorieHashMap = new HashMap<>();


	

	public HashMap<String, Double> getCalorieHashMap() {
		this.calorieHashMap.put("Eggplant", 25.0);
		this.calorieHashMap.put("Olive Oil", 884.0);
		this.calorieHashMap.put("Green Pepper", 28.0);
		this.calorieHashMap.put("Minced Meat", 240.0);
		this.calorieHashMap.put("Tomato Souce", 74.0);
		this.calorieHashMap.put("Garlic", 149.0);
		this.calorieHashMap.put("Black Pepper", 251.0);
		this.calorieHashMap.put("Salt", 1.0);
		this.calorieHashMap.put("Red Pepper", 37.0);
		this.calorieHashMap.put("Parsley", 37.0);
		this.calorieHashMap.put("Onion", 40.0);
		this.calorieHashMap.put("Tomato", 19.0);
		this.calorieHashMap.put("Yogurt", 112.0);
		return calorieHashMap;
	}

	public void setCalorieHashMap(HashMap<String, Double> calorieHashMap) {
		this.calorieHashMap = calorieHashMap;
	}



}
