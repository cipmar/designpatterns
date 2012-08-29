package ro.rmarius.designpatterns.strategy.characters;

public class AxeBehavior implements WeponBehavior {

	@Override
	public void useWepon() {
		System.out.println("axe");
	}
}
