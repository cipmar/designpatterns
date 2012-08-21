package ro.rmarius.designpatterns.decorator.beverage;

public class Expresso extends Beverage {

	public Expresso() {
		setDescription("Expresso");
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
