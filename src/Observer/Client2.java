package Observer;

public class Client2 {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setName("张三");
		
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setName("李四");
		
		ConcreteObserver observer3 = new ConcreteObserver();
		observer3.setName("王二");
		
		subject.attach(observer1);
		subject.attach(observer2);
		subject.attach(observer3);
		
		subject.setSubjectState("看完报纸");
	}
}
