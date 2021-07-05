package com.bridgelabz.MathOperationProblem;

@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);
}

public class MathOperation {

	// Welcome Message
	public static void main(String[] args) {
		System.out.println("Welcome to Math Operation App Using Lambda Expression.");
		// This expression implements 'IMathFunction' interface
		IMathFunction add = Integer::sum;
		IMathFunction multiply = (x, y) -> x * y;
		IMathFunction divide = (x, y) -> x / y;

		// Add & Multiply two numbers using lambda expression
		System.out.println("Addition is " + add.calculate(6, 3));
		System.out.println("Multiplication is " + multiply.calculate(6, 3));
		System.out.println("Division is " + divide.calculate(6, 3));
	}

}
