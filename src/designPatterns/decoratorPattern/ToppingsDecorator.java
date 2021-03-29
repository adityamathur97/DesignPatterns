package designPatterns.decoratorPattern;

abstract class ToppingsDecorator implements Shakes {

	protected Shakes shake;

	public ToppingsDecorator(Shakes shake) {
		this.shake = shake;
	}

	public String getDescription() {
		return this.shake.getDescription();
	}

	public Double getCost() {
		return this.shake.getCost();
	}
}
