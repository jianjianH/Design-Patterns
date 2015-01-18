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
		System.out.println(name + "��ȡ������Ϣ" + arg);
		System.out.println(name + "��ȡ��ȡ��Ϣ" + ((NewsPaperObservable)o).getContent());
	}
}
