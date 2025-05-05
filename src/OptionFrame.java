import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OptionFrame {

	 JFrame optionFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionFrame window = new OptionFrame();
					window.optionFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OptionFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		optionFrame = new JFrame();
		optionFrame.setBounds(100, 100, 450, 300);
		optionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		optionFrame.getContentPane().setLayout(null);
		
		Label label = new Label("OPTION");
		label.setAlignment(Label.CENTER);
		label.setBounds(84, 10, 254, 44);
		optionFrame.getContentPane().add(label);
		
		Button button = new Button("BACK");
		button.setBackground(Color.LIGHT_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame mf = new MainFrame();
				mf.mainframe.setVisible(true);
				optionFrame.dispose();
				
			}
		});
		button.setFont(new Font("Castellar", Font.BOLD, 23));
		button.setBounds(340, 219, 84, 32);
		optionFrame.getContentPane().add(button);
	}
}
