package ro.rmarius.designpatterns.strategy;

import ro.rmarius.designpatterns.strategy.compression.FileCompressor;
import ro.rmarius.designpatterns.strategy.compression.RarCompressionStrategy;
import ro.rmarius.designpatterns.strategy.compression.ZipCompressionStrategy;
import ro.rmarius.designpatterns.strategy.duck.Duck;
import ro.rmarius.designpatterns.strategy.duck.FlyNoWay;
import ro.rmarius.designpatterns.strategy.duck.FlyWithWings;
import ro.rmarius.designpatterns.strategy.duck.MuteQuack;
import ro.rmarius.designpatterns.strategy.duck.Quack;
import ro.rmarius.designpatterns.strategy.robot.FireWithBullets;
import ro.rmarius.designpatterns.strategy.robot.FireWithRockets;
import ro.rmarius.designpatterns.strategy.robot.Robot;

/**
 * Strategy Pattern: Define a family of algorithms, encapsulate each one, and make theminterchangeable. Strategy lets
 * the algorithm vary independently fromclients that use it.
 * 
 * Toate strategiile sunt incapsulate in interfata Strategy. Clientul, reprezentat de clasa {@link Robot} utilizeaza o
 * strategie la nivel abstract. Prin metoda setFireStrategy se schimba strategia de fire a robotului. Este un pattern
 * comportamental, strategia definint un comportament care poate fi interschimbat cu alta strategie la runtime. Se
 * aseamana oarecum cu Bridge, dar diferenta este mare: bridge este pattern creational: obiectele din abstractie odata
 * create cu o anumita implementare, implementarea nu se mai modifica.
 * 
 */
public class StrategyPatternSamples {
	public static void main(String[] args) {

		// robot sample
		Robot robot = new Robot();
		robot.setFireStrategy(new FireWithBullets());
		robot.attack();
		robot.setFireStrategy(new FireWithRockets());
		robot.attack();
		robot.setFireStrategy(new FireWithBullets());
		robot.attack();

		System.out.println();

		// compression sample
		FileCompressor fileCompressor = new FileCompressor();
		fileCompressor.setCompressionStrategy(new ZipCompressionStrategy());
		fileCompressor.compress("file1");
		fileCompressor.setCompressionStrategy(new RarCompressionStrategy());
		fileCompressor.compress("file2");

		System.out.println();

		// duck sample
		Duck mallardDuck = new Duck();
		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehaviour(new Quack());

		mallardDuck.performFly();
		mallardDuck.performQuack();

		Duck decoyDuck = new Duck();
		decoyDuck.setFlyBehavior(new FlyNoWay());
		decoyDuck.setQuackBehaviour(new MuteQuack());

		decoyDuck.performFly();
		decoyDuck.performQuack();
	}
}
