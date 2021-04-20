import java.util.Scanner;

public class acer extends laptop {			//Acer as subclass and laptop as Parent class
	Scanner scan = new Scanner(System.in);
	
	private String brand, intel;
	private int gb, unit;
	private double price, totalprice;
	
	acer(){				//Constructor without arg named acer
		this.brand = "Acer";
		System.out.print("Enter the CPU model(intel i5/ intel i7): ");
		this.intel = scan.nextLine();
		
		System.out.print("Enter the RAM(8/16): ");
		this.gb = scan.nextInt();
		
			if (intel == "intel i3") {
				if (gb == 8) {
					this.price = 2900;
				}
				else if (gb == 16) {
					this.price = 3300;
				}
			}
			else if (intel == "intel i5") {
				if (gb == 8) {
					this.price = 3800;
				}
				else if (gb == 16) {
					this.price = 4500;
				}
			}
		System.out.print("Enter total of units: ");
		this.unit = scan.nextInt();
		this.totalprice = this.price * this.unit;
		System.out.println();
	}
	
	String getBrand() {
		return this.brand;
	}
	
	String getIntel() {
		return this.intel;
	}
	
	int getGB() {
		return this.gb;
	}
	
	double getPrice() {
		return this.price;
	}
	
	int getUnit() {
		return this.unit;
	}
	
	double getTotalPrice() {
		return this.totalprice;
	}
}