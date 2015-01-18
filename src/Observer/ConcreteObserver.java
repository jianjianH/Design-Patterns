package Observer;

public class ConcreteObserver implements Observer{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Subject subject) {
		System.out.println(name + "×´Ì¬£º" + ((ConcreteSubject)subject).getSubjectState());
	}
}
