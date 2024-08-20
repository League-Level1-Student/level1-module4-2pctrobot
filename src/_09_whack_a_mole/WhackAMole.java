package _09_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JFrame frame;
	JPanel panel;
	JButton molespot01;
	JButton molespot02;
	JButton molespot03;
	JButton molespot04;
	JButton molespot05;
	JButton molespot06;
	JButton molespot07;
	JButton molespot08;
	JButton molespot09;
	JButton molespot10;
	JButton molespot11;
	JButton molespot12;
	JButton molespot13;
	JButton molespot14;
	JButton molespot15;
	JButton molespot16;
	JButton molespot17;
	JButton molespot18;
	JButton molespot19;
	JButton molespot20;
	JButton molespot21;
	JButton molespot22;
	JButton molespot23;
	JButton molespot24;
	public WhackAMole(JFrame frame,JPanel panel,JButton molespot01,JButton molespot02,JButton molespot03,JButton molespot04,JButton molespot05,JButton molespot06,JButton molespot07,JButton molespot08,JButton molespot09,JButton molespot10,JButton molespot11,JButton molespot12,JButton molespot13,JButton molespot14,JButton molespot15,JButton molespot16,JButton molespot17,JButton molespot18,JButton molespot19,JButton molespot20,JButton molespot21,JButton molespot22,JButton molespot23,JButton molespot24) {
		chooseSpot();
	}
private void chooseSpot() {
	int number = 0;
	Random ran = new Random();
	number = ran.nextInt(24);
	if (number == 0) {
		molespot01.setText("Mole!");
	} else if (number == 1) {
		
	} else if (number == 2) {
		
	} else if (number == 3) {
		
	} else if (number == 4) {
		
	} else if (number == 5) {
		
	} else if (number == 6) {
		
	} else if (number == 7) {
		
	} else if (number == 8) {
		
	} else if (number == 9) {
		
	} else if (number == 10) {
		
	} else if (number == 11) {
		
	} else if (number == 12) {
		
	} else if (number == 13) {
		
	} else if (number == 14) {
		
	} else if (number == 15) {
		
	} else if (number == 16) {
		
	} else if (number == 17) {
		
	} else if (number == 18) {
		
	} else if (number == 19) {
		
	} else if (number == 20) {
		
	} else if (number == 21) {
		
	} else if (number == 22) {
		
	} else if (number == 23) {
		
	}
		
	}
public static void main(String[] args) {
	
}
}
