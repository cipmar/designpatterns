package ro.rmarius.designpatterns.bridge;

public class ConcreteImplementor1 implements Implementor {

	@Override
	public void implementation() {
		System.out.println("ConcreteImplementor1 implementation()");
	}
}
