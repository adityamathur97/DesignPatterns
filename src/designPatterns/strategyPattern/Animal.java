package designPatterns.strategyPattern;

/**
 * Represents an animal of any kind.
 * 
 * @author Aditya Mathur
 *
 */
public class Animal {

	/**
	 * Name of the animal.
	 */
	private String name;

	/**
	 * Height of the animal.
	 */
	private Double height;

	/**
	 * Weight of the animal.
	 */
	private Double weight;

	/**
	 * Represents the kind of sound the animal makes.
	 */
	private String sound;

	/**
	 * Stores the type of animal.
	 */
	private String type;

	private Fly flyingType;

	public Fly getFlyingType() {
		return flyingType;
	}

	public void setFlyingType(Fly flyingType) {
		this.flyingType = flyingType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) throws Error {
		if (height > 0) {
			this.height = height;
		} else {
			throw new Error("Height should be positive.");
		}
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) throws Error {
		if (weight > 0) {
			this.weight = weight;
		} else {
			throw new Error("Weight should be a positive value.");
		}
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String fly() {
		return flyingType.fly();
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", height=" + height + ", weight=" + weight + ", sound=" + sound + ", type="
				+ type + ", flyingType=" + flyingType + "]";
	}

}