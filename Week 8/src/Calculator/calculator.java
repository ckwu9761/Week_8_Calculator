package Calculator;

import java.util.Scanner;

import Calculator.operations.Operation;

public class calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Insert first number: ");
		Double a = s.nextDouble();
		s.nextLine();
		System.out.print("Insert the operator: ");
		String op = s.nextLine();
		System.out.print("Insert first number: ");
		Double b = s.nextDouble();

		Operation o = Operation.parseOperator(op);
		if (o == null) {
			System.err.println("Operator non recongnized!");
		} else {
			o.setNumbers(a, b);
			System.out.print("Resule of " + o.getName() + " is " + o.calc());
		}
		s.close();

	}

}
