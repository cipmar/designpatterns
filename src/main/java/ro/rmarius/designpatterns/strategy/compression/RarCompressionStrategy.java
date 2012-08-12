package ro.rmarius.designpatterns.strategy.compression;

public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compress(String file) {
		System.out.println(file + " compressed with rar algorithm");
	}
}
