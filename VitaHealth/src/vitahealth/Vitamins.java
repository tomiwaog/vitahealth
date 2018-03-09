package vitahealth;

public class Vitamins {
	private String name;
	private String aka;
	private String bodyParts;
	private double quantityInMg;
	private String storage;
	

	
	public Vitamins(String name, String aka, String bodyParts, String storage) {
		this(name,aka,bodyParts,storage,0);
	}
	
	public Vitamins(String name, String aka, String bodyParts, String storage, int quantity) {
		super();
		this.name = name;
		this.aka = aka;
		this.bodyParts = bodyParts;
		this.storage = storage;
		this.quantityInMg=quantity;
	}
	
	public String getName() {
		return name;
	}

	public String getAka() {
		return aka;
	}

	public String getBodyParts() {
		return bodyParts;
	}

	public double getQuantity() {
		return quantityInMg;
	}

	public String getStorage() {
		return storage;
	}

	public String getVitaminDetails(){
		return name + " "+aka+ " "+ bodyParts+ " "+storage+ " "+quantityInMg;
	}
	public static Vitamins createVitamins(String name, String aka, String bodyParts, String storage){
		return new Vitamins(name, aka, bodyParts,storage);
	}
	public static Vitamins createVitamins(String name, String aka, String bodyParts, String storage, int quantity){
		return new Vitamins(name, aka, bodyParts,storage, quantity);
	}
	
	public void addQuantity(double d){
		quantityInMg = d;
	}
}
