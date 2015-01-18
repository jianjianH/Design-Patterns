package Factory;

public class FactoryMethod {
	public static void main(String[] args) {
		FactoryBWM factoryBWM320 = new FactoryBMW320();
		factoryBWM320.createBMW();
		
		FactoryBWM factoryBWM523 = new FactoryBMW523();
		factoryBWM523.createBMW();
	}
}
