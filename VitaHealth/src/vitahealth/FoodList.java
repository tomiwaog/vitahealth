package vitahealth;

public class FoodList {

	//List of Vitamins
	private static Vitamins vitA = Vitamins.createVitamins("Vitamin A","Retinol", "", "Liver");
	private static Vitamins vitB1Thiamine = Vitamins.createVitamins("Vitamin B1", "Thiamine","", "Not Stored");
	private static Vitamins vitB2RiboFlavin = Vitamins.createVitamins("Vitamin B2","Riboflavin","","");
	private static Vitamins vitB3Niacin = Vitamins.createVitamins("Vitamin B3","Niacin","","");
	private static Vitamins vitB5Pantothenic = Vitamins.createVitamins("Vitamin B5","Pantothenic acid","","");
	private static Vitamins vitB6 = Vitamins.createVitamins("Vitamin B6","","","");
	private static Vitamins vitB9Folate = Vitamins.createVitamins("Vitamin B9","Folate Folic acid","","");
	private static Vitamins vitB12 = Vitamins.createVitamins("Vitamin B12","Cobalamin","","");
	private static Vitamins vitC = Vitamins.createVitamins("Vitamin C", "L-ascorbic acid", "", "Not Stored");
	private static Vitamins vitD = Vitamins.createVitamins("Vitamin D", "Calcitriol", "", "Liver");
	private static Vitamins vitE = Vitamins.createVitamins("Vitamin E", "Alpha Tocopherol", "","");
	private static Vitamins vitK = Vitamins.createVitamins("Vitamin K", "", "", "");
	private static Vitamins calcium = Vitamins.createVitamins("Calcium", "", "", "");
	private static Vitamins iron = Vitamins.createVitamins("Iron", "", "", "");
	private static Vitamins magnesium = Vitamins.createVitamins("Magnesium", "", "", "");
	private static Vitamins phosphorus = Vitamins.createVitamins("Phosphorus", "", "", "");
	private static Vitamins potassium = Vitamins.createVitamins("Potassium", "", "", "");
	private static Vitamins sodium = Vitamins.createVitamins("Sodium", "", "", "");
	private static Vitamins zinc = Vitamins.createVitamins("Zinc", "", "", "");
	private static Vitamins copper = Vitamins.createVitamins("Copper", "", "", "");
	private static Vitamins manganese = Vitamins.createVitamins("Manganese", "", "", "");
	private static Vitamins selenium = Vitamins.createVitamins("Selenium", "", "", "");
	private static Vitamins fibre = Vitamins.createVitamins("Fibre", "", "", "");
	private static Vitamins omega3 = Vitamins.createVitamins("Omega 3", "", "", "");
	private static Vitamins omega6 = Vitamins.createVitamins("Omega 6", "", "", "");
	private static Vitamins waterNutrient = Vitamins.createVitamins("Water", "", "", "");
	

	public static Food calcSweetPotatoes(){
		Food sweetPotatoes = Food.createFood("Sweet Potatoes (1 medium)", 103, "Orange");
		// Sweet Potatoes
		sweetPotatoes.addVitamins(vitA, "14187IU");
		sweetPotatoes.addVitamins(vitB1Thiamine, "0.1mg");
		sweetPotatoes.addVitamins(vitB2RiboFlavin, "0.1mg");
		sweetPotatoes.addVitamins(vitB3Niacin, "1.7mg");
		sweetPotatoes.addVitamins(vitB5Pantothenic, "1.0mg");
		sweetPotatoes.addVitamins(vitB6 , "0.3mg");
		sweetPotatoes.addVitamins(vitB9Folate , "6.8mcg");
		sweetPotatoes.addVitamins(vitB12, "0.0mcg");
		sweetPotatoes.addVitamins(vitC, "3.1mg");
		sweetPotatoes.addVitamins(vitE , "0.8mg");
		sweetPotatoes.addVitamins(vitK ,"2.6mcg");
		sweetPotatoes.addVitamins(calcium ,"43.3mg");
		sweetPotatoes.addVitamins(iron ,"0.8mg");
		sweetPotatoes.addVitamins(magnesium ,"30.8mg");
		sweetPotatoes.addVitamins(phosphorus ,"61.6mg");
		sweetPotatoes.addVitamins(potassium ,"541mg");
		sweetPotatoes.addVitamins(sodium ,"41.0mg");
		sweetPotatoes.addVitamins(zinc ,"0.4mg");
		sweetPotatoes.addVitamins(copper,"0.2mg");
		sweetPotatoes.addVitamins(manganese,"0.6mg");
		sweetPotatoes.addVitamins(selenium ,"0.2mcg");
		//sweetPotatoes.getVitaminsData();
		
		Food.addToDietQueryList(sweetPotatoes);
		return sweetPotatoes;
	}
	
	public static void calcPotatoes(){
		// Potatoes
		Food potatoes = new Food("Potatoes (medium)", 103, "Orange");
		potatoes.addVitamins(vitA, "17.3IU");
		potatoes.addVitamins(vitB1Thiamine, "0.1mg");
		potatoes.addVitamins(vitB2RiboFlavin, "0.1mg");
		potatoes.addVitamins(vitB3Niacin, "2.4mg");
		potatoes.addVitamins(vitB5Pantothenic, "0.7mg");
		potatoes.addVitamins(vitB6, "0.5mg");
		potatoes.addVitamins(vitB9Folate, "48.4mcg");
		potatoes.addVitamins(vitB12, "0.0mcg");
		potatoes.addVitamins(vitC, "16.6mg");
		potatoes.addVitamins(vitE, "0.1mg");
		potatoes.addVitamins(vitK, "3.5mcg");
		potatoes.addVitamins(potassium ,"926mg");
		potatoes.addVitamins(manganese,"0.4mg");
		potatoes.addVitamins(calcium,"25.9mg");
		potatoes.addVitamins(iron,"1.9mg");
		potatoes.addVitamins(magnesium,"48.4mg");
		potatoes.addVitamins(phosphorus,"121mg");
		potatoes.addVitamins(sodium,"17.3mg");
		potatoes.addVitamins(zinc,"0.6mg");
		potatoes.addVitamins(copper,"0.2mg");
		potatoes.addVitamins(selenium,"0.7mg");
		Food.addToDietQueryList(potatoes);
	}
	
	public static void calcAlmonds(){
		// Almonds Data based on 28g i.e. 1 ounce
		Food almonds = new Food("Almonds 28g", 163,"Brown, Orange");
		almonds.addVitamins(vitA, "0.3IU");
		almonds.addVitamins(vitB1Thiamine, "0.1mg");
		almonds.addVitamins(vitB2RiboFlavin, "0.3mg");
		almonds.addVitamins(vitB3Niacin, "0.9mg");
		almonds.addVitamins(vitB5Pantothenic, "0.1mg");
		almonds.addVitamins(vitB6, "0.01mg");
		almonds.addVitamins(vitB9Folate, "14.0mcg");
		almonds.addVitamins(vitB12, "0.0mcg");
		almonds.addVitamins(vitC, "0.0mg");
		almonds.addVitamins(vitE, "7.3mg");
		almonds.addVitamins(vitK, "0.0mg");
		almonds.addVitamins(calcium ,"73.9mg");
		almonds.addVitamins(iron ,"1.0mg");
		almonds.addVitamins(magnesium ,"75.0mg");
		almonds.addVitamins(phosphorus ,"136mg");
		almonds.addVitamins(potassium ,"197mg");
		almonds.addVitamins(sodium ,"0.3mg");
		almonds.addVitamins(zinc ,"0.9mg");
		almonds.addVitamins(copper,"0.4mg");
		almonds.addVitamins(manganese,"0.6mg");
		almonds.addVitamins(selenium,"0.7mcg");
		almonds.addVitamins(fibre,"3.4mg");
		almonds.addVitamins(omega3,"1.7mg");
		almonds.addVitamins(omega6,"3378mg");
		
		Food.addToDietQueryList(almonds);
	}

	public static void calcLemon(){
		// Lemon
		Food lemon = new Food("Lemon (medium)", 17,"Clear");
		lemon.addVitamins(vitA, "32.4IU" );
		lemon.addVitamins(vitC, "83.2mg" );
		lemon.addVitamins(vitB1Thiamine, "0.1mg" );
		lemon.addVitamins(vitB2RiboFlavin, "0.01mg" );
		lemon.addVitamins(vitB3Niacin, "0.2mg" );
		lemon.addVitamins(vitB6, "0.1mg" );
		lemon.addVitamins(vitB5Pantothenic, "0.3mg" );
		lemon.addVitamins(calcium, "65.9mg" );
		lemon.addVitamins(iron, "0.8mg" );
		lemon.addVitamins(magnesium, "13.0mg" );
		lemon.addVitamins(phosphorus, "16.2mg" );
		lemon.addVitamins(potassium, "157mg" );
		lemon.addVitamins(sodium, "3.2mg" );
		lemon.addVitamins(zinc, "0.1mg" );
		lemon.addVitamins(copper, "0.3mg" );
		Food.addToDietQueryList(lemon);
	}
	
	public static void calcKiwi(){
		// Kiwi
		Food kiwi = new Food("Kiwi (medium)", 42,"Clear");
		kiwi.addVitamins(vitA, "66.1IU" );
		kiwi.addVitamins(vitC, "70.5mg" );
		kiwi.addVitamins(vitE, "1.1mg");
		kiwi.addVitamins(vitK, "30.6mcg");
		kiwi.addVitamins(vitB1Thiamine, "0.01mg" );
		kiwi.addVitamins(vitB2RiboFlavin, "0.01mg" );
		kiwi.addVitamins(vitB3Niacin, "0.3mg" );
		kiwi.addVitamins(vitB6, "0.01mg" );
		kiwi.addVitamins(vitB9Folate, "19.0mcg");
		kiwi.addVitamins(vitB5Pantothenic, "0.1mg" );
		
		//Minerals
		kiwi.addVitamins(calcium, "25.8mg" );
		kiwi.addVitamins(iron, "0.2mg" );
		kiwi.addVitamins(magnesium, "12.9mg" );
		kiwi.addVitamins(phosphorus, "25.8mg" );
		kiwi.addVitamins(potassium, "237mg" );
		kiwi.addVitamins(sodium, "2.3mg" );
		kiwi.addVitamins(zinc, "0.1mg" );
		kiwi.addVitamins(copper, "0.1mg" );
		kiwi.addVitamins(manganese, "0.1mg");
		kiwi.addVitamins(selenium, "0.2mcg");
		Food.addToDietQueryList(kiwi);
	}
	
	public static void calcCarrots(){
		// Carrot
		Food carrot = new Food("Carrot (medium)", 25,"Clear");
		carrot.addVitamins(vitA, "10190IU" );
		carrot.addVitamins(vitC, "3.6mg" );
		carrot.addVitamins(vitE, "0.4mg");
		carrot.addVitamins(vitK, "8.1mcg");
		carrot.addVitamins(vitB1Thiamine, "0.01mg" );
		carrot.addVitamins(vitB2RiboFlavin, "0.01mg" );
		carrot.addVitamins(vitB3Niacin, "0.6mg" );
		carrot.addVitamins(vitB6, "0.1mg" );
		carrot.addVitamins(vitB9Folate, "11.6mcg");
		carrot.addVitamins(vitB5Pantothenic, "0.2mg" );
		
		//Minerals
		carrot.addVitamins(calcium, "20.1mg" );
		carrot.addVitamins(iron, "0.2mg" );
		carrot.addVitamins(magnesium, "7.3mg" );
		carrot.addVitamins(phosphorus, "21.4mg" );
		carrot.addVitamins(potassium, "195mg" );
		carrot.addVitamins(sodium, "42.1mg" );
		carrot.addVitamins(zinc, "0.1mg" );
		carrot.addVitamins(copper, "0.01mg" );
		carrot.addVitamins(manganese, "0.1mg");
		carrot.addVitamins(selenium, "0.1mcg");
		Food.addToDietQueryList(carrot);
	}
	
	public static void calcBananas(){
		// Bananas
		Food bananas = new Food("Banana (medium)", 105,"Clear");
		bananas.addVitamins(vitA, "75.5IU" );
		bananas.addVitamins(vitC, "10.3mg" );
		bananas.addVitamins(vitE, "0.1mg");
		bananas.addVitamins(vitK, "0.6mcg");
		bananas.addVitamins(vitB1Thiamine, "0.01mg" );
		bananas.addVitamins(vitB2RiboFlavin, "0.1mg" );
		bananas.addVitamins(vitB3Niacin, "0.8mg" );
		bananas.addVitamins(vitB6, "0.4mg" );
		bananas.addVitamins(vitB9Folate, "23.6mcg");
		bananas.addVitamins(vitB5Pantothenic, "0.4mg" );
		
		//Minerals
		bananas.addVitamins(calcium, "5.9mg" );
		bananas.addVitamins(iron, "0.3mg" );
		bananas.addVitamins(magnesium, "31.9mg" );
		bananas.addVitamins(phosphorus, "26.0mg" );
		bananas.addVitamins(potassium, "422mg" );
		bananas.addVitamins(sodium, "1.2mg" );
		bananas.addVitamins(zinc, "0.2mg" );
		bananas.addVitamins(copper, "0.1mg" );
		bananas.addVitamins(manganese, "0.3mg");
		bananas.addVitamins(selenium, "1.2mcg");
		Food.addToDietQueryList(bananas);
	}
	
	public static void calcSuperMalt(){
		// SuperMalt Drink
		Food supermalt = new Food("SuperMalt (330ml)", 0,"Clear");
		supermalt.addVitamins(vitB1Thiamine, "4.6mg" );
		supermalt.addVitamins(vitB2RiboFlavin, "2.6mg" );
		supermalt.addVitamins(vitB3Niacin, "24mg" );
		supermalt.addVitamins(vitB6, "2.3mg" );
		supermalt.addVitamins(vitB5Pantothenic, "5.0mg" );
		Food.addToDietQueryList(supermalt);
	}
	
	public static void calcAllBran(){
		// All Bran Flakes
		Food allBran = new Food("Kellogs All Bran (40g)", 0,"Clear");
		allBran.addVitamins(vitB1Thiamine, "0.28mg" );
		allBran.addVitamins(vitB2RiboFlavin, "0.35mg" );
		allBran.addVitamins(vitB3Niacin, "4.0mg" );
		allBran.addVitamins(vitB6, "0.35mg" );
		allBran.addVitamins(vitB9Folate, "100mcg");
		allBran.addVitamins(vitD, "1.3mcg" );
		allBran.addVitamins(vitB12, "0.63mcg" );
		allBran.addVitamins(iron, "3.5mg");
		allBran.addVitamins(sodium, "380mg");
		allBran.addVitamins(fibre, "11000mg");
		Food.addToDietQueryList(allBran);
	}
	
	public static void calcAlmondMilk(){
		// Almond Milk
		Food almondMilk = new Food("Almond Milk (100m)", 0,"Clear");
		almondMilk.addVitamins(fibre, "200mg");
		almondMilk.addVitamins(sodium, "3000mg");
		almondMilk.addVitamins(vitD, "0.75mcg");
		almondMilk.addVitamins(vitE, "1.8mg");
		almondMilk.addVitamins(vitB12, "0.38mcg");
		almondMilk.addVitamins(fibre, "200mg");
		almondMilk.addVitamins(vitB2RiboFlavin, "0.21mg");
		almondMilk.addVitamins(calcium, "120mg");
		Food.addToDietQueryList(almondMilk);
	}

	public static void calcEggs(){
		// Eggs medium
		Food eggs = new Food("Egg (medium)", 105,"white yellow");
		eggs.addVitamins(vitA, "214IU" );
		eggs.addVitamins(vitC, "0.0mg" );
		eggs.addVitamins(vitD, "15.4IU" );
		eggs.addVitamins(vitE, "0.4mg");
		eggs.addVitamins(vitK, "0.1mcg");
		eggs.addVitamins(vitB1Thiamine, "0.01mg" );
		eggs.addVitamins(vitB2RiboFlavin, "0.2mg" );
		eggs.addVitamins(vitB3Niacin, "0.0mg" );
		eggs.addVitamins(vitB6, "0.1mg" );
		eggs.addVitamins(vitB9Folate, "20.7mcg");
		eggs.addVitamins(vitB12, "0.6mcg");
		eggs.addVitamins(vitB5Pantothenic, "0.6mg" );
		
		//Minerals
		eggs.addVitamins(calcium, "23.3mg" );
		eggs.addVitamins(iron, "0.8mg" );
		eggs.addVitamins(magnesium, "5.3mg" );
		eggs.addVitamins(phosphorus, "84.0mg" );
		eggs.addVitamins(potassium, "59.0mg" );
		eggs.addVitamins(sodium, "61.6mg" );
		eggs.addVitamins(zinc, "0.5mg" );
		eggs.addVitamins(copper, "0.01mg" );
		eggs.addVitamins(manganese, "0.01mg");
		eggs.addVitamins(selenium, "13.9mcg");
		Food.addToDietQueryList(eggs);
	}
	
	public static void calcClementines(){
		// Clementine medium
		Food clementine = new Food("Clementine (medium)", 0,"Orange");
		clementine.addVitamins(vitC, "36.10mg" );
		clementine.addVitamins(vitE, "0.1mg");
		clementine.addVitamins(vitB1Thiamine, "0.1mg" );
		clementine.addVitamins(vitB2RiboFlavin, "0.01mg" );
		clementine.addVitamins(vitB3Niacin, "0.5mg" );
		clementine.addVitamins(vitB6, "0.1mg" );
		clementine.addVitamins(vitB9Folate, "17.8mcg");
		clementine.addVitamins(vitB5Pantothenic, "0.1mg" );
		
		//Minerals
		clementine.addVitamins(calcium, "22.2mg" );
		clementine.addVitamins(iron, "0.1mg" );
		clementine.addVitamins(magnesium, "7.4mg" );
		clementine.addVitamins(phosphorus, "15.5mg" );
		clementine.addVitamins(potassium, "131mg" );
		clementine.addVitamins(sodium, "0.7mg" );
		clementine.addVitamins(copper, "0.01mg" );
		clementine.addVitamins(manganese, "0.01mg");
		clementine.addVitamins(selenium, "0.1mcg");
		Food.addToDietQueryList(clementine);
	}
	public static void calcTomatoes(){
		// Tomatoes medium
		Food tomatoes = new Food("Tomato", 105,"red");
		tomatoes.addVitamins(vitA, "1025IU" );
		tomatoes.addVitamins(vitC, "15.6mg" );
		tomatoes.addVitamins(vitE, "0.7mg");
		tomatoes.addVitamins(vitK, "9.7mcg");
		tomatoes.addVitamins(vitB1Thiamine, "0.05g" );
		tomatoes.addVitamins(vitB2RiboFlavin, "0.01mg" );
		tomatoes.addVitamins(vitB3Niacin, "0.7mg" );
		tomatoes.addVitamins(vitB6, "0.1mg" );
		tomatoes.addVitamins(vitB9Folate, "18.4mcg");
		tomatoes.addVitamins(vitB5Pantothenic, "0.1mg" );
		
		//Minerals
		tomatoes.addVitamins(calcium, "12.3mg" );
		tomatoes.addVitamins(iron, "0.3mg" );
		tomatoes.addVitamins(magnesium, "13.5mg" );
		tomatoes.addVitamins(phosphorus, "29.5mg" );
		tomatoes.addVitamins(potassium, "292mg" );
		tomatoes.addVitamins(sodium, "6.2mg" );
		tomatoes.addVitamins(zinc, "0.2mg" );
		tomatoes.addVitamins(copper, "0.1mg" );
		tomatoes.addVitamins(manganese, "0.1mg");
		Food.addToDietQueryList(tomatoes);
	}	
	public static void calcWaterDrink(){
		// Water Liquid
		Food waterDrink = new Food("Water (500ml)", 0,"Clear");
		waterDrink.addVitamins(waterNutrient, "500ml");
		Food.addToDietQueryList(waterDrink);
	}
	
	//Summation of all vitamin groupings
	public static void calcAllFood(){
		Food.getTotals();
	}
}
