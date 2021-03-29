package designPatterns.decoratorPattern;

/**
 * An implementation of the Shake interface;
 * 
 * @author Aditya Mathur
 *
 */
public class ChocolateShake implements Shakes {

	/**
	 * Represents the cost of the shake.
	 */
	private double cost;

	/**
	 * Constructor to initialize default values;
	 */
	public ChocolateShake() {
		this.cost = 4.00;
	}

	/**
	 * Provides a description of the shake.
	 * 
	 * @return Description of the shake.
	 */
	@Override
	public String getShakeDescription() {
		return "Here is your Chocolate Shake";
	}

	/**
	 * @return Cost of the shake.
	 */
	@Override
	public Double getShakeCost() {
		return this.cost;
	}

	/**
	 * Updates the cost of the shake to the given amount.
	 * 
	 * @param shakeCost Updated cost of the shake.
	 */
	@Override
	public void setShakeCost(Double shakeCost) {
		this.cost = shakeCost;
	}

}
