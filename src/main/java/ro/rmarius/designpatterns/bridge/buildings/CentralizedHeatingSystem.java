package ro.rmarius.designpatterns.bridge.buildings;

public class CentralizedHeatingSystem implements HeatingSystem {

	@Override
	public void heat() {
		System.out.println("heat() CentralizedHeatingSystem");
	}
}
