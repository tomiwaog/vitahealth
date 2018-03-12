package vitahealth;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		boolean quit = false;
		int menuOption;

		while (!quit) {
			printMenuOptions();
			System.out.print("Please enter an option: ");
			menuOption = sc.nextInt();
			switch (menuOption) {
			case 1:
				FoodList.getSweetPotatoes();
				break;
			case 2:
				FoodList.getPotatoes();
				break;
			case 3:
				FoodList.getAlmonds();
				break;
			case 4:
				FoodList.getLemon();
				break;
			case 5:
				FoodList.getKiwi();
				break;
			case 6:
				FoodList.getCarrots();
				break;
			case 7:
				FoodList.getBananas();
				break;
			case 8:
				FoodList.getClementines();
				break;
			case 9:
				FoodList.getTomatoes();
				break;
			case 10:
				FoodList.getWaterDrink();
				break;
			case 11:
				FoodList.getSuperMalt();
				break;
			case 12:
				FoodList.getAllBran();
				break;
			case 13:
				FoodList.getAlmondMilk();
				break;
			case 14:
				FoodList.getEggs();
				break;	
			case 100:
				quit = true;
				break;
			default:
				System.out.println("Invalid selection. Try again!");
				break;

			}
			FoodList.calcAllFood();
		}
	}

	private static void printMenuOptions() {
		// TODO Auto-generated method stub
		System.out
				.println("\n*** Please select food to add *** \n\n1. Sweet Potatoes \n"
						+ "2. Potatoes \n"+
						"3. Almonds \n"+
						"4. Lemon \n"+
						"5. Kiwi \n"+
						"6. Carrots \n"+
						"7. Bananas \n"+
						"8. Clementine \n"+
						"9. Tomatoes \n"+
						"10. WATER (500ml) \n"+
						"11. SuperMalt Drink \n" +
						"12. All Bran 40g \n"+
						"13. Almond Milk (100ml)\n"
						+ "14. Eggs \n");
	}
}
