package business.concretes;

import business.abstracts.Recipe;

public class AliNazikRecipe implements Recipe {

	@Override
	public void recipe() {
		System.out.println("First, wash the eggplants and pierce the tops with a fork and roast in the oven or on the stove.\r\n"
				+ "After peeling the roasted eggplants, chop them finely and put them on a serving plate.\r\n"
				+ "Crush the garlic and add it into the strained yogurt. Add olive oil in a sauce pan.\r\n"
				+ "Add the minced meat, tomato paste and previously chopped peppers. Fry the ground beef well until it turns color. Season with salt and spices.\r\n"
				+ "Serve hot on a serving plate by putting the roasted and chopped eggplant, garlic yogurt and minced meat mixture.");
		
	}

	@Override
	public void ingredients() {
		System.out.println("Ingredients\n********************\n"+"5 eggplant\r\n"
				+ "4 cloves of garlic\r\n"
				+ "50 ml of yogurt\r\n"
				+ "3 tablespoon Olive Oil\r\n"
				+ "900 g medium-fat ground beef\r\n"
				+ "1 tablespoon tomato paste\r\n"
				+ "2 green pepper\r\n"
				+ "Salt\r\n"
				+ "Black pepper\r\n"
				+ "Red pepper");
		
	}

}
