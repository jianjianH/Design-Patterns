package Observer;

public class Client {
	public static void main(String[] args) {
		NewsPaperObservable subject = new NewsPaperObservable();
		ReaderObserver reader1 = new ReaderObserver();
		reader1.setName("张三");
		
		ReaderObserver reader2 = new ReaderObserver();
		reader2.setName("李四");
		
		ReaderObserver reader3 = new ReaderObserver();
		reader3.setName("王二");
		
		subject.addObserver(reader1);
		subject.addObserver(reader2);
		subject.addObserver(reader3);
		
		subject.setContent("粗大事啦啦啦");
	}
}
