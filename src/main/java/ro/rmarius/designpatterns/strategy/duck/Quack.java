package ro.rmarius.designpatterns.strategy.duck;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}
}
