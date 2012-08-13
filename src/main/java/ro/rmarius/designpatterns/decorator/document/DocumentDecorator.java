package ro.rmarius.designpatterns.decorator.document;

public class DocumentDecorator implements Document {

	private Document document;

	public DocumentDecorator(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void print() {
		document.print();
	}
}
