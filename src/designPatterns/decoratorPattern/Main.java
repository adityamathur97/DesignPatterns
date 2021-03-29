package designPatterns.decoratorPattern;

public class Main {
	public static void main(String[] args) {
		// Undecorated object
		Shakes chocolateShake = new ChocolateShake();
		System.out.println("Chocolate Shake without any toppings:");
		System.out.println("Shake Description: " + chocolateShake.getShakeDescription());
		System.out.println("Shake Cost: " + chocolateShake.getShakeCost());

		System.out.println();

		// Calling all 4 operations provided by decorator.
		Shakes chocolateShakeWithOreo = new Oreo(new ChocolateShake());
		System.out.println("Chocolate Shake with Oreo:");
		System.out.println("Shake Description: " + chocolateShakeWithOreo.getShakeDescription());
		System.out.println("Shake Cost: " + chocolateShakeWithOreo.getShakeCost());
		System.out.println("Topping Description: " + ((Oreo) chocolateShakeWithOreo).getToppingDescription());
		System.out.println("Topping Cost: " + ((Oreo) chocolateShakeWithOreo).getToppingCost());
	}
}
