package Observer;

import java.util.Observable;

public class NewsPaperObservable extends Observable{
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		setChanged();
		notifyObservers(content);
	}
}
