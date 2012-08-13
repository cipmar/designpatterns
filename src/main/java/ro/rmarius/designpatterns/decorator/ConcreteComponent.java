package ro.rmarius.designpatterns.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("operation");
	}
}
