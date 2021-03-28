package designPatterns.observerPattern;

import java.text.DecimalFormat;

public class GrabTheStock implements Runnable {

	private Integer startTime;
	private String stock;
	private Double price;

	private Subject stockGrabber;

	public GrabTheStock(Subject stockGrabber, Integer startTime, String stock, Double price) {
		this.stockGrabber = stockGrabber;
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(this.startTime * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Double ranDouble = (Math.random() * (0.05)) - 0.025;
			DecimalFormat dFormat = new DecimalFormat("#.##");

			this.price = Double.valueOf(dFormat.format(this.price + ranDouble));

			if (this.stock.equals("IBM")) {
				((StockGrabber) stockGrabber).setIbmPrice(this.price);
			} else if (this.stock.equals("GOOG")) {
				((StockGrabber) stockGrabber).setGoogPrice(this.price);
			} else if (this.stock.equals("AAPL")) {
				((StockGrabber) stockGrabber).setAaplPrice(this.price);
			}

			System.out.println(this.stock + " prices changed!");
		}
	}

}
