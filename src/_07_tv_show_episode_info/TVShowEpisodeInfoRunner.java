package _07_tv_show_episode_info;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TVShowEpisodeInfoRunner {
	public static void main(String[] args) {
		JButton submit = new JButton();
		JTextField input = new JTextField();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		TVShowEpisodeInfoDisplayer t = new TVShowEpisodeInfoDisplayer(submit, input, frame, panel, panel2, panel3);
	}
}
