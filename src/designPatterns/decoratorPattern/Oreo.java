package designPatterns.decoratorPattern;

/**
 * Represents Oreo topping that extends ToppingsDecorator.
 * 
 * @author Aditya Mathur
 *
 */
public class Oreo extends ToppingsDecorator {

	/**
	 * Represents the cost of oreo topping.
	 */
	private Double oreoCost;

	/**
	 * Constructor to initialize an instance of Shake and default value of topping.
	 * 
	 * @param shake instance of Shake.
	 */
	public Oreo(Shakes shake) {
		super(shake);
		this.oreoCost = 1.25;
	}

	/**
	 * Provides a description of the shake with oreo.
	 * 
	 * @return Decorated description of the shake.
	 */
	@Override
	public String getShakeDescription() {
		return this.shake.getShakeDescription() + " with Oreo";
	}

	/**
	 * @return Cost of the shake with oreo.
	 */
	@Override
	public Double getShakeCost() {
		return this.shake.getShakeCost() + this.oreoCost;
	}

	/**
	 * @return Description of the oreo topping.
	 */
	@Override
	public String getToppingDescription() {
		return "Oreo is an American sandwich cookie consisting of two wafers with a sweet crème filling.";
	}

	/**
	 * @return Cost of the oreo topping.
	 */
	@Override
	public Double getToppingCost() {
		return this.oreoCost;
	}

	/**
	 * Updates the cost of the shake to the given amount.
	 * 
	 * @param shakeCost Updated cost of the shake.
	 */
	@Override
	public void setShakeCost(Double shakeCost) {
		this.shake.setShakeCost(shakeCost);
	}

}
