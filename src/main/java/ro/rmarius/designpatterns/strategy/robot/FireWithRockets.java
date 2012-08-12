package ro.rmarius.designpatterns.strategy.robot;

public class FireWithRockets implements FireStrategy {

	@Override
	public void fire() {
		System.out.println("rocket rocket");
	}
}
