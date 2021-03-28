package designPatterns.chatGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User implements Observer {
	private String userName;
	private List<Message> chat;

	private static Integer userIdTracker = 1000;
	private Integer userId;

	private Subject chatGroup;

	public User(Subject chatGroup, String userName) {
		this.chatGroup = chatGroup;
		this.userName = userName;
		this.chat = new ArrayList<>();

		this.userId = ++userIdTracker;

		this.chatGroup.register(this);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void sendMessage() {
		System.out.println("Enter your message: ");

		Scanner scanner = new Scanner(System.in);
		String message = scanner.next();

		((ChatGroup) chatGroup).receiveMessage(this, message);
		scanner.close();
	}

	public void sendMessage(String message) {
		((ChatGroup) chatGroup).receiveMessage(this, message);
	}

	public String getChat() {
		return getUserName() + " watching chat: " + "\n" + this.chat.toString();
	}

	@Override
	public void update(List<Message> chat) {
		if (chat.size() > 0)
			this.chat.add(chat.get(chat.size() - 1));
	}
}
