package ro.rmarius.designpatterns.decorator.beverage;

public class Suger extends CondimentDecorator {

	private Beverage beverage;

	public Suger(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Suger";
	}

	@Override
	public double cost() {
		return beverage.cost() + .06;
	}
}
