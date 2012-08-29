package ro.rmarius.designpatterns.strategy.characters;

public abstract class Character {
	private WeponBehavior weponBehavior;

	public void setWeponBehavior(WeponBehavior weponBehavior) {
		this.weponBehavior = weponBehavior;
	}

	public void fight() {
		weponBehavior.useWepon();
	}
}
