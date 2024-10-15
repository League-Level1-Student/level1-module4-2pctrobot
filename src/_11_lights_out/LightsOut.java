package _11_lights_out;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
		gamePanel.setLayout(new GridLayout(5, 5));
		
			//2. Add 25 JLabels to your gamePanel (these are your lights)
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
lightText(light00, "00");
light01.setText("01");
light02.setText("02");
light03.setText("03");
light04.setText("04");
light05.setText("05");
light06.setText("06");
light07.setText("07");
light08.setText("08");
light09.setText("09");
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
	}

	private void lightText(JLabel light00, String text) {
		light00.setText(text);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
System.out.println((JLabel) e.getSource());

		// 2. Get the number (position) of the light

		// 3. Now use the makeMove method to code which lights turn on and off.

		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

	}

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
			label.setBackground(Color.LIGHT_GRAY);

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
