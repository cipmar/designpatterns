package ro.rmarius.designpatterns.bridge;

public class ConcreteImplementorB implements Implementor {

	@Override
	public void implementation() {
		System.out.println("ConcreteImplementor2 implementation()");
	}
}
