package designPatterns.strategyPattern;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Tommy", 2.0, 4.0);
		Animal cat = new Cat("Neko", 2.0, 2.0);
		Bird bird = new Bird("Jack", 2.0, 2.0);

		speakAnimal(dog);
		speakAnimal(cat);
		dog.digHole();

		System.out.println(dog.fly());
		System.out.println(bird.fly());
	}

	public static void speakAnimal(Animal animal) {
		System.out.println(animal.getType() + " says - " + animal.getSound());
	}
}
