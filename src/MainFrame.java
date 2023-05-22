
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class MainFrame{

	public JFrame mainframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.mainframe.setVisible(true);
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
		mainframe = new JFrame();
		mainframe.setTitle("TIC-TAC-PROG");
		mainframe.setBounds(100, 100, 876, 571);
		mainframe.setLocationRelativeTo(null);
        mainframe.setResizable(false);
		mainframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\1.png"));
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(0, 255, 0));
		mainframe.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton playbutton = new JButton("");
		 playbutton.setBorderPainted(false);
		playbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GAMEFRAMEBNW gf = new GAMEFRAMEBNW();
				gf.GAMEframeBNW.setVisible(true);
				mainframe.dispose();
			}
		});
		playbutton.setForeground(new Color(128, 255, 0));
		playbutton.setBackground(new Color(0, 0, 0));
		playbutton.setIcon(new ImageIcon("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\2.png"));
		playbutton.setBounds(101, 159, 169, 74);
		panel.add(playbutton);
		
		JButton exitbutton = new JButton("");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframe = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(mainframe, "Confirm you want to Exit", "Tic Tac Toe" , JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		 exitbutton.setBorderPainted(false);
		exitbutton.setForeground(new Color(0, 255, 0));
		exitbutton.setBackground(new Color(0, 0, 0));
		exitbutton.setIcon(new ImageIcon("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\3.png"));
		exitbutton.setBounds(101, 408, 169, 80);
		panel.add(exitbutton);
		
		JButton historybutton = new JButton("");
		historybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		MatchHistoryFrame mh = new MatchHistoryFrame();
		mh.createAndShowGUI();
		mainframe.dispose();
			}
		});
		historybutton.setBackground(new Color(0, 0, 0));
		 historybutton.setBorderPainted(false);
		historybutton.setIcon(new ImageIcon("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\4.png"));
		historybutton.setBounds(101, 232, 169, 86);
		panel.add(historybutton);
		
		JButton aboutbutton = new JButton("");
		aboutbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ABOUTUS AU = new ABOUTUS();
				AU.aboutus.setVisible(true);
				mainframe.dispose();
					}
				
			}
		);
		 aboutbutton.setBorderPainted(false);
		aboutbutton.setIcon(new ImageIcon("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\5.png"));
		aboutbutton.setBackground(new Color(0, 0, 0));
		aboutbutton.setBounds(101, 318, 169, 88);
		panel.add(aboutbutton);
		
		JLabel grid = new JLabel("");
		grid.setIcon(new ImageIcon("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\7.png"));
		grid.setBounds(306, 105, 479, 398);
		panel.add(grid);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\6.png"));
		lblNewLabel.setBounds(317, -18, 468, 154);
		panel.add(lblNewLabel);
	}
}