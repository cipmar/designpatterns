package ro.rmarius.designpatterns.bridge;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void implementation() {
		System.out.println("ConcreteImplementor1 implementation()");
	}
}
