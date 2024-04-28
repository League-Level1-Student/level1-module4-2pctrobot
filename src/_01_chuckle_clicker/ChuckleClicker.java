package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	static JButton leftButton = new JButton();
	static JButton rightButton = new JButton();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	void run() {
		makeButtons();
	}
public static void main(String[] args) {
	ChuckleClicker click = new ChuckleClicker();
	click.run();
}

private void makeButtons() {
	// TODO Auto-generated method stub
	
	
	leftButton.setText("Joke");
	rightButton.setText("Punchline");
	leftButton.addActionListener(this);
	rightButton.addActionListener(this);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(leftButton);
	panel.add(rightButton);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(e.getSource() == leftButton) {
		JOptionPane.showMessageDialog(null, "What did the sushi say to the bee?");
    } else if(e.getSource() == rightButton) {
    	JOptionPane.showMessageDialog(null, "Wasabi?");
    }
	
}

}

	

