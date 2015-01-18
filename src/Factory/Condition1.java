package Factory;

public class Condition1 implements AbstractProduce{
	// 搭配方案1: 冷风搭真皮
	@Override
	public Aircondition createAircondition() {
		return new AirconditionColdWind();
	}

	@Override
	public Sofa createSofa() {
		return new SofaOfHypoderm();
	}
}
