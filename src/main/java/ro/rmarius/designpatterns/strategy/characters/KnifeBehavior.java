package ro.rmarius.designpatterns.strategy.characters;

public class KnifeBehavior implements WeponBehavior {

	@Override
	public void useWepon() {
		System.out.println("knife");
	}
}
