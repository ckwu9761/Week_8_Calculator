package Calculator.operations;

public class Multiplication extends Operation {

	@Override
	public String getName() {
		return "multiplication";
	}

	@Override
	public String getOpertor() {
		return "*";
	}

	@Override
	public double calc() {
		return a * b;
	}

}
