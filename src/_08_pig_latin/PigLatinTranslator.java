package _08_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatinTranslator implements ActionListener {
    /**
     * Method to translate a english to pig latin.
     * 
     * @param s
     *            The sentence in English
     * @return The pig latin version
     */
	JButton translate;
	JButton translate2;
	JButton speak;
	JButton speak2;
	JTextField input;
	JTextField input2;
	JFrame frame;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	public PigLatinTranslator(JButton translate,JButton translate2,JButton speak,JButton speak2,JTextField input,JTextField input2,JFrame frame,JPanel panel,JPanel panel2,JPanel panel3,JPanel panel4,JPanel panel5) {
		this.translate = translate;
		this.translate2 = translate2;
		this.speak = speak;
		this.speak2 = speak2;
		this.input = input;
		this.input2 = input2;
		this.frame = frame;
		this.panel = panel;
		this.panel2 = panel2;
		this.panel3 = panel3;
		this.panel4 = panel4;
		this.panel5 = panel5;
		panel.add(speak2);
		panel.add(input);
		panel2.add(translate);
		panel2.add(translate2);
		panel3.add(input2);
		panel4.add(speak);
		panel5.add(panel);
		panel5.add(panel2);
		panel5.add(panel3);
		panel5.add(panel4);
		frame.add(panel5);
		frame.setVisible(true);
		translate.setText(">>");
		translate2.setText("<<");
		speak.setText("Speak");
		speak2.setText("Speak");
		translate.addActionListener(this);
		translate2.addActionListener(this);
		speak.addActionListener(this);
		speak2.addActionListener(this);
		panel3.setSize(585,75);
		frame.setSize(585,75);
		input.setPreferredSize(new Dimension(100,25));
		input2.setPreferredSize(new Dimension(100,25));
		
	}
	public static void main(String[] args) {
		JButton translate = new JButton();
		JButton translate2 = new JButton();
		JButton speak = new JButton();
		JButton speak2 = new JButton();
		JTextField input = new JTextField();
		JTextField input2 = new JTextField();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		PigLatinTranslator hogLanguage = new PigLatinTranslator(translate,translate2,speak,speak2,input,input2,frame,panel,panel2,panel3,panel4,panel5);
	}
    public static String translateEnglishToPigLatin(String s) {
        String latin = "";
        int i = 0;
        while (i < s.length()) {
            // Take care of punctuation and spaces
            while (i < s.length() && !isLetter(s.charAt(i))) {
                latin = latin + s.charAt(i);
                i++;
            }
            // If there aren't any words left, stop.
            if (i >= s.length())
                break;
            // Otherwise we're at the beginning of a word.
            int begin = i;
            while (i < s.length() && isLetter(s.charAt(i))) {
                i++;
            }
            // Now we're at the end of a word, so translate it.
            int end = i;
            latin = latin + pigWord(s.substring(begin, end));
        }
        return latin;
    }
    
    /**
     * Method to translate a pig latin to english.
     * 
     * @param s
     *            The sentence in pig latin
     * @return The english version
     */
    public static String translatePigLatinToEnglish(String s) {
        String english = "";
        
        String[] words = s.split(" ");
        
        for( String word : words ) {
            String[] hyphenSplit = word.split("-");
            String translatedWord = word;
            String punctuation = "";
            
            if( hyphenSplit.length == 2 ) {
                if( hyphenSplit[1].startsWith("ay")) {
                    // Started with a vowel
                    
                    translatedWord = hyphenSplit[0];
                } else {
                    // Started with a consonant
                    
                    translatedWord = hyphenSplit[1].substring(0, firstVowel(hyphenSplit[1])) + hyphenSplit[0];
                }
                
                // Handle punctuation at the end of a word
                int lastLetterIndex = hyphenSplit[1].length() - 1;
                
                while( !Character.isLetter(hyphenSplit[1].charAt(lastLetterIndex)) ){
                    lastLetterIndex -= 1;
                }
                
                punctuation = hyphenSplit[1].substring(lastLetterIndex + 1);
            }
            
            // Add word
            if( english.isEmpty() ) {
                english += translatedWord + punctuation;
            } else {
                english = english + " " + translatedWord + punctuation;
            }
        }
        
        return english;
    }
    
    
    /**
     * Method to test whether a character is a letter or not.
     * 
     * @param c
     *            The character to test
     * @return True if it's a letter
     */
    private static boolean isLetter(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    /**
     * Method to translate one word into pig latin.
     * 
     * @param word
     *            The word in english
     * @return The pig latin version
     */
    private static String pigWord(String word) {
        int split = firstVowel(word);
        return word.substring(split) + "-" + word.substring(0, split) + "ay";
    }

    /**
     * Method to find the index of the first vowel in a word.
     * 
     * @param word
     *            The word to search
     * @return The index of the first vowel
     */
    private static int firstVowel(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u')
                return i;
        return 0;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(e.getSource() == translate) {
			input2.setText(translateEnglishToPigLatin("" + this.input.getText()));
	    } else if(e.getSource() == translate2) {
	    	input.setText(translatePigLatinToEnglish("" + this.input2.getText()));
	    } else if(e.getSource() == speak) {
	    	Sound.speak("" + this.input2.getText());
	    } else if(e.getSource() == speak2) {
	    	Sound.speak("" + this.input.getText());
		
	}
}
}