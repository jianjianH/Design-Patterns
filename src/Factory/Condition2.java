package Factory;

public class Condition2 implements AbstractProduce{
	// 搭配方案2: 暖风搭格布
	@Override
	public Aircondition createAircondition() {
		return new AirconditionWarmWind();
	}

	@Override
	public Sofa createSofa() {
		return new SofaOfGebb();
	}
}
