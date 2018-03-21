package Calculator.operations;

public class Subtraction extends Operation {

	@Override
	public String getName() {
		return "subtraction";
	}

	@Override
	public String getOpertor() {
		return "-";
	}

	@Override
	public double calc() {
		return a - b;
	}

}
