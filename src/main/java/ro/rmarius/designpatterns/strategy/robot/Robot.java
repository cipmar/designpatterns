package ro.rmarius.designpatterns.strategy.robot;

public class Robot {
	private FireStrategy fireStrategy;

	public FireStrategy getFireStrategy() {
		return fireStrategy;
	}

	public void setFireStrategy(FireStrategy fireStrategy) {
		this.fireStrategy = fireStrategy;
	}

	public void attack() {
		System.out.println("prepare fire...");

		if (fireStrategy != null) {
			fireStrategy.fire();
		} else {
			System.out.println("no fire strategy...");
		}
		
		System.out.println("stop fire...");
	}
}
