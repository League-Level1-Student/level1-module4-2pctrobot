package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
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
	int critMole;
	public WhackAMole(JFrame frame,JPanel panel,JButton molespot01,JButton molespot02,JButton molespot03,JButton molespot04,JButton molespot05,JButton molespot06,JButton molespot07,JButton molespot08,JButton molespot09,JButton molespot10,JButton molespot11,JButton molespot12,JButton molespot13,JButton molespot14,JButton molespot15,JButton molespot16,JButton molespot17,JButton molespot18,JButton molespot19,JButton molespot20,JButton molespot21,JButton molespot22,JButton molespot23,JButton molespot24) {
	this.frame = frame;
	this.panel = panel;
	this.molespot01 = molespot01;
	this.molespot02 = molespot02;
	this.molespot03 = molespot03;
	this.molespot04 = molespot04;
	this.molespot05 = molespot05;
	this.molespot06 = molespot06;
	this.molespot07 = molespot07;
	this.molespot08 = molespot08;
	this.molespot09 = molespot09;
	this.molespot10 = molespot10;
	this.molespot11 = molespot11;
	this.molespot12 = molespot12;
	this.molespot13 = molespot13;
	this.molespot14 = molespot14;
	this.molespot15 = molespot15;
	this.molespot16 = molespot16;
	this.molespot17 = molespot17;
	this.molespot18 = molespot18;
	this.molespot19 = molespot19;
	this.molespot20 = molespot20;
	this.molespot21 = molespot21;
	this.molespot22 = molespot22;
	this.molespot23 = molespot23;
	this.molespot24 = molespot24;
	panel.add(molespot01);
	panel.add(molespot02);
	panel.add(molespot03);
	panel.add(molespot04);
	panel.add(molespot05);
	panel.add(molespot06);
	panel.add(molespot07);
	panel.add(molespot08);
	panel.add(molespot09);
	panel.add(molespot10);
	panel.add(molespot11);
	panel.add(molespot12);
	panel.add(molespot13);
	panel.add(molespot14);
	panel.add(molespot15);
	panel.add(molespot16);
	panel.add(molespot17);
	panel.add(molespot18);
	panel.add(molespot19);
	panel.add(molespot20);
	panel.add(molespot21);
	panel.add(molespot22);
	panel.add(molespot23);
	panel.add(molespot24);
	frame.add(panel);
	molespot01.addActionListener(this);
	molespot02.addActionListener(this);
	molespot03.addActionListener(this);
	molespot04.addActionListener(this);
	molespot05.addActionListener(this);
	molespot06.addActionListener(this);
	molespot07.addActionListener(this);
	molespot08.addActionListener(this);
	molespot09.addActionListener(this);
	molespot10.addActionListener(this);
	molespot11.addActionListener(this);
	molespot12.addActionListener(this);
	molespot13.addActionListener(this);
	molespot14.addActionListener(this);
	molespot15.addActionListener(this);
	molespot16.addActionListener(this);
	molespot17.addActionListener(this);
	molespot18.addActionListener(this);
	molespot19.addActionListener(this);
	molespot20.addActionListener(this);
	molespot21.addActionListener(this);
	molespot22.addActionListener(this);
	molespot23.addActionListener(this);
	molespot24.addActionListener(this);
	
	frame.setVisible(true);
	panel.setSize(255,315);
	frame.setSize(255,315);
	chooseSpot();
	}
private void chooseSpot() {
	int number = 0;
	critMole=25;
	Random ran = new Random();
	number = ran.nextInt(24);
	if (number == 0) {
		molespot01.setText("Mole!");
		critMole=0;
	} else if (number == 1) {
		molespot02.setText("Mole!");
		critMole=1;
	} else if (number == 2) {
		molespot03.setText("Mole!");
		critMole=2;
	} else if (number == 3) {
		molespot04.setText("Mole!");
		critMole=3;
	} else if (number == 4) {
		molespot05.setText("Mole!");
		critMole=4;
	} else if (number == 5) {
		molespot06.setText("Mole!");
		critMole=5;
	} else if (number == 6) {
		molespot07.setText("Mole!");
		critMole=6;
	} else if (number == 7) {
		molespot08.setText("Mole!");
		critMole=7;
	} else if (number == 8) {
		molespot09.setText("Mole!");
		critMole=8;
	} else if (number == 9) {
		molespot10.setText("Mole!");
		critMole=9;
	} else if (number == 10) {
		molespot11.setText("Mole!");
		critMole=10;
	} else if (number == 11) {
		molespot12.setText("Mole!");
		critMole=11;
	} else if (number == 12) {
		molespot13.setText("Mole!");
		critMole=12;
	} else if (number == 13) {
		molespot14.setText("Mole!");
		critMole=13;
	} else if (number == 14) {
		molespot15.setText("Mole!");
		critMole=14;
	} else if (number == 15) {
		molespot16.setText("Mole!");
		critMole=15;
	} else if (number == 16) {
		molespot17.setText("Mole!");
		critMole=16;
	} else if (number == 17) {
		molespot18.setText("Mole!");
		critMole=17;
	} else if (number == 18) {
		molespot18.setText("Mole!");
		critMole=18;
	} else if (number == 19) {
		molespot20.setText("Mole!");
		critMole=19;
	} else if (number == 20) {
		molespot21.setText("Mole!");
		critMole=20;
	} else if (number == 21) {
		molespot22.setText("Mole!");
		critMole=21;
	} else if (number == 22) {
		molespot23.setText("Mole!");
		critMole=22;
	} else if (number == 23) {
		molespot24.setText("Mole!");
		critMole=23;
	}
		
	}
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton molespot01 = new JButton();
	JButton molespot02 = new JButton();
	JButton molespot03 = new JButton();
	JButton molespot04 = new JButton();
	JButton molespot05 = new JButton();
	JButton molespot06 = new JButton();
	JButton molespot07 = new JButton();
	JButton molespot08 = new JButton();
	JButton molespot09 = new JButton();
	JButton molespot10 = new JButton();
	JButton molespot11 = new JButton();
	JButton molespot12 = new JButton();
	JButton molespot13 = new JButton();
	JButton molespot14 = new JButton();
	JButton molespot15 = new JButton();
	JButton molespot16 = new JButton();
	JButton molespot17 = new JButton();
	JButton molespot18 = new JButton();
	JButton molespot19 = new JButton();
	JButton molespot20 = new JButton();
	JButton molespot21 = new JButton();
	JButton molespot22 = new JButton();
	JButton molespot23 = new JButton();
	JButton molespot24 = new JButton();
	WhackAMole mrReseti = new WhackAMole(frame, panel, molespot01, molespot02, molespot03, molespot04, molespot05, molespot06, molespot07, molespot08, molespot09, molespot10, molespot11, molespot12, molespot13, molespot14, molespot15, molespot16, molespot17, molespot18, molespot19, molespot20, molespot21, molespot22, molespot23, molespot24);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(critMole==0) {
		if(e.getSource() == molespot01) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==1) {
		if(e.getSource() == molespot02) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==2) {
		if(e.getSource() == molespot03) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==3) {
		if(e.getSource() == molespot04) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==4) {
		if(e.getSource() == molespot05) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==5) {
		if(e.getSource() == molespot06) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==6) {
		if(e.getSource() == molespot07) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==7) {
		if(e.getSource() == molespot08) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==8) {
		if(e.getSource() == molespot09) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==9) {
		if(e.getSource() == molespot10) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==10) {
		if(e.getSource() == molespot11) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==11) {
		if(e.getSource() == molespot12) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==12) {
		if(e.getSource() == molespot13) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==13) {
		if(e.getSource() == molespot14) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==14) {
		if(e.getSource() == molespot15) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==15) {
		if(e.getSource() == molespot16) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==16) {
		if(e.getSource() == molespot17) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==17) {
		if(e.getSource() == molespot18) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==18) {
		if(e.getSource() == molespot19) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==19) {
		if(e.getSource() == molespot20) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==20) {
		if(e.getSource() == molespot21) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==21) {
		if(e.getSource() == molespot22) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==22) {
		if(e.getSource() == molespot23) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}else if(critMole==23) {
		if(e.getSource() == molespot24) {
			molespot01.setText("RIGHT");
			molespot02.setText("RIGHT");
			molespot03.setText("RIGHT");
			molespot04.setText("RIGHT");
			molespot05.setText("RIGHT");
			molespot06.setText("RIGHT");
			molespot07.setText("RIGHT");
			molespot08.setText("RIGHT");
			molespot09.setText("RIGHT");
			molespot10.setText("RIGHT");
			molespot11.setText("RIGHT");
			molespot12.setText("RIGHT");
			molespot13.setText("RIGHT");
			molespot14.setText("RIGHT");
			molespot15.setText("RIGHT");
			molespot16.setText("RIGHT");
			molespot17.setText("RIGHT");
			molespot18.setText("RIGHT");
			molespot19.setText("RIGHT");
			molespot20.setText("RIGHT");
			molespot21.setText("RIGHT");
			molespot22.setText("RIGHT");
			molespot23.setText("RIGHT");
			molespot24.setText("RIGHT");
		}else {
			molespot01.setText("WRONG");
			molespot02.setText("WRONG");
			molespot03.setText("WRONG");
			molespot04.setText("WRONG");
			molespot05.setText("WRONG");
			molespot06.setText("WRONG");
			molespot07.setText("WRONG");
			molespot08.setText("WRONG");
			molespot09.setText("WRONG");
			molespot10.setText("WRONG");
			molespot11.setText("WRONG");
			molespot12.setText("WRONG");
			molespot13.setText("WRONG");
			molespot14.setText("WRONG");
			molespot15.setText("WRONG");
			molespot16.setText("WRONG");
			molespot17.setText("WRONG");
			molespot18.setText("WRONG");
			molespot19.setText("WRONG");
			molespot20.setText("WRONG");
			molespot21.setText("WRONG");
			molespot22.setText("WRONG");
			molespot23.setText("WRONG");
			molespot24.setText("WRONG");
		}
	}
	
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
}
