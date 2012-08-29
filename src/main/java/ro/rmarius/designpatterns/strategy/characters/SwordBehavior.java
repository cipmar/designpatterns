package ro.rmarius.designpatterns.strategy.characters;

public class SwordBehavior implements WeponBehavior {

	@Override
	public void useWepon() {
		System.out.println("sword");
	}
}
