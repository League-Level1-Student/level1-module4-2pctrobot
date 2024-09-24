package _10_slot_machine;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JButton aspectGamble;
	int number1;
	int number2;
	int number3;
	Random ran1 = new Random();
	Random ran2 = new Random();
	Random ran3 = new Random();
	
	public SlotMachine(JFrame frame, JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JLabel label1, JLabel label2, JLabel label3, JButton aspectGamble) throws MalformedURLException {
		this.frame = frame;
		this.panel1 = panel1;
		this.panel2 = panel2;
		this.panel3 = panel3;
		this.panel4 = panel4;
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
		label1 = createLabelImage("Cloak.jpg");
		label2 = createLabelImage("Blazing.jpg");
		label3 = createLabelImage("Cloak.jpg");
		this.aspectGamble = aspectGamble;
		aspectGamble.addActionListener(this);
		frame.setLayout(new FlowLayout());
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(aspectGamble);
		frame.setVisible(true);
		label1.setSize(64,64);
		label2.setSize(64,64);
		label3.setSize(64,64);
		panel1.setSize(64,64);
		panel2.setSize(64,64);
		panel3.setSize(64,64);
		frame.setSize(334,104);
		
	}

	private JLabel createLabelImage(String fileName){
		
        Icon icon = createIcon(fileName);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

	private Icon createIcon(String fileName) {
		URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
		return icon;
	}
	
public static void main(String[] args) throws MalformedURLException {
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton aspectGamble = new JButton();
	SlotMachine aspect = new SlotMachine(frame, panel1, panel2, panel3, panel4, label1, label2, label3, aspectGamble);
}

@Override
public void actionPerformed(ActionEvent e) {
	number1 = ran1.nextInt(9);
	if(number1==0) {
		label1.setIcon(createIcon("Blazing.jpg"));
		frame.pack();
	}else if(number1==1) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}else if(number1==2) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}else if(number1==3) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}else if(number1==4) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}else if(number1==5) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}else if(number1==6) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}else if(number1==7) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}else if(number1==8) {
		label1 = createLabelImage("Blazing.jpg");
		frame.pack();
	}
number2 = ran2.nextInt(9);
if(number1==0) {
	
}else if(number1==1) {
	
}else if(number1==2) {
	
}else if(number1==3) {
	
}else if(number1==4) {
	
}else if(number1==5) {
	
}else if(number1==6) {
	
}else if(number1==7) {
	
}else if(number1==8) {
	
}
number3 = ran3.nextInt(9);
if(number1==0) {
	
}else if(number1==1) {
	
}else if(number1==2) {
	
}else if(number1==3) {
	
}else if(number1==4) {
	
}else if(number1==5) {
	
}else if(number1==6) {
	
}else if(number1==7) {
	
}else if(number1==8) {
	
}
		// TODO Auto-generated catch block

	}
	




}
