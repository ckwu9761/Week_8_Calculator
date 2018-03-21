package Calculator.operations;

public abstract class Operation {

	protected double a, b;

	/**
	 * Returns the name of the operation
	 * 
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Returns the operator needed to trigger the operation
	 * 
	 * @return the operator
	 */
	public abstract String getOpertor();

	/**
	 * Performs the actual computation and returns the result
	 * 
	 * @return the result of the operation
	 */
	public abstract double calc();

	/**
	 * Sets the two numbers to perform the operation
	 * 
	 * @param a
	 *            first number
	 * @param b
	 *            second number
	 */
	public void setNumbers(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public static Operation parseOperator(String o) {
		Operation[] ops = new Operation[] { new Addition(), new Multiplication(), new Subtraction() };
		for (Operation op : ops) {
			if (o.equals(op.getOpertor())) {
				return op;
			}
		}
		return null;
	}

}
