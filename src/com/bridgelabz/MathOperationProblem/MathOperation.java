package com.bridgelabz.MathOperationProblem;

@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);

	static void printResult(int a, int b, String function, IMathFunction fobj) {
		System.out.println("Result of " + function + "is " + fobj.calculate(a, b));
	}
}

public class MathOperation {

	// Welcome Message
	public static void main(String[] args) {
		System.out.println("Welcome to Math Operation App Using Lambda Expression.");
		// This expression implements 'IMathFunction' interface
		IMathFunction add = Integer::sum;
		IMathFunction multiply = (x, y) -> x * y;
		IMathFunction divide = (x, y) -> x / y;

		// Passing Lambda Expression as Function Parameter to Print Result using Static
		// Function
		IMathFunction.printResult(6, 3, "Addition ", add);
		IMathFunction.printResult(6, 3, "Multiplication ", multiply);
		IMathFunction.printResult(6, 3, "Division ", divide);

	}

}
