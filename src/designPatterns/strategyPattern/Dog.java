package designPatterns.strategyPattern;

public class Dog extends Animal {
	public Dog(String name, Double height, Double weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
		setSound("Bark");
		setType("Dog");
		setFlyingType(new NotFlys());
	}

	public void digHole() {
		System.out.println("Dug a hole.");
	}
}
