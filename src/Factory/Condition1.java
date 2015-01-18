package Factory;

public class Condition1 implements AbstractProduce{
	// ���䷽��1: ������Ƥ
	@Override
	public Aircondition createAircondition() {
		return new AirconditionColdWind();
	}

	@Override
	public Sofa createSofa() {
		return new SofaOfHypoderm();
	}
}
