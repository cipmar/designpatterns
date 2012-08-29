package ro.rmarius.designpatterns.strategy.duck;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Mute!");
	}
}
