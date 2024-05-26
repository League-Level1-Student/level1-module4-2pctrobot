package _02_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import game_tools.Sound;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton firstButton2;
	private JButton firstButton3;
	private JButton firstButton4;
	private JButton firstButton5;
	private JButton secondButton;
	private JButton secondButton2;
	private JButton secondButton3;
	private JButton secondButton4;
	private JButton secondButton5;
	private JButton thirdButton;
	private JButton thirdButton2;
	private JButton thirdButton3;
	private JButton thirdButton4;
	private JButton thirdButton5;
	private JButton fourthButton;
	private JButton fourthButton2;
	private JButton fourthButton3;
	private JButton fourthButton4;
	private JButton fourthButton5;
	private JButton fifthButton;
	private JButton fifthButton2;
	private JButton fifthButton3;
	private JButton fifthButton4;
	private JButton fifthButton5;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private Sound jeopardyThemeClip;



	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel header = createHeader("Risk Of Rain 2 Survivors");
		JPanel header2 = createHeader("Risk Of Rain 2 Enviroments");
		JPanel header3 = createHeader("Risk Of Rain 2 Hidden Realms");
		JPanel header4 = createHeader("Risk Of Rain 2 Items");
		JPanel header5 = createHeader("Risk Of Rain 2 Enemies");
		// 4. Add the header component to the quizPanel
		quizPanel.add(header);
		quizPanel.add(header2);
		quizPanel.add(header3);
		quizPanel.add(header4);
		quizPanel.add(header5);
//		frame.add(header);
//		frame.add(header3);
//		frame.add(header2);
//		frame.add(header4);
//		frame.add(header5);
		
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		
		// 7. Add the firstButton to the quizPanel
		
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		
		// 10. Add the secondButton to the quizPanel
		firstButton = createButton("$200");
		quizPanel.add(firstButton);
		firstButton2 = createButton("$200");
		quizPanel.add(firstButton2);
		firstButton3 = createButton("$200");
		quizPanel.add(firstButton3);
		firstButton4 = createButton("$200");
		quizPanel.add(firstButton4);
		firstButton5 = createButton("$200");
		quizPanel.add(firstButton5);
		secondButton = createButton("$400");
		quizPanel.add(secondButton);
		secondButton2 = createButton("$400");
		quizPanel.add(secondButton2);
		secondButton3 = createButton("$400");
		quizPanel.add(secondButton3);
		secondButton4 = createButton("$400");
		quizPanel.add(secondButton4);
		secondButton5 = createButton("$400");
		quizPanel.add(secondButton5);
		thirdButton = createButton("$600");
		quizPanel.add(thirdButton);
		thirdButton2 = createButton("$600");
		quizPanel.add(thirdButton2);
		thirdButton3 = createButton("$600");
		quizPanel.add(thirdButton3);
		thirdButton4 = createButton("$600");
		quizPanel.add(thirdButton4);
		thirdButton5 = createButton("$600");
		quizPanel.add(thirdButton5);
		fourthButton = createButton("$800");
		quizPanel.add(fourthButton);
		fourthButton2 = createButton("$800");
		quizPanel.add(fourthButton2);
		fourthButton3 = createButton("$800");
		quizPanel.add(fourthButton3);
		fourthButton4 = createButton("$800");
		quizPanel.add(fourthButton4);
		fourthButton5 = createButton("$800");
		quizPanel.add(fourthButton5);
		fifthButton = createButton("$1000");
		quizPanel.add(fifthButton);
		fifthButton2 = createButton("$1000");
		quizPanel.add(fifthButton2);
		fifthButton3 = createButton("$1000");
		quizPanel.add(fifthButton3);
		fifthButton4 = createButton("$1000");
		quizPanel.add(fifthButton4);
		fifthButton5 = createButton("$1000");
		quizPanel.add(fifthButton5);
		
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		firstButton2.addActionListener(this);
		firstButton3.addActionListener(this);
		firstButton4.addActionListener(this);
		firstButton5.addActionListener(this);
		secondButton.addActionListener(this);
		secondButton2.addActionListener(this);
		secondButton3.addActionListener(this);
		secondButton4.addActionListener(this);
		secondButton5.addActionListener(this);
		thirdButton.addActionListener(this);
		thirdButton2.addActionListener(this);
		thirdButton3.addActionListener(this);
		thirdButton4.addActionListener(this);
		thirdButton5.addActionListener(this);
		fourthButton.addActionListener(this);
		fourthButton2.addActionListener(this);
		fourthButton3.addActionListener(this);
		fourthButton4.addActionListener(this);
		fourthButton5.addActionListener(this);
		fifthButton.addActionListener(this);
		fifthButton2.addActionListener(this);
		fifthButton3.addActionListener(this);
		fifthButton4.addActionListener(this);
		fifthButton5.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(0, 5));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
		Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
		JButton money = new JButton();
		// Set the text of the button to the dollarAmount
		money.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount ++;
		// Return your new button instead of the temporary button
		
		return money;
	}

	@Override
    public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton

			// Call the askQuestion() method
 
		// Complete the code in the askQuestion() method. When you play the game, the score should change.

		// If the buttonPressed was the secondButton

			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)
		if(e.getSource() == firstButton) {
			askQuestion("What survivor has a special that disables almost all attacks for 5 seconds?", "Railgunner", 200);
			firstButton.setVisible(false);
	    } else if(e.getSource() == secondButton) {
	    	askQuestion("What survivor can obtain items and drones for free?", "Captain", 400);
	    	secondButton.setVisible(false);
	    } else if(e.getSource() == thirdButton) {
	    	askQuestion("What survivor deals velocity based damage?", "Loader", 600);
	    	thirdButton.setVisible(false);
	    } else if(e.getSource() == fourthButton) {
	    	askQuestion("What survivor has two unique debuffs?", "Acrid", 800);
	    	fourthButton.setVisible(false);
	    } else if(e.getSource() == fifthButton) {
	    	askQuestion("What survivor cannot be selected at the start of a run?", "Heretic", 1000);
	    	fifthButton.setVisible(false);
	    } else if(e.getSource() == firstButton2) {
			askQuestion("What enviroment has a boss you fight for a free Legendary item?", "Siren's Call", 200);
			firstButton2.setVisible(false);
	    } else if(e.getSource() == secondButton2) {
	    	askQuestion("What enviroment always comes every fifth level?", "Sky Meadow", 400);
	    	secondButton2.setVisible(false);
	    } else if(e.getSource() == thirdButton2) {
	    	askQuestion("What enviroment has a Timed Security Chest?", "Rallypoint Delta", 600);
	    	thirdButton2.setVisible(false);
	    } else if(e.getSource() == fourthButton2) {
	    	askQuestion("What enviroment has no chests?", "Commencement", 800);
	    	fourthButton2.setVisible(false);
	    } else if(e.getSource() == fifthButton2) {
	    	askQuestion("What enviroment has a Altar to N'Kuhana?", "Wetland Aspect", 1000);
	    	fifthButton2.setVisible(false);
	    } else if(e.getSource() == firstButton3) {
			askQuestion("What hidden realm is acessed via Newt Altar?", "Bazaar Between Time", 200);
			firstButton3.setVisible(false);
	    } else if(e.getSource() == secondButton3) {
	    	askQuestion("What hidden realm can grant Artifacts?", "Bulwark's Ambry", 400);
	    	secondButton3.setVisible(false);
	    } else if(e.getSource() == thirdButton3) {
	    	askQuestion("What hidden realm has an entrance within another hidden realm?", "Void Fields", 600);
	    	thirdButton3.setVisible(false);
	    } else if(e.getSource() == fourthButton3) {
	    	askQuestion("What hidden realm contains Aurelionite?", "Gilded Coast", 800);
	    	fourthButton3.setVisible(false);
	    } else if(e.getSource() == fifthButton3) {
	    	askQuestion("What hidden realm grants a ending without a boss fight?", "A Moment, Fractured", 1000);
	    	fifthButton3.setVisible(false);
	    } else if(e.getSource() == firstButton4) {
			askQuestion("What common item works as both a movement and attacks speed boosting item?", "Mocha", 200);
			firstButton4.setVisible(false);
	    } else if(e.getSource() == secondButton4) {
	    	askQuestion("What lunar item seems to do nothing... but..?", "Beads of Fealty", 400);
	    	secondButton4.setVisible(false);
	    } else if(e.getSource() == thirdButton4) {
	    	askQuestion("What green item gives an extra jump?", "Hopoo Feather", 600);
	    	thirdButton4.setVisible(false);
	    } else if(e.getSource() == fourthButton4) {
	    	askQuestion("What red item permanently reduces the armor of hit enemies?", "Symbiotic Scorpion", 800);
	    	fourthButton4.setVisible(false);
	    } else if(e.getSource() == fifthButton4) {
	    	askQuestion("What yellow item makes bleeding enemies explode?", "Shatterspleen", 1000);
	    	fifthButton4.setVisible(false);
	    } else if(e.getSource() == firstButton5) {
			askQuestion("What special boss has the possibility of softlocking you if don't have enough damage?", "Kipkip the Gentle", 200);
			firstButton5.setVisible(false);
	    } else if(e.getSource() == secondButton5) {
	    	askQuestion("What enemy is technically three different enemies under the same name?", "Lunar Chimera", 400);
	    	secondButton5.setVisible(false);
	    } else if(e.getSource() == thirdButton5) {
	    	askQuestion("What enemy can split into two different enemies that can each split into four enemies total?", "Gup", 600);
	    	thirdButton5.setVisible(false);
	    } else if(e.getSource() == fourthButton5) {
	    	askQuestion("What family of enemies have insta kill, on death explosions?", "Void Family", 800);
	    	fourthButton5.setVisible(false);
	    } else if(e.getSource() == fifthButton5) {
	    	askQuestion("What enemy will flee in fear when approached?", "Hermit Crab", 1000);
	    	fifthButton5.setVisible(false);
	    }
	    

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		playJeopardyTheme();
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		String answer = JOptionPane.showInputDialog(question);
		
		// Stop the theme music when they have entered their response.
		stopJeopardyTheme();
		// If the answer is correct
		if(answer.equals(correctAnswer)) {
			score += prizeMoney;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			score -= prizeMoney;
			JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + correctAnswer + ".");
		}
			// Increase the score by the prizeMoney

			// Pop up a message to tell the user they were correct

		// Otherwise

			// Decrement the score by the prizeMoney

			// Pop up a message to tell the user they were wrong and give them the correct answer

		// Call the updateScore() method
		updateScore();
	}

	public void playJeopardyTheme() {
		String fileName = "_02_jeopardy/jeopardy.wav";
		jeopardyThemeClip = new Sound(fileName);
		jeopardyThemeClip.play();
	}

	public void stopJeopardyTheme() {
		jeopardyThemeClip.stop();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
