package ro.rmarius.designpatterns.strategy.robot;

public class FireWithBullets implements FireStrategy {

	@Override
	public void fire() {
		System.out.println("bullet bullet bullet");
	}
}
