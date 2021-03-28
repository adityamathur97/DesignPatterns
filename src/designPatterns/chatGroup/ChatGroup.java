package designPatterns.chatGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatGroup implements Subject {

	private String chatGroupName;
	private List<Message> chat;

	private Map<Integer, Observer> userIdToUser;

	public ChatGroup(String chatGroupName) {
		this.chatGroupName = chatGroupName;
		this.chat = new ArrayList<>();
		this.userIdToUser = new HashMap<>();
	}

	@Override
	public void register(Observer user) {
		userIdToUser.put(((User) user).getUserId(), user);
		System.out.println(((User) user).getUserName() + " joined " + this.chatGroupName + "!");
	}

	public String getChatGroupName() {
		return chatGroupName;
	}

	public void setChatGroupName(String chatGroupName) {
		this.chatGroupName = chatGroupName;
	}

	@Override
	public void unregister(Observer user) {
		userIdToUser.remove(((User) user).getUserId());
	}

	@Override
	public void notifyAllObservers() {
		for (Observer user : userIdToUser.values()) {
			user.update(chat);
		}

		printWholeChat();
	}

	public void receiveMessage(Observer user, String userMessage) {
		String message = ((User) user).getUserName() + ": " + userMessage;
		chat.add(new Message(message));
		notifyAllObservers();
	}

	public void printWholeChat() {
		for (Message message : chat) {
			System.out.println(message);
		}
	}

}
