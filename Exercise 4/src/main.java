
public class main {

	public static void main(String[] args) {
		acer a = new acer(); //Construct an object Acer
		System.out.println("Desktop Details:");
		System.out.println("Length: "+a.getLength()+"cm");
		System.out.println("Volume: "+a.getVolume()+"cm^3");
		System.out.println("Weight: "+a.getWeight()+"kg");
		System.out.println("Brand: "+ a.getBrand());
		System.out.println("CPU: "+ a.getIntel());
		System.out.println("RAM: "+ a.getGB()+"GB");
		System.out.println("Price per unit: RM "+a.getPrice());
		System.out.println("Number of units: " + a.getUnit());
		System.out.println("Total Price: RM "+a.getTotalPrice());
		
		System.out.println();
		
		Asus b = new Asus(); //Construct an object Asus
		System.out.println("Desktop Details:");
		System.out.println("Length: "+b.getLength()+ "cm");
		System.out.println("Volume: "+b.getVolume() + "cm^3");
		System.out.println("Weight: "+b.getWeight() + "kg");
		System.out.println("Brand: "+ b.getBrand());
		System.out.println("CPU: "+ b.getIntel());
		System.out.println("RAM: "+ b.getGB()+"GB");
		System.out.println("Price per unit: RM "+b.getPrice());
		System.out.println("Number of units: " + b.getUnit());
		System.out.println("Total Price: RM "+ b.getTotalPrice());
	}

}
