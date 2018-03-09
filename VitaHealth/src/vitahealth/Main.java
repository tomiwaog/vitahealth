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
				FoodList.calcSweetPotatoes();
				break;
			case 2:
				FoodList.calcPotatoes();
				break;
			case 3:
				FoodList.calcAlmonds();
				break;
			case 4:
				FoodList.calcLemon();
				break;
			case 5:
				FoodList.calcKiwi();
				break;
			case 6:
				FoodList.calcCarrots();
				break;
			case 7:
				FoodList.calcBananas();
				break;
			case 10:
				FoodList.calcWaterDrink();
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
						"\n10. WATER (500ml) \n");
	}
}