package designPatterns.observerPattern;

public interface Observer {
	public int getObserverId();

	public void update(Double ibmPrice, Double googPrice, Double aaplPrice);
}
