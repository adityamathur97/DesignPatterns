package designPatterns.observerPattern;

public class Main {
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);

	}

	public static void runTrhreads(StockGrabber stockGrabber) {
		Runnable ibmRunnable = new GrabTheStock(stockGrabber, 5, "IBM", 100.0);
		Runnable googRunnable = new GrabTheStock(stockGrabber, 5, "GOOG", 200.0);
		Runnable aaplRunnable = new GrabTheStock(stockGrabber, 5, "AAPL", 300.0);

		Thread ibmThread = new Thread(ibmRunnable);
		Thread googThread = new Thread(googRunnable);
		Thread aaplThread = new Thread(aaplRunnable);

		ibmThread.start();
		googThread.start();
		aaplThread.start();
	}
}
