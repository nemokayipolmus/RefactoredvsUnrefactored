package entity.concretes;

import java.util.HashMap;
import java.util.Map;

import business.concretes.AliNazikRecipe;
import business.concretes.FoodManager;
import business.concretes.KarniyarikRecipe;
import business.concretes.PatlicanKebabiRecipe;
import business.concretes.UnitManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Double> karniyarikMap = new HashMap<String,Double>();
		HashMap<String,Double> patlicanKebabiMap = new HashMap<String,Double>();
		HashMap<String,Double> aliNazikMap = new HashMap<String,Double>();
		FoodManager foodManager = new FoodManager();
		Unit unit = new Unit();
		UnitManager unitManager = new UnitManager();
		Calories calories = new Calories();
		karniyarikMap.put("Eggplant", unitManager.convertUnitToGram(new Gram(),1200.0));
		karniyarikMap.put("Green Pepper", unitManager.convertUnitToGram(new Gram(),125.0));
		karniyarikMap.put("Minced Meat", unitManager.convertUnitToGram(new Gram(),350.0));
		karniyarikMap.put("Tomato", unitManager.convertUnitToGram(new Gram(),210.0));
		karniyarikMap.put("Salt", unitManager.convertUnitToGram(new TeaSpoon(),3.0));
		karniyarikMap.put("Olive Oil", unitManager.convertUnitToGram(new TableSpoon(),3.0));
		karniyarikMap.put("Green Pepper", unitManager.convertUnitToGram(new Gram(),200.0));
		karniyarikMap.put("Tomato Souce", unitManager.convertUnitToGram(new TableSpoon(),1.0));
		karniyarikMap.put("Garlic", unitManager.convertUnitToGram(new Gram(),8.0));
		karniyarikMap.put("Black Pepper", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		karniyarikMap.put("Salt", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		karniyarikMap.put("Red Pepper", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		karniyarikMap.put("Parsley", unitManager.convertUnitToGram(new Gram(),75.0));
		karniyarikMap.put("Onion",unitManager.convertUnitToGram(new Gram(),75.0));
	 

		patlicanKebabiMap.put("Eggplant", unitManager.convertUnitToGram(new Gram(),600.0));
		patlicanKebabiMap.put("Green Pepper", unitManager.convertUnitToGram(new Gram(),125.0));
		patlicanKebabiMap.put("Minced Meat", unitManager.convertUnitToGram(new Gram(),500.0));
		patlicanKebabiMap.put("Tomato", unitManager.convertUnitToGram(new Gram(),200.0));
		patlicanKebabiMap.put("Salt", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		patlicanKebabiMap.put("Garlic", unitManager.convertUnitToGram(new Gram(),8.0));
		patlicanKebabiMap.put("Black Pepper", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		patlicanKebabiMap.put("Red Pepper", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		patlicanKebabiMap.put("Tomato Souce", unitManager.convertUnitToGram(new TableSpoon(),1.0));
		
		aliNazikMap.put("Eggplant", unitManager.convertUnitToGram(new Gram(),600.0));
		aliNazikMap.put("Olive Oil",unitManager.convertUnitToGram(new TableSpoon(),6.0));
		aliNazikMap.put("Green Pepper", unitManager.convertUnitToGram(new Gram(),50.0));
		aliNazikMap.put("Minced Meat",unitManager.convertUnitToGram(new Gram(),900.0));
		aliNazikMap.put("Tomato Souce", unitManager.convertUnitToGram(new TableSpoon(),1.0));
		aliNazikMap.put("Garlic", unitManager.convertUnitToGram(new Gram(),16.0));
		aliNazikMap.put("Black Pepper", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		aliNazikMap.put("Salt", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		aliNazikMap.put("Red Pepper", unitManager.convertUnitToGram(new TeaSpoon(),1.0));
		aliNazikMap.put("Yogurt", unitManager.convertUnitToGram(new Ml(),50.0));
		
		
		
		Foods karniyarik = new Foods(karniyarikMap);
		karniyarik.setName("Karnýyarýk");
		Foods patlicanKebabi = new Foods(patlicanKebabiMap);
		patlicanKebabi.setName("Patlýcan Kebabý");
		Foods aliNazik = new Foods(aliNazikMap);
		aliNazik.setName("Ali Nazik");
	
	
		foodManager.foodDetail(new KarniyarikRecipe());
		System.out.println();
		
		foodManager.foodDetail(new AliNazikRecipe());
		System.out.println();
		foodManager.foodDetail(new PatlicanKebabiRecipe());
		
		System.out.println("Calorie Information\n**************");
		foodManager.totalCalorie(karniyarik);
		System.out.println("**************");
		foodManager.totalCalorie(patlicanKebabi);
		System.out.println("**************");
		foodManager.totalCalorie(aliNazik);
		
		
		

		

	}

}
