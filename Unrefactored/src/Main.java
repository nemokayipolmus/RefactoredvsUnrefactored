import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {
		
		double eggplant = 25.0;
		double oliveOlive = 884.0;
		double onion = 40.0;
		double greenPepper = 28.0;
		double mincedMeat = 240.0;
		double tomatoSouce = 74.0;
		double garlic = 149.0;
		double tomato = 19.0;
		double parsley = 37.0;
		double blackPepper = 251.0;
		double salt = 1.0;
		double redPepper = 37.0;
		double yogurt = 112.0;
		
		System.out.println("Ingredients\n"+"************************************\n"+"6 pieces of eggplant\r\n"

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
		System.out.println("************************************");

		System.out.println(
				"Strip the eggplants and soak them in salt water for half an hour so that they do not absorb oil.\r\n"
						+ "After washing thoroughly, drain the water with a towel and fry in a little oil. Fry all 3 peppers in oil.\r\n"
						+ "Then fry the chopped onions in the same pan, add the minced meat and fry for a while and fry for 2 more minutes by adding the peppers and garlic.\r\n"
						+ "Add 2 tomatoes, salt and spices that you have cut into cubes and mix.\r\n"
						+ "Boil for 5 minutes by adding a cup of water on it.\r\n"
						+ "Place the eggplants in the tray by cutting the middle and press these cuts into the eggplant to make room for the filling and fill the eggplants with the material.\r\n"
						+ "On the eggplants you filled, divide the cherry tomato that you cut in half or 1 tomato in equal size and put one of the peppers we fried.\r\n"
						+ "In a separate place, crush 1 spoon of tomato paste in 1 glass of hot water and pour between the eggplants. Do not pour the minced meat on it, lest it come out.\r\n"
						+ "Then put it in the oven that you have heated at 170 degrees and bake for 20-25 minutes. If you wish, you can do this in a pot such as a rice pan on the stove. It will be cooked in the pot at the same time.\r\n");
	
		System.out.println("Ingredients\n"+"************************************\n"+"5 eggplant\r\n"
				+ "4 cloves of garlic\r\n"
				+ "50 ml of yogurt\r\n"
				+ "3 tablespoon Olive Oil\r\n"
				+ "900 g medium-fat ground beef\r\n"
				+ "1 tablespoon tomato paste\r\n"
				+ "2 green pepper\r\n"
				+ "Salt\r\n"
				+ "Black pepper\r\n"
				+ "Red pepper");
		System.out.println("************************************");

		System.out.println("First, wash the eggplants and pierce the tops with a fork and roast in the oven or on the stove.\r\n"
				+ "After peeling the roasted eggplants, chop them finely and put them on a serving plate.\r\n"
				+ "Crush the garlic and add it into the strained yogurt. Add olive oil in a sauce pan.\r\n"
				+ "Add the minced meat, tomato paste and previously chopped peppers. Fry the ground beef well until it turns color. Season with salt and spices.\r\n"
				+ "Serve hot on a serving plate by putting the roasted and chopped eggplant, garlic yogurt and minced meat mixture.\r\n");
	
		System.out.println("Ingredients\n"+"************************************\n"+"3 eggplant \r\n"
				+ "500 gram minced meat\r\n"
				+ "2 garlic\r\n"
				+ "2 tablespoon tomato souce\r\n"
				+ "Salt\r\n"
				+ "Black pepper\r\n"
				+ "Red pepper\r\n"
				+ "5 green peppers\r\n"
				+ "3 tomatoes");
		System.out.println("************************************");
		
		System.out.println("First of all, put the ground beef for kebab in a deep bowl. \r\n"
				+ "Add the garlic, tomato paste, salt and spices over the minced meat, mix and knead well. \r\n"
				+ "Divide the eggplants into three or quarters of equal size. The bottle, which is wide in width, \r\n"
				+ "first add the eggplant, then the walnut-sized meat and shape it by squeezing it with your hand.\r\n "
				+ "Arrange it one by one until the tip of the bottle. Prepare the remaining skewers in the same way. r\n"
				+ "Preheat the grill section of the oven or the grill. \r\n "
				+ "Bake in the grill until golden brown or in the oven for 30-35 minutes at 180 degrees Roast the peppers and tomatoes. \r\n"
				+ "Place the eggplant skewer, roasted tomatoes on it. \r\n"
				+ "Bon appetit already. \r\n");
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Calorie Information");
		System.out.println("************************************");

				
				String karniyarikcalorieString = df.format(12*eggplant+0.3*oliveOlive+0.7543*onion+
						4*greenPepper+3.25*mincedMeat+0.1*tomatoSouce+0.05*garlic+2.05*tomato+0.05*blackPepper+
						0.05*salt+0.05*redPepper+1*parsley);
		
				System.out.println("Total Calorie of Karniyarik is "+karniyarikcalorieString);
			
				System.out.println("************************************");

					
				String patlicankebabiString = df.format(6*eggplant+1.25*greenPepper+
						5*mincedMeat+0.1*tomatoSouce+0.08*garlic+2*tomato+0.05*blackPepper+
						0.05*salt+0.05*redPepper);
					
				System.out.println("Total Calorie of Patlican Kebabi is "+patlicankebabiString);

				
				System.out.println("************************************");

				String alinazikCalorieString = df.format((6*eggplant+0.6*oliveOlive+0*onion+
				0.5*greenPepper+9*mincedMeat+0.1*tomatoSouce+0.16*garlic+0*tomato+0.05*blackPepper+
				0.05*salt+0.05*redPepper+0*parsley+0.5*yogurt));
		
				System.out.println("Total Calorie of Alinazik is "+alinazikCalorieString);
		

		
	
	}
	
			
			
	}
		
	
		
	

