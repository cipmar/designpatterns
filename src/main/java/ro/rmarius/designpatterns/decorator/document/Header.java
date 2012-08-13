package ro.rmarius.designpatterns.decorator.document;

public class Header extends DocumentDecorator {

	private String name;

	public Header(String name, Document document) {
		super(document);
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("Header " + name);
		super.print();
	}
}
