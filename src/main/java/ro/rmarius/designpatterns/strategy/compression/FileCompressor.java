package ro.rmarius.designpatterns.strategy.compression;

public class FileCompressor {

	private CompressionStrategy compressionStrategy;

	public CompressionStrategy getCompressionStrategy() {
		return compressionStrategy;
	}

	public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
		this.compressionStrategy = compressionStrategy;
	}

	public void compress(String file) {
		compressionStrategy.compress(file);
	}
}
