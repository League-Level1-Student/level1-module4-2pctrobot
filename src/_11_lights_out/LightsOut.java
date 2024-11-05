package _11_lights_out;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {

	JPanel gamePanel = new JPanel();
	JLabel light00 = new JLabel();
	JLabel light01 = new JLabel();
	JLabel light02 = new JLabel();
	JLabel light03 = new JLabel();
	JLabel light04 = new JLabel();
	JLabel light05 = new JLabel();
	JLabel light06 = new JLabel();
	JLabel light07 = new JLabel();
	JLabel light08 = new JLabel();
	JLabel light09 = new JLabel();
	JLabel light10 = new JLabel();
	JLabel light11 = new JLabel();
	JLabel light12 = new JLabel();
	JLabel light13 = new JLabel();
	JLabel light14 = new JLabel();
	JLabel light15 = new JLabel();
	JLabel light16 = new JLabel();
	JLabel light17 = new JLabel();
	JLabel light18 = new JLabel();
	JLabel light19 = new JLabel();
	JLabel light20 = new JLabel();
	JLabel light21 = new JLabel();
	JLabel light22 = new JLabel();
	JLabel light23 = new JLabel();
	JLabel light24 = new JLabel();
	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
		gamePanel.setLayout(new GridLayout(5, 5));
		
			//2. Add 25 JLabels to your gamePanel (these are your lights)

gamePanel.add(light00);
gamePanel.add(light01);
gamePanel.add(light02);
gamePanel.add(light03);
gamePanel.add(light04);
gamePanel.add(light05);
gamePanel.add(light06);
gamePanel.add(light07);
gamePanel.add(light08);
gamePanel.add(light09);
gamePanel.add(light10);
gamePanel.add(light11);
gamePanel.add(light12);
gamePanel.add(light13);
gamePanel.add(light14);
gamePanel.add(light15);
gamePanel.add(light16);
gamePanel.add(light17);
gamePanel.add(light18);
gamePanel.add(light19);
gamePanel.add(light20);
gamePanel.add(light21);
gamePanel.add(light22);
gamePanel.add(light23);
gamePanel.add(light24);
			//3. Use setText() to add a position number to each light (0-24).
lightText(light00, "0");
light01.setText("1");
light02.setText("2");
light03.setText("3");
light04.setText("4");
light05.setText("5");
light06.setText("6");
light07.setText("7");
light08.setText("8");
light09.setText("9");
light10.setText("10");
light11.setText("11");
light12.setText("12");
light13.setText("13");
light14.setText("14");
light15.setText("15");
light16.setText("16");
light17.setText("17");
light18.setText("18");
light19.setText("19");
light20.setText("20");
light21.setText("21");
light22.setText("22");
light23.setText("23");
light24.setText("24");
			//4. Set the background of each light to LIGHT_GRAY
			// - you will also have to set the background to opaque.
			// - Use light.setOpaque(true);
light00.setBackground(Color.GRAY);
light00.setOpaque(true);
light01.setBackground(Color.GRAY);
light01.setOpaque(true);
light02.setBackground(Color.GRAY);
light02.setOpaque(true);
light03.setBackground(Color.GRAY);
light03.setOpaque(true);
light04.setBackground(Color.GRAY);
light04.setOpaque(true);
light05.setBackground(Color.GRAY);
light05.setOpaque(true);
light06.setBackground(Color.GRAY);
light06.setOpaque(true);
light07.setBackground(Color.GRAY);
light07.setOpaque(true);
light08.setBackground(Color.GRAY);
light08.setOpaque(true);
light09.setBackground(Color.GRAY);
light09.setOpaque(true);
light10.setBackground(Color.GRAY);
light10.setOpaque(true);
light11.setBackground(Color.GRAY);
light11.setOpaque(true);
light12.setBackground(Color.GRAY);
light12.setOpaque(true);
light13.setBackground(Color.GRAY);
light13.setOpaque(true);
light14.setBackground(Color.GRAY);
light14.setOpaque(true);
light15.setBackground(Color.GRAY);
light15.setOpaque(true);
light16.setBackground(Color.GRAY);
light16.setOpaque(true);
light17.setBackground(Color.GRAY);
light17.setOpaque(true);
light18.setBackground(Color.GRAY);
light18.setOpaque(true);
light19.setBackground(Color.GRAY);
light19.setOpaque(true);
light20.setBackground(Color.GRAY);
light20.setOpaque(true);
light21.setBackground(Color.GRAY);
light21.setOpaque(true);
light22.setBackground(Color.GRAY);
light22.setOpaque(true);
light23.setBackground(Color.GRAY);
light23.setOpaque(true);
light24.setBackground(Color.GRAY);
light24.setOpaque(true);
			//5. Add a mouseListener to each light
light00.addMouseListener(this);		
light01.addMouseListener(this);
light02.addMouseListener(this);
light03.addMouseListener(this);
light04.addMouseListener(this);
light05.addMouseListener(this);		
light06.addMouseListener(this);
light07.addMouseListener(this);
light08.addMouseListener(this);
light09.addMouseListener(this);
light10.addMouseListener(this);		
light11.addMouseListener(this);
light12.addMouseListener(this);
light13.addMouseListener(this);
light14.addMouseListener(this);
light15.addMouseListener(this);		
light16.addMouseListener(this);
light17.addMouseListener(this);
light18.addMouseListener(this);
light19.addMouseListener(this);
light20.addMouseListener(this);		
light21.addMouseListener(this);
light22.addMouseListener(this);
light23.addMouseListener(this);
light24.addMouseListener(this);
		
		//6. Add your panel to a frame
JFrame frame = new JFrame();
frame.add(gamePanel);
frame.setVisible(true);
		//7. Set the size of the frame
frame.setSize(500, 500);
int number1;
Random ran1 = new Random();
int number2;
Random ran2 = new Random();
number2 = ran2.nextInt(100);
for (int i = 0; i < number2; i++) {
	number1 = ran1.nextInt(25);
	makeMove(number1);
	}


	}

	private void lightText(JLabel light00, String text) {
		light00.setText(text);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
System.out.println((JLabel) e.getSource());
JLabel labelPressed  = (JLabel)e.getSource();
int position = Integer.valueOf(labelPressed.getText());
		// 2. Get the number (position) of the light
if(position == 0) {
	makeMove(position);
} else if(position == 1) {
	makeMove(position);
} else if(position == 2) {
	makeMove(position);
} else if(position == 3) {
	makeMove(position);
} else if(position == 4) {
	makeMove(position);
} else if(position == 5) {
	makeMove(position);
} else if(position == 6) {
	makeMove(position);
} else if(position == 7) {
	makeMove(position);
} else if(position == 8) {
	makeMove(position);
} else if(position == 9) {
	makeMove(position);
} else if(position == 10) {
	makeMove(position);
} else if(position == 11) {
	makeMove(position);
} else if(position == 12) {
	makeMove(position);
} else if(position == 13) {
	makeMove(position);
} else if(position == 14) {
	makeMove(position);
} else if(position == 15) {
	makeMove(position);
} else if(position == 16) {
	makeMove(position);
} else if(position == 17) {
	makeMove(position);
} else if(position == 18) {
	makeMove(position);
} else if(position == 19) {
	makeMove(position);
} else if(position == 20) {
	makeMove(position);
} else if(position == 21) {
	makeMove(position);
} else if(position == 22) {
	makeMove(position);
} else if(position == 23) {
	makeMove(position);
} else if(position == 24) {
	makeMove(position);
}	// 3. Now use the makeMove method to code which lights turn on and off.

		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color
if(light00.getBackground()==Color.WHITE &&light01.getBackground()==Color.WHITE&&light02.getBackground()==Color.WHITE &&light03.getBackground()==Color.WHITE &&light04.getBackground()==Color.WHITE&&light05.getBackground()==Color.WHITE &&light06.getBackground()==Color.WHITE&&light07.getBackground()==Color.WHITE &&light08.getBackground()==Color.WHITE &&light09.getBackground()==Color.WHITE&&light10.getBackground()==Color.WHITE &&light11.getBackground()==Color.WHITE&&light12.getBackground()==Color.WHITE &&light13.getBackground()==Color.WHITE &&light14.getBackground()==Color.WHITE&&light15.getBackground()==Color.WHITE &&light16.getBackground()==Color.WHITE&&light17.getBackground()==Color.WHITE &&light18.getBackground()==Color.WHITE &&light19.getBackground()==Color.WHITE&&light20.getBackground()==Color.WHITE &&light21.getBackground()==Color.WHITE&&light22.getBackground()==Color.WHITE &&light23.getBackground()==Color.WHITE &&light24.getBackground()==Color.WHITE) {
	JOptionPane.showMessageDialog(null, "You did it! Good job!");}
}
		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?
/**int number0 = 0;
Random ran0 = new Random();
number0 = ran0.nextInt(2);
int number1 = 0;
Random ran1 = new Random();
number1 = ran1.nextInt(2);
int number2 = 0;
Random ran2 = new Random();
number2 = ran2.nextInt(2);
int number3 = 0;
Random ran3 = new Random();
number3 = ran3.nextInt(2);
int number4 = 0;
Random ran4 = new Random();
number4 = ran4.nextInt(2);
int number5 = 0;
Random ran5 = new Random();
number5 = ran5.nextInt(2);
int number6 = 0;
Random ran6 = new Random();
number6 = ran6.nextInt(2);
int number7 = 0;
Random ran7 = new Random();
number7 = ran7.nextInt(2);
int number8 = 0;
Random ran8 = new Random();
number8 = ran8.nextInt(2);
int number9 = 0;
Random ran9 = new Random();
number9 = ran9.nextInt(2);
int number10 = 0;
Random ran10 = new Random();
number10 = ran10.nextInt(2);
int number11 = 0;
Random ran11 = new Random();
number11 = ran11.nextInt(2);
int number12 = 0;
Random ran12 = new Random();
number12 = ran12.nextInt(2);
int number13 = 0;
Random ran13 = new Random();
number13 = ran13.nextInt(2);
int number14 = 0;
Random ran14 = new Random();
number14 = ran14.nextInt(2);
int number15 = 0;
Random ran15 = new Random();
number15 = ran15.nextInt(2);
int number16 = 0;
Random ran16 = new Random();
number0 = ran16.nextInt(2);
int number17 = 0;
Random ran17 = new Random();
number0 = ran17.nextInt(2);
int number18 = 0;
Random ran18 = new Random();
number0 = ran18.nextInt(2);
int number19 = 0;
Random ran19 = new Random();
number0 = ran19.nextInt(2);
int number20 = 0;
Random ran20 = new Random();
number0 = ran20.nextInt(2);
int number21 = 0;
Random ran21 = new Random();
number0 = ran21.nextInt(2);
int number22 = 0;
Random ran22 = new Random();
number0 = ran22.nextInt(2);
int number23 = 0;
Random ran23 = new Random();
number0 = ran23.nextInt(2);
int number24 = 0;
Random ran24 = new Random();
number0 = ran24.nextInt(2);
	}**/

	
	void makeMove(int pos) {
		toggle((JLabel) gamePanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) gamePanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) gamePanel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) gamePanel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.GRAY);

		} else {
			label.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}
