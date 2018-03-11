package vitahealth;

import java.util.ArrayList;

public class Food {
	private String name;
	private int calories;
	private ArrayList<Vitamins> foodVitamins = new ArrayList<Vitamins>();
	private static ArrayList<Food> dietQueryList = new ArrayList<Food>();
	private String color;
	static double totalA = 0, totalB1, totalB2, totalB3,totalB5,totalB6,totalB9,totalB12,water500ML,totalCalcium,
			totalC = 0, totalD,totalK,totalIron, totalMagnesium, totalPhosphorus, totalPotassium, totalSodium, totalZinc, totalCopper, totalManganese, totalSelenium,
			totalE = 0;

	public Food(String name, int calories, String color) {
		this.name = name;
		this.calories = calories;
		this.color = color;
	}

	public static Food createFood(String name, int calories, String color) {
		return new Food(name, calories, color);
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public ArrayList<Vitamins> getVitamins() {
		return foodVitamins;
	}

	public String getColor() {
		return color;
	}

	public void printAll() {
		System.out.println(name + " " + calories);
	}

	public void getVitaminsData() {
		for (int i = 0; i < foodVitamins.size(); i++) {
			System.out.println(foodVitamins.get(i).getVitaminDetails());
		}
	}

	public void addVitamins(Vitamins vits, String mgMcgOrIU) {
		double quantity = 0;
		if (mgMcgOrIU.toLowerCase().contains("mg")) {
			mgMcgOrIU = mgMcgOrIU.substring(0, mgMcgOrIU.length() - 2);
			quantity = Double.parseDouble(mgMcgOrIU);
		} else if (mgMcgOrIU.toLowerCase().contains("mcg")) {
			mgMcgOrIU = mgMcgOrIU.substring(0, mgMcgOrIU.length() - 3);
			quantity = Double.parseDouble(mgMcgOrIU);
			quantity = quantity / 1000;
		} else if (mgMcgOrIU.toLowerCase().contains("iu")) {
			mgMcgOrIU = mgMcgOrIU.substring(0, mgMcgOrIU.length() - 2);
			quantity = Double.parseDouble(mgMcgOrIU);
			quantity = quantity * 0.3;
			quantity = quantity / 1000;
		} else if (mgMcgOrIU.toLowerCase().contains("ml")) {
			mgMcgOrIU = mgMcgOrIU.substring(0, mgMcgOrIU.length() - 2);
			quantity = Double.parseDouble(mgMcgOrIU);
		}
		
		vits.addQuantity(quantity);
		foodVitamins.add(vits);
		addTotals(vits.getName(), quantity);
	}

	private void addTotals(String vitName, double vitQuantity) {

		vitQuantity = ((Math.round(vitQuantity * 100.0)) / 100.0);

		if (vitName.contains(" A")) {
			totalA += vitQuantity;
		} else if (vitName.contains(" B1")) {
			totalB1 += vitQuantity;
		} else if (vitName.contains(" B2")) {
			totalB2 += vitQuantity;
		}
		 else if (vitName.contains(" B3")) {
				totalB3 += vitQuantity;
			}
		 else if (vitName.contains(" B5")) {
				totalB5 += vitQuantity;
			}
		 else if (vitName.contains(" B6")) {
				totalB6 += vitQuantity;
			}
		 else if (vitName.contains(" B9")) {
				totalB9 += vitQuantity;
			}
		 else if (vitName.contains(" B12")) {
				totalB12 += vitQuantity;
			}
		 else if (vitName.contains(" C")) {
			totalC += vitQuantity;
		} else if (vitName.contains(" D")) {
			totalD += vitQuantity;
		} else if (vitName.contains(" E")) {
			totalE += vitQuantity;
		}else if (vitName.contains(" K")) {
			totalK += vitQuantity;
		} else if (vitName.contains("Water")) {
			water500ML += vitQuantity;
		}else if (vitName.contains("Calcium")) {
			totalCalcium += vitQuantity;
		}
		else if (vitName.contains("Iron")) {
			totalIron+= vitQuantity;
		}
		else if (vitName.contains("Magnesium")) {
			totalMagnesium+= vitQuantity;
		}
		else if (vitName.contains("Phosphorus")) {
			totalPhosphorus+= vitQuantity;
		}
		else if (vitName.contains("Potassium")) {
			totalPotassium+= vitQuantity;
		}else if (vitName.contains("Sodium")) {
			totalSodium+= vitQuantity;
		}else if (vitName.contains("Zinc")) {
			totalZinc+= vitQuantity;
		}else if (vitName.contains("Copper")) {
			totalCopper+= vitQuantity;
		}else if (vitName.contains("Manganese")) {
			totalManganese+= vitQuantity;
		}else if (vitName.contains("Selenium")) {
			totalSelenium+= vitQuantity;
		}

	}

	public static void addToDietQueryList(Food food) {
		dietQueryList.add(food);
	}

	public static ArrayList<Food> getDietQueryList() {
		return dietQueryList;
	}

	public static void getTotals() {
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("Item List: " + dietQueryList.size()+"\n");
		
		for (int i=0;i<dietQueryList.size();i++){
			System.out.println("1 " + dietQueryList.get(i).name);
		}
		System.out.println("\nWATER INTAKE. Recommended 4 Litres");
		System.out.print("WATER: \t\t" + water500ML + "ML | " + (int) ((water500ML / 4000) * 100) + "%\n\n");
		
		System.out.println("VITAMINS:");
		System.out.print("Vitamin A: \t" + ((Math.round(totalA * 100.0)) / 100.0) + "mg | " + (int) ((totalA / 0.9) * 100) + "%"); // Changed from 0.9 for math accuracy
		System.out.print("\nVitamin B1: \t" + ((Math.round(totalB1 * 100.0)) / 100.0) + "mg | "+ (int) ((totalB1 / 1.2) * 100) + "%"); //10mg for Cataracts //100mg kidney disease 
		System.out.print("\nVitamin B2: \t" + ((Math.round(totalB2 * 100.0)) / 100.0) + "mg | "+ (int) ((totalB2 / 1.3) * 100) + "%"); //3mg for Cataracts
		System.out.print("\nVitamin B3: \t" + ((Math.round(totalB3 * 100.0)) / 100.0) + "mg | "+ (int) ((totalB3 / 16) * 100) + "%"); //30 is also good
		System.out.print("\nVitamin B5: \t" + ((Math.round(totalB5 * 100.0)) / 100.0) + "mg | "+ (int) ((totalB5 / 6) * 100) + "%"); // Tablets usually comes in 100mg
		System.out.print("\nVitamin B6: \t" + ((Math.round(totalB6 * 100.0)) / 100.0) + "mg | "+ (int) ((totalB6 / 1.7) * 100) + "%"); //50 for eyes treatment
		System.out.print("\nVitamin B9: \t" + ((Math.round(totalB9 * 100.0)) / 100.0) + "mg | "+ (int) ((totalB9 / 0.4) * 100) + "%"); //400mcg 1200mcg heart disease
		System.out.print("\nVitamin B12: \t" + ((Math.round(totalB12 * 100.0)) / 100.0) + "mg | "+ (int) ((totalB12 /0.0024 ) * 100) + "%"); //Almost impossible to overdose
		System.out.print("\nVitamin C: \t" + ((Math.round(totalC * 100.0)) / 100.0) + "mg | Men: " + (int) ((totalC / 90) * 100) + "% | Women: " + (int) ((totalC / 75) * 100) + "% ");
		System.out.print("\nVitamin D: \t" + + ((Math.round(totalD * 100.0)) / 100.0) + "mg | "+ (int) ((totalD / 0.02) * 100) + "%");
		System.out.print("\nVitamin E: \t" + + ((Math.round(totalE * 100.0)) / 100.0) + "mg | " + (int) ((totalE / 30) * 100) + "%");
		System.out.println("\nVitamin K: \t" + + ((Math.round(totalK * 100.0)) / 100.0) + "mg | " + (int) ((totalK / 0.1) * 100) + "%");


		System.out.println("\nMINERALS:");
		System.out.print("Calcium: \t" + ((Math.round(totalCalcium * 100.0)) / 100.0) + "mg | " + (int) ((totalCalcium / 1500) * 100) + "%");
		System.out.print("\nIron: \t\t" +  ((Math.round(totalIron * 100.0)) / 100.0) + "mg | " + (int) ((totalIron / 15) * 100) + "%"); //8 for men
		System.out.print("\nMagnesium: \t" + ((Math.round(totalMagnesium * 100.0)) / 100.0) + "mg | " + (int) ((totalMagnesium / 420) * 100) + "%");
		System.out.print("\nPhosphorus: \t" + ((Math.round(totalPhosphorus * 100.0)) / 100.0) + "mg | " + (int) ((totalPhosphorus / 700) * 100) + "%");
		System.out.print("\nPotassium: \t" + ((Math.round(totalPotassium * 100.0)) / 100.0) + "mg | " + (int) ((totalPotassium / 4700) * 100) + "%");
		System.out.print("\nSodium: \t" + ((Math.round(totalSodium * 100.0)) / 100.0) + "mg | " + (int) ((totalSodium / 1500) * 100) + "% (NB: lower is better)");
		System.out.print("\nZinc: \t\t" + ((Math.round(totalZinc * 100.0)) / 100.0) + "mg | " + (int) ((totalZinc / 11) * 100) + "%");
		System.out.print("\nCopper: \t" + ((Math.round(totalZinc * 100.0)) / 100.0) + "mg | " + (int) ((totalCopper / 1.3) * 100) + "%");
		System.out.print("\nManganese: \t" + ((Math.round(totalManganese * 100.0)) / 100.0) + "mg | " + (int) ((totalManganese / 2.3) * 100) + "%"); //1.8 for women
		System.out.print("\nSelenium: \t" + ((Math.round(totalSelenium * 100.0)) / 100.0) + "mg | " + (int) ((totalSelenium / 0.055) * 100) + "%\n"); //
	
		System.out.println("*******************************************");
		System.out.println("*******************************************");
	}
}