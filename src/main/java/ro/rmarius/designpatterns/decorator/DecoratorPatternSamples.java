package ro.rmarius.designpatterns.decorator;

import ro.rmarius.designpatterns.decorator.document.Document;
import ro.rmarius.designpatterns.decorator.document.Footer;
import ro.rmarius.designpatterns.decorator.document.Header;
import ro.rmarius.designpatterns.decorator.document.PdfDocument;

/**
 * Decorator pattern: Attach additional responsibilities to an object dynamically. Decorators provide a flexible
 * alternative to subclassing for extending functionality.
 * 
 * Fiecare document are o metoda print. Comportamentul acestei metode este extins prin decoratorii {@link Header} si
 * {@link Footer}. La runtime, unui obiect i se pot asocia oricati decoratori.
 */
public class DecoratorPatternSamples {

	public static void main(String[] args) {
		Component c = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
		c.operation();

		System.out.println();

		c = new ConcreteDecoratorA(new ConcreteComponent());
		c.operation();

		System.out.println();

		Document document = new Header("1", new Header("2", new Footer("1", new PdfDocument())));
		document.print();
	}
}
