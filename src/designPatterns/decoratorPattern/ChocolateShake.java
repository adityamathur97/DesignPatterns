package designPatterns.decoratorPattern;

public class ChocolateShake implements Shakes {

	private double cost;

	public ChocolateShake() {
		this.cost = 4.00;
	}

	@Override
	public String getDescription() {
		return "Here is your Chocolate Shake";
	}

	@Override
	public Double getCost() {
		return this.cost;
	}

	@Override
	public void setCost(Double cost) {
		this.cost = cost;
	}

}
