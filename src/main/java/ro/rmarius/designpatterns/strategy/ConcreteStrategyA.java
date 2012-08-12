package ro.rmarius.designpatterns.strategy;

public class ConcreteStrategyA implements Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("strategy A");
	}
}
