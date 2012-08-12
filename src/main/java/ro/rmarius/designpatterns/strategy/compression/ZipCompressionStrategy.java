package ro.rmarius.designpatterns.strategy.compression;

public class ZipCompressionStrategy implements CompressionStrategy {

	@Override
	public void compress(String file) {
		System.out.println(file + " compressed with zip algorithm");
	}
}
