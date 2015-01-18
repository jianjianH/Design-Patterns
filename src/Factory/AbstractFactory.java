package Factory;

public class AbstractFactory {
	public static void main(String[] args) {
		AbstractProduce customProduce = new Condition1();
		customProduce.createAircondition();
		customProduce.createSofa();
		
		AbstractProduce customProduce2 = new Condition2();
		customProduce2.createAircondition();
		customProduce2.createSofa();
	}
}
