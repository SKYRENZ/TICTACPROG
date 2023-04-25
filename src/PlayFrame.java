import java.awt.EventQueue;

import javax.swing.JFrame;


public class PlayFrame {

	 JFrame playFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayFrame window = new PlayFrame();
					window.playFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlayFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		playFrame = new JFrame();
		playFrame.setBounds(100, 100, 532, 421);
		playFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
