package designPatterns.strategyPattern;

public class Bird extends Animal {
	public Bird(String name, Double height, Double weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
		setSound("Tweet");
		setType("Bird");
		setFlyingType(new Flys());
	}
}
