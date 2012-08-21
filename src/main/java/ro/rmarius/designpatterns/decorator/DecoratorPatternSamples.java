package ro.rmarius.designpatterns.decorator;

import ro.rmarius.designpatterns.decorator.beverage.Beverage;
import ro.rmarius.designpatterns.decorator.beverage.Expresso;
import ro.rmarius.designpatterns.decorator.beverage.HouseBlend;
import ro.rmarius.designpatterns.decorator.beverage.Milk;
import ro.rmarius.designpatterns.decorator.beverage.Suger;
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
		// document
		Component c = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
		c.operation();

		System.out.println();

		c = new ConcreteDecoratorA(new ConcreteComponent());
		c.operation();

		System.out.println();

		Document document = new Header("1", new Header("2", new Footer("1", new PdfDocument())));
		document.print();
		
		System.out.println();
		
		// beverage
		Beverage beverage1 = new Milk(new Suger(new Expresso()));
		System.out.println(beverage1.getDescription() + " " + beverage1.cost());

		Beverage beverage2 = new Milk(new Expresso());
		System.out.println(beverage2.getDescription() + " " + beverage2.cost());
		
		Beverage beverage3 = new Milk(new Suger(new HouseBlend()));
		System.out.println(beverage3.getDescription() + " " + beverage3.cost());
	}
}
