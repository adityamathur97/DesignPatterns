package designPatterns.decoratorPattern;

/**
 * Represents MNM topping that extends ToppingsDecorator.
 * 
 * @author Aditya Mathur
 *
 */
public class MNM extends ToppingsDecorator {

	/**
	 * Represents the cost of mnm topping.
	 */
	private Double mnmCost;

	/**
	 * Constructor to initialize an instance of Shake and default value of topping.
	 * 
	 * @param shake instance of Shake.
	 */
	public MNM(Shakes shake) {
		super(shake);
		this.mnmCost = 0.99;
	}

	/**
	 * Provides a description of the shake with mnm.
	 * 
	 * @return Decorated description of the shake.
	 */
	@Override
	public String getShakeDescription() {
		return this.shake.getShakeDescription() + " with MNM";
	}

	/**
	 * @return Cost of the shake with mnm.
	 */
	@Override
	public Double getShakeCost() {
		return this.shake.getShakeCost() + this.mnmCost;
	}

	/**
	 * @return Description of the mnm topping.
	 */
	@Override
	public String getToppingDescription() {
		return "MNM are candy shaped colorfull treats made of chocolate.";
	}

	/**
	 * @return Cost of the mnm topping.
	 */
	@Override
	public Double getToppingCost() {
		return this.mnmCost;
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
