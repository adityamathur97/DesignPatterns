package designPatterns.decoratorPattern;

/**
 * Interface for different kinds of Shakes.
 * 
 * @author Aditya Mathur
 *
 */
public interface Shakes {

	/**
	 * Provides a description of the shake.
	 * 
	 * @return Description of the shake.
	 */
	public String getShakeDescription();

	/**
	 * @return Cost of the shake.
	 */
	public Double getShakeCost();

	/**
	 * Updates the cost of the shake to the given amount.
	 * 
	 * @param shakeCost Updated cost of the shake.
	 */
	public void setShakeCost(Double shakeCost);
}
