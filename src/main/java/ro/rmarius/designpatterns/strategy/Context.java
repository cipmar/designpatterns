package ro.rmarius.designpatterns.strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy defaultStrategy) {
		this.strategy = defaultStrategy;
	}

	public void contextInterface() {
		if (strategy != null) {
			strategy.algorithmInterface();
		}
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
