package designPatterns.strategyPattern;

public class Cat extends Animal {
	public Cat(String name, Double height, Double weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
		setSound("Meow");
		setType("Cat");
		setFlyingType(new NotFlys());
	}

}
