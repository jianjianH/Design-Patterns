package Factory;

public class Condition2 implements AbstractProduce{
	// ���䷽��2: ů����
	@Override
	public Aircondition createAircondition() {
		return new AirconditionWarmWind();
	}

	@Override
	public Sofa createSofa() {
		return new SofaOfGebb();
	}
}
