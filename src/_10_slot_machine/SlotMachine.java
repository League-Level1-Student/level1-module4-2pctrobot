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
import javax.swing.JOptionPane;
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
	
	public SlotMachine(JFrame frame, JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JButton aspectGamble) throws MalformedURLException {
		this.frame = frame;
		this.panel1 = panel1;
		this.panel2 = panel2;
		this.panel3 = panel3;
		this.panel4 = panel4;
		/*this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;*/
		this.aspectGamble = aspectGamble;
		label1 = createLabelImage("Cloak.jpg");
		label2 = createLabelImage("Cloak.jpg");
		label3 = createLabelImage("Cloak.jpg");
		this.aspectGamble = aspectGamble;
		aspectGamble.setText("Reroll");
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
		return (Icon) new JLabel();
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
//	JLabel label1 = new JLabel();
//	JLabel label2 = new JLabel();
//	JLabel label3 = new JLabel();
	JButton aspectGamble = new JButton();
	SlotMachine aspect = new SlotMachine(frame, panel1, panel2, panel3, panel4, aspectGamble);
	/*, label1, label2, label3*/
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton temp = (JButton) e.getSource();
	if(temp.equals(aspectGamble)) {
	number1 = ran1.nextInt(10);
	if(number1==0) {
		label1.setIcon(createIcon("Blazing.jpg"));
		frame.pack();
	}else if(number1==1) {
		label1.setIcon(createIcon("Celestine.jpg"));
		frame.pack();
	}else if(number1==2) {
		label1.setIcon(createIcon("Gilded.jpg"));
		frame.pack();
	}else if(number1==3) {
		label1.setIcon(createIcon("Glacial.jpg"));
		frame.pack();
	}else if(number1==4) {
		label1.setIcon(createIcon("Malachite.jpg"));
		frame.pack();
	}else if(number1==5) {
		label1.setIcon(createIcon("Mending.jpg"));
		frame.pack();
	}else if(number1==6) {
		label1.setIcon(createIcon("Overloading.jpg"));
		frame.pack();
	}else if(number1==7) {
		label1.setIcon(createIcon("Perfected.jpg"));
		frame.pack();
	}else if(number1==8) {
		label1.setIcon(createIcon("Twisted.jpg"));
		frame.pack();
	}else if(number1==9) {
		label1.setIcon(createIcon("Voidtouched.jpg"));
		frame.pack();
	}
number2 = ran2.nextInt(10);
if(number2==0) {
	label2.setIcon(createIcon("Blazing.jpg"));
	frame.pack();
}else if(number2==1) {
	label2.setIcon(createIcon("Celestine.jpg"));
	frame.pack();
}else if(number2==2) {
	label2.setIcon(createIcon("Gilded.jpg"));
	frame.pack();
}else if(number2==3) {
	label2.setIcon(createIcon("Glacial.jpg"));
	frame.pack();
}else if(number2==4) {
	label2.setIcon(createIcon("Malachite.jpg"));
	frame.pack();
}else if(number2==5) {
	label2.setIcon(createIcon("Mending.jpg"));
	frame.pack();
}else if(number2==6) {
	label2.setIcon(createIcon("Overloading.jpg"));
	frame.pack();
}else if(number2==7) {
	label2.setIcon(createIcon("Perfected.jpg"));
	frame.pack();
}else if(number2==8) {
	label2.setIcon(createIcon("Twisted.jpg"));
	frame.pack();
}else if(number2==9) {
	label2.setIcon(createIcon("Voidtouched.jpg"));
	frame.pack();
}
number3 = ran3.nextInt(10);
if(number3==0) {
	label3.setIcon(createIcon("Blazing.jpg"));
	frame.pack();
}else if(number3==1) {
	label3.setIcon(createIcon("Celestine.jpg"));
	frame.pack();
}else if(number3==2) {
	label3.setIcon(createIcon("Gilded.jpg"));
	frame.pack();
}else if(number3==3) {
	label3.setIcon(createIcon("Glacial.jpg"));
	frame.pack();
}else if(number3==4) {
	label3.setIcon(createIcon("Malachite.jpg"));
	frame.pack();
}else if(number3==5) {
	label3.setIcon(createIcon("Mending.jpg"));
	frame.pack();
}else if(number3==6) {
	label3.setIcon(createIcon("Overloading.jpg"));
	frame.pack();
}else if(number3==7) {
	label3.setIcon(createIcon("Perfected.jpg"));
	frame.pack();
}else if(number3==8) {
	label3.setIcon(createIcon("Twisted.jpg"));
	frame.pack();
}else if(number3==9) {
	label3.setIcon(createIcon("Voidtouched.jpg"));
	frame.pack();
}
if(number1==0&&number2==0&&number3==0) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained Ifrit's Distinction! You are now a Blazing Elite!");
}else if(number1==1&&number2==1&&number3==1) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained Spectral Circlet! You are now a Celestine Elite!");
}else if(number1==2&&number2==2&&number3==2) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained Aurelionite's Blessing! You are now a Gilded Elite!");
}else if(number1==3&&number2==3&&number3==3) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained Her Biting Embrace! You are now a Glacial Elite!");
}else if(number1==4&&number2==4&&number3==4) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained N'kuhana's Retort! You are now a Malachite Elite!");
}else if(number1==5&&number2==5&&number3==5) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained His Reassurance! You are now a Mending Elite!");
}else if(number1==6&&number2==6&&number3==6) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained Silence Between Two Strikes! You are now a Overloading Elite!");
}else if(number1==7&&number2==7&&number3==7) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained Shared Design! You are now a Perfected Elite!");
}else if(number1==8&&number2==8&&number3==8) {
	JOptionPane.showMessageDialog(null, "Congrats! You obtained His Spiteful Boon! You are now a Twisted Elite!");
}else if(number1==9&&number2==9&&number3==9) {
	JOptionPane.showMessageDialog(null, "A Void Infestor latched on to you! You are now a Voidtouched Elite! I'm not sure that's a good thing.");
}

	}
		// TODO Auto-generated catch block

	}
	




}
