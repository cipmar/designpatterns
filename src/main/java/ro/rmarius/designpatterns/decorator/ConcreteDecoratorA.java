package ro.rmarius.designpatterns.decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		System.out.println("concrete decorator A (before)");
		super.operation();
	}
}
