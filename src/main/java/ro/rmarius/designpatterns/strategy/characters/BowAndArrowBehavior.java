package ro.rmarius.designpatterns.strategy.characters;

public class BowAndArrowBehavior implements WeponBehavior {

	@Override
	public void useWepon() {
		System.out.println("bow and arrow behavior");
	}
}
