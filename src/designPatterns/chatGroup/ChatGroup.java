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

	@Override
	public void unregister(Observer user) {
		userIdToUser.remove(((User) user).getUserId());
		System.out.println(((User) user).getUserName() + " left " + this.chatGroupName + "!");
	}

	@Override
	public void notifyAllObservers() {
		for (Observer user : userIdToUser.values()) {
			user.update();
		}

		printWholeChat();
	}

	public String getChatGroupName() {
		return chatGroupName;
	}

	public void setChatGroupName(String chatGroupName) {
		this.chatGroupName = chatGroupName;
	}

	public List<Message> getChat() {
		return chat;
	}

	public void receiveMessage(Observer user, String userMessage) throws Error {
		Integer userId = ((User) user).getUserId();

		if (userIdToUser.containsKey(userId)) {
			String message = ((User) user).getUserName() + ": " + userMessage;
			chat.add(new Message(message));
			notifyAllObservers();
		} else {
			throw new Error(((User) user).getUserName() + " is not part of " + chatGroupName + "!");
		}
	}

	public void printWholeChat() {
		for (Message message : chat) {
			System.out.println(message);
		}
	}

}
