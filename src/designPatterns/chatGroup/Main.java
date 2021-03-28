package designPatterns.chatGroup;

public class Main {
	public static void main(String[] args) {
		ChatGroup chatRoom = new ChatGroup("Roommates");

		User aditya = new User(chatRoom, "Aditya");
		User prashant = new User(chatRoom, "Prashant");
		User rahul = new User(chatRoom, "Rahul");
		User mahan = new User(chatRoom, "Mahan");

		aditya.sendMessage("Hey, What's up?");
		prashant.sendMessage("What's good?");

		System.out.println(rahul.getChat());

		chatRoom.unregister(rahul);

		aditya.sendMessage("Why did Rahul leave?");

		System.out.println(rahul.getChat());
		chatRoom.register(rahul);
		rahul.sendMessage("Hey guys am back!");

		System.out.println(mahan.getChat());
		System.out.println(rahul.getChat());
	}
}
