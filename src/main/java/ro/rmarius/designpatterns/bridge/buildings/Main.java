package ro.rmarius.designpatterns.bridge.buildings;

import java.util.ArrayList;
import java.util.List;

/**
 * Bridge pattern: decouple an abstraction from its implementation so that the two can vary independently.
 * 
 * Abstractia in acest caz este {@link Building} cu clasele concrete {@link Apartament} si {@link House}. In
 * {@link Building} avem o metoda heat() a carei implementari poate varia (sistem centralizat de incalzire sau centrala
 * termica). Implementarea acestei metode este delegata catre o alta ierarhie abtracta, {@link HeatingSystem} cu cele 2
 * implementari posibile {@link CentralHeatingSystem} si {@link CentralizedHeatingSystem}. Bridge-ul se realizeaza
 * astfel intre clasele {@link Building} (abstractia) si interfata {@link HeatingSystem} (implementarea acestei
 * abstractii).
 * 
 * Este un pattern creational, odata creat (de exemplu) obiectul de tip {@link House} implementarea de
 * {@link HeatingSystem} pe care o utilizeaza nu se mai poate modifica (se primeste prin constructor). Pattern-ul
 * seamana oarecum cu Strategy. Strategy este un patern comportamental, implementarea utilizata putandu-se schimba la
 * runtime.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Building> buildings = new ArrayList<Building>();

		buildings.add(new House(new CentralHeatingSystem()));
		buildings.add(new House(new CentralizedHeatingSystem()));
		buildings.add(new Apartament(new CentralizedHeatingSystem()));
		buildings.add(new Apartament(new CentralHeatingSystem()));

		for (Building building : buildings) {
			building.heat();
		}
	}
}
