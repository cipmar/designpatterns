package ro.rmarius.designpatterns.decorator.beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		setDescription("House blend");
	}

	@Override
	public double cost() {
		return .89;
	}
}
