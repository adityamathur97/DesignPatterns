package designPatterns.strategyPattern;

public interface Fly {
	String fly();
}

class Flys implements Fly {

	@Override
	public String fly() {
		return "Flying high!";
	}

}

class NotFlys implements Fly {

	@Override
	public String fly() {
		return "Can't Fly!";
	}

}