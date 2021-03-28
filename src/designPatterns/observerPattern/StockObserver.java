package designPatterns.observerPattern;

public class StockObserver implements Observer {
	private Double ibmPrice, googPrice, aaplPrice;

	private static int observerIdTracker = 1000;
	private int observerId;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIdTracker;

		stockGrabber.register(this);
	}

	@Override
	public int getObserverId() {
		return this.observerId;
	}

	@Override
	public void update(Double ibmPrice, Double googPrice, Double aaplPrice) {
		this.ibmPrice = ibmPrice;
		this.googPrice = googPrice;
		this.aaplPrice = aaplPrice;
	}

	public void printThePrices() {
		System.out.println("Observer Id: " + getObserverId());
		System.out.println("IBM Price: " + this.ibmPrice + "\n" + "Google Price: " + this.googPrice + "\n"
				+ "Apple Price: " + this.aaplPrice + "\n");
	}

}
