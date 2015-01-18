package Observer;

public class Client {
	public static void main(String[] args) {
		NewsPaperObservable subject = new NewsPaperObservable();
		ReaderObserver reader1 = new ReaderObserver();
		reader1.setName("����");
		
		ReaderObserver reader2 = new ReaderObserver();
		reader2.setName("����");
		
		ReaderObserver reader3 = new ReaderObserver();
		reader3.setName("����");
		
		subject.addObserver(reader1);
		subject.addObserver(reader2);
		subject.addObserver(reader3);
		
		subject.setContent("�ִ���������");
	}
}
