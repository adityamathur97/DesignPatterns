package designPatterns.decoratorPattern;

/**
 * ToppingsDecorator acts as a skeleton class for different kinds of Toppings
 * available.
 * 
 * @author Aditya Mathur
 *
 */
abstract class ToppingsDecorator implements Shakes {

	/**
	 * An instance of the type of Shake.
	 */
	protected Shakes shake;

	/**
	 * Constructor to initialize an instance of Shake.
	 * 
	 * @param shake instance of Shake.
	 */
	public ToppingsDecorator(Shakes shake) {
		this.shake = shake;
	}

	/**
	 * Provides a decorated description of the shake.
	 * 
	 * @return Decorated description of the shake.
	 */
	public String getShakeDescription() {
		return this.shake.getShakeDescription();
	}

	/**
	 * @return Cost of the shake after changes made by the decorator.
	 */
	public Double getShakeCost() {
		return this.shake.getShakeCost();
	}

	/**
	 * @return Description of the topping.
	 */
	abstract public String getToppingDescription();

	/**
	 * @return Cost of the topping.
	 */
	abstract public Double getToppingCost();
}
