package designPatterns.observerPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Implements the Subject interface.
 * 
 * @author Aditya Mathur
 *
 */
public class StockGrabber implements Subject {

	/**
	 * Maps observerId to the Observer.
	 */
	private Map<Integer, Observer> idToObserverMap;
	private Double ibmPrice, googPrice, aaplPrice;

	public StockGrabber() {
		this.ibmPrice = null;
		this.googPrice = null;
		this.aaplPrice = null;
		idToObserverMap = new HashMap<>();
	}

	@Override
	public boolean register(Observer addObserver) {
		if (idToObserverMap.containsKey(addObserver.getObserverId())) {
			return false;
		}
		idToObserverMap.put(addObserver.getObserverId(), addObserver);
		notifyObserver();
		return true;
	}

	@Override
	public boolean unregister(Observer delObserver) {
		idToObserverMap.remove(delObserver.getObserverId());
		return true;
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : idToObserverMap.values()) {
			observer.update(ibmPrice, googPrice, aaplPrice);
		}
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public void printAllObservers() {
		for (Observer observer : idToObserverMap.values()) {
			((StockObserver) observer).printThePrices();
		}
	}

}
