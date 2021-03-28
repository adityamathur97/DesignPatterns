package designPatterns.observerPattern;

/**
 * Interface for the Subject to demonstrate Observer Pattern.
 * 
 * @author Aditya Mathur
 *
 */
public interface Subject {
	/**
	 * Register an observer.
	 * 
	 * @param addObserver observer to be registered
	 * @return returns true if the observer was registered otherwise returns false.
	 */
	public boolean register(Observer addObserver);

	/**
	 * Unregister an observer.
	 * 
	 * @param delObserver observer to be unregistered.
	 * @return returns true if observer is deleted otherwise false if observer not
	 *         present.
	 */
	public boolean unregister(Observer delObserver);

	/**
	 * Notify all the observers to update the stock prices.
	 */
	public void notifyObserver();
}