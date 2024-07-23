package _06_calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField field = new JTextField();
	JTextField field2 = new JTextField();
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
		field.setPreferredSize(new Dimension(100,25));
		field2.setPreferredSize(new Dimension(100,25));
		add.setText("add");
		add.addActionListener(this);
		sub.setText("sub");
		sub.addActionListener(this); 
		mul.setText("mul");
		mul.addActionListener(this);
		div.setText("div");
		div.addActionListener(this);
		JPanel pan = new JPanel();
		JPanel skillet = new JPanel();
		JPanel cubboard = new JPanel();
		cubboard.setSize(600,75);
		frame.setSize(600,75);
		pan.add(add);
		pan.add(sub);
		pan.add(mul);
		pan.add(div);
		skillet.add(field);
		skillet.add(field2);
		cubboard.add(skillet);
		cubboard.add(pan);
		frame.add(cubboard);
		//frame.setLayout(new BoxLayout(cubboard, BoxLayout.Y_AXIS));
		frame.setTitle("Calculator");
		frame.setVisible(true);
		//frame.pack();
		System.out.println(divide(9,3));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(add)) {
			System.out.println(add(field,field2));
		} else if(buttonPressed.equals(sub)) {
			System.out.println(sub(field,field2));
		} else if(buttonPressed.equals(mul)) {
			System.out.println(mul(field,field2));
		} else if(buttonPressed.equals(div)) {
			System.out.println(diiv(field,field2));
		}
	}
}
