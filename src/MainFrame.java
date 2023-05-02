import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainFrame {

	 JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 541, 435);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		Button button = new Button("PLAY");
		button.setBackground(Color.LIGHT_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TICTACPROG pf = new TICTACPROG();  /**yan*/
				pf.PLAYframe.setVisible(true);
				mainFrame.dispose();
				
			}
		});
		button.setBounds(191, 137, 150, 40);
		mainFrame.getContentPane().add(button);
		
		Button button_1 = new Button("MATCH HISTORY");
		button_1.setBounds(191, 196, 150, 40);
		mainFrame.getContentPane().add(button_1);
		
		Button button_2 = new Button("EXIT");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainFrame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(mainFrame, "Confirm you want to Exit", "Tic Tac Toe" , JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0); 
				}
			}
			});
		button_2.setBounds(191, 308, 150, 40);
		mainFrame.getContentPane().add(button_2);
		
		Button button_3 = new Button("OPTION");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OptionFrame opf = new OptionFrame();
				opf.optionFrame.setVisible(true);
				mainFrame.dispose();
				
			}
		});
		button_3.setBounds(191, 253, 150, 40);
		mainFrame.getContentPane().add(button_3);
	}

}
