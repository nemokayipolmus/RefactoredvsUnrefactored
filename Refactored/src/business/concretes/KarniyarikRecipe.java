package business.concretes;

import business.abstracts.Recipe;
import entity.concretes.Foods;

public class KarniyarikRecipe implements Recipe{


	@Override
	public void recipe() {
		
		System.out.println(
				"Strip the eggplants and soak them in salt water for half an hour so that they do not absorb oil.\r\n"
						+ "After washing thoroughly, drain the water with a towel and fry in a little oil. Fry all 3 peppers in oil.\r\n"
						+ "Then fry the chopped onions in the same pan, add the minced meat and fry for a while and fry for 2 more minutes by adding the peppers and garlic.\r\n"
						+ "Add 2 tomatoes, salt and spices that you have cut into cubes and mix.\r\n"
						+ "Boil for 5 minutes by adding a cup of water on it.\r\n"
						+ "Place the eggplants in the tray by cutting the middle and press these cuts into the eggplant to make room for the filling and fill the eggplants with the material.\r\n"
						+ "On the eggplants you filled, divide the cherry tomato that you cut in half or 1 tomato in equal size and put one of the peppers we fried.\r\n"
						+ "In a separate place, crush 1 spoon of tomato paste in 1 glass of hot water and pour between the eggplants. Do not pour the minced meat on it, lest it come out.\r\n"
						+ "Then put it in the oven that you have heated at 170 degrees and bake for 20-25 minutes. If you wish, you can do this in a pot such as a rice pan on the stove. It will be cooked in the pot at the same time.");
		
	}

	@Override
	public void ingredients() {
		System.out.println("Ingredients\n********************\n"+"6 pieces of eggplant\r\n"

				+ "6 tablespoons of olive oil\r\n"

				+ "1 onion\r\n"

				+ "2 green peppers (for filling)\r\n"

				+ "350 grams of minced meat\r\n"

				+ "2 garlic\r\n"

				+ "1 tablespoon tomato paste\r\n"

				+ "Salt\r\n"

				+ "Black pepper\r\n"

				+ "2 tomatoes\r\n"

				+ "6 green peppers\r\n"

				+ "3 parsley");
		
	}

}
