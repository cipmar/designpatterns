package ro.rmarius.designpatterns.decorator.document;

public class PdfDocument implements Document {

	@Override
	public void print() {
		System.out.println("Pdf document content");
	}
}