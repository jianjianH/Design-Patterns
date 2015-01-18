package Observer;

public class Client2 {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setName("����");
		
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setName("����");
		
		ConcreteObserver observer3 = new ConcreteObserver();
		observer3.setName("����");
		
		subject.attach(observer1);
		subject.attach(observer2);
		subject.attach(observer3);
		
		subject.setSubjectState("���걨ֽ");
	}
}
