package business.concretes;

import business.abstracts.Recipe;

public class PatlicanKebabiRecipe implements Recipe {

	@Override
	public void recipe() {
		System.out.println("First of all, put the ground beef for kebab in a deep bowl. \r\n"
				+ "Add the garlic, tomato paste, salt and spices over the minced meat, mix and knead well. \r\n"
				+ "Divide the eggplants into three or quarters of equal size. The bottle, which is wide in width, \r\n"
				+ "first add the eggplant, then the walnut-sized meat and shape it by squeezing it with your hand. \r\n "
				+ "Arrange it one by one until the tip of the bottle. Prepare the remaining skewers in the same way. \r\n"
				+ "Preheat the grill section of the oven or the grill.\r\n "
				+ "Bake in the grill until golden brown or in the oven for 30-35 minutes at 180 degrees Roast the peppers and tomatoes. \r\n"
				+ "Place the eggplant skewer, roasted tomatoes on it. \r\n"
				+ "Bon appetit already. \r\n");
		
	}

	@Override
	public void ingredients() {
		System.out.println("Ingredients\n********************\n"+"3 eggplant \r\n"
				+ "500 gram minced meat\r\n"
				+ "2 garlic\r\n"
				+ "2 tablespoon tomato souce\r\n"
				+ "Salt\r\n"
				+ "Black pepper\r\n"
				+ "Red pepper\r\n"
				+ "5 green peppers\r\n"
				+ "3 tomatoes");
		
	}

}
