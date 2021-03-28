package designPatterns.chatGroup;

public class Message {
	private String message;

	public Message(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return this.message;
	}

}
