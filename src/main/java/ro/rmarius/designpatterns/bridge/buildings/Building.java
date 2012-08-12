package ro.rmarius.designpatterns.bridge.buildings;

public abstract class Building {

	private HeatingSystem heating;

	public Building(HeatingSystem heating) {
		this.heating = heating;
	}

	public void heat() {
		heating.heat();
	}
}
