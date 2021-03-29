package designPatterns.decoratorPattern;

public class MNM extends ToppingsDecorator {

	private Double mnmCost;

	public MNM(Shakes shake) {
		super(shake);
		this.mnmCost = 0.99;
	}

	@Override
	public String getDescription() {
		return this.shake.getDescription() + " with MNM";
	}

	@Override
	public Double getCost() {
		return this.shake.getCost() + this.mnmCost;
	}

	@Override
	public void setCost(Double cost) {
		this.mnmCost = cost;
	}

}
