package ro.rmarius.designpatterns.decorator.document;

public class Footer extends DocumentDecorator {

	private String name;

	public Footer(String name, Document document) {
		super(document);
		this.name = name;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Footer " + name);
	}
}
