package designPatterns.decoratorPattern;

public class Oreo extends ToppingsDecorator {

	private Double oreoCost;

	public Oreo(Shakes shake) {
		super(shake);
		this.oreoCost = 1.25;
	}

	@Override
	public String getDescription() {
		return this.shake.getDescription() + " with Oreo";
	}

	@Override
	public Double getCost() {
		return this.shake.getCost() + this.oreoCost;
	}

	@Override
	public void setCost(Double cost) {
		this.oreoCost = cost;
	}

}
