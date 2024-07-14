package _06_calculator;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.run();
	}

	private static int divide(int number1,  int number2) {
		return number1 / number2;
	}

	private static int multiply(int number1,  int number2) {
		return number1 * number2;
	}

	private static int subtract(int number1,  int number2) {
		return number1 - number2;
	}

	private static int add(int number1,  int number2) {
		return number1 + number2;
	}

	public void run() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JTextField field = new JTextField();
		frame.add(field);
		frame.setVisible(true);
		frame.pack();
		System.out.println(divide(9,3));
	}
}
