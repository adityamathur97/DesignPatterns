package designPatterns.decoratorPattern;

public class VanillaShake implements Shakes {

	private Double cost;

	public VanillaShake() {
		this.cost = 3.00;
	}

	@Override
	public String getDescription() {
		return "Here is your Vanilla Shake";
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
