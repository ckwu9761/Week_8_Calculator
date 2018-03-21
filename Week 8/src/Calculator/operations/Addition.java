package Calculator.operations;

public class Addition extends Operation {

	@Override
	public String getName() {
		return "addition";
	}

	@Override
	public String getOpertor() {
		return "+";
	}

	@Override
	public double calc() {
		return a + b;
	}

}
