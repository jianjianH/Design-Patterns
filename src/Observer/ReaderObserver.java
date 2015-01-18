package Observer;

import java.util.Observable;
import java.util.Observer;

public class ReaderObserver implements Observer{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + "读取推送信息" + arg);
		System.out.println(name + "读取拉取信息" + ((NewsPaperObservable)o).getContent());
	}
}
