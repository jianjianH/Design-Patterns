package Factory;

public class FactoryBMW320 implements FactoryBWM{
	@Override
	public BMW createBMW() {
		return new BMW320();
	}
}
