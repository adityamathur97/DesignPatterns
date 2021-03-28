package designPatterns.chatGroup;

import java.util.List;

public interface Observer {
	public void update(List<Message> chat);
}
