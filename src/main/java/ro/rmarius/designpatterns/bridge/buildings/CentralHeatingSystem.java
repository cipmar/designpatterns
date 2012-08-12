package ro.rmarius.designpatterns.bridge.buildings;

public class CentralHeatingSystem implements HeatingSystem {

	@Override
	public void heat() {
		System.out.println("heat() CentralHeatingSystem");
	}
}
