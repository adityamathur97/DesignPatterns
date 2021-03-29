package designPatterns.decoratorPattern;

public class Main {
	public static void main(String[] args) {
		Shakes chocolateShake1 = new ChocolateShake();
		System.out.println("Chocolate Shake without any toppings:");
		System.out.println(chocolateShake1.getDescription());
		System.out.println("Cost: " + chocolateShake1.getCost());

		System.out.println();

		Shakes chocolateShake2 = new MNM(new ChocolateShake());
		System.out.println("Chocolate Shake with MNM:");
		System.out.println(chocolateShake2.getDescription());
		System.out.println("Cost: " + chocolateShake2.getCost());

		System.out.println();

		Shakes chocolateShake3 = new Oreo(new MNM(new ChocolateShake()));
		System.out.println("Chocolate Shake with MNM, Oreo:");
		System.out.println(chocolateShake3.getDescription());
		System.out.println("Cost: " + chocolateShake3.getCost());
	}
}
