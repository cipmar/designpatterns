package ro.rmarius.designpatterns.bridge;

public abstract class Abstraction {
	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	public void function() {
		implementor.implementation();
	}
}
