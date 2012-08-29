package ro.rmarius.designpatterns.strategy.duck;

public class Duck {
	private FlyBehavior flyBehavior;

	private QuackBehaviour quackBehaviour;

	public Duck() {
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
