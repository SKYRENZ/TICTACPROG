import java.awt.EventQueue;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Label;
import java.awt.Button;
import java.awt.Font;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class ABOUTUS{

	 JFrame aboutus;
	 JLabel label;
	 private JTextField txtListangcoMarkLaurenz;
	 private JTextField txtEstremaduraRashlyR;
	 private JTextField txtUiDesigner;
	 private JTextField txtMainDeveloper;
	 private JTextField txtDatabaseDeveloper;
	 private JTextField txtMirandaKarlMatthew;
	 private JTextField txtCabreros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABOUTUS window = new ABOUTUS();
					window.aboutus.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ABOUTUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		aboutus = new JFrame();
		aboutus.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\1.png"));
		aboutus.getContentPane().setBackground(new Color(128, 255, 0));
		aboutus.setSize(541, 435);
		aboutus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aboutus.getContentPane().setLayout(null);
		aboutus.setTitle("TIC-TAC-PROG");
		aboutus.setResizable(false);
		aboutus.setLocationRelativeTo(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_6.setBounds(412, 354, 84, 32);
		aboutus.getContentPane().add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		Button BACKBTN = new Button("BACK");
		BACKBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainFrame mf = new MainFrame();
				mf.mainframe.setVisible(true);
				aboutus.dispose();
			}
		});
		panel_6.add(BACKBTN, BorderLayout.CENTER);
		BACKBTN.setForeground(new Color(128, 255, 0));
		BACKBTN.setBackground(new Color(0, 0, 0));
		
		BACKBTN.setFont(new Font("Castellar", Font.BOLD, 23));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_5.setBounds(131, 83, 278, 44);
		aboutus.getContentPane().add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		Label DEVELOPER = new Label("DEVELOPERS");
		panel_5.add(DEVELOPER, BorderLayout.CENTER);
		DEVELOPER.setBackground(new Color(0, 0, 0));
		DEVELOPER.setForeground(new Color(128, 255, 0));
		DEVELOPER.setFont(new Font("Book Antiqua", Font.BOLD, 28));
		DEVELOPER.setAlignment(Label.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_4.setBounds(213, 196, 242, 32);
		aboutus.getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		txtMirandaKarlMatthew = new JTextField();
		txtMirandaKarlMatthew.setText("MIRANDA, KARL MATTHEW L");
		txtMirandaKarlMatthew.setHorizontalAlignment(SwingConstants.CENTER);
		txtMirandaKarlMatthew.setForeground(new Color(128, 255, 0));
		txtMirandaKarlMatthew.setFont(new Font("Century Gothic", Font.BOLD, 14));
		txtMirandaKarlMatthew.setColumns(10);
		txtMirandaKarlMatthew.setBackground(Color.BLACK);
		panel_4.add(txtMirandaKarlMatthew, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_3.setBounds(213, 151, 242, 32);
		aboutus.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		txtCabreros = new JTextField();
		txtCabreros.setText("CABREROS, JAMES VIENCENT M.");
		txtCabreros.setHorizontalAlignment(SwingConstants.CENTER);
		txtCabreros.setForeground(new Color(128, 255, 0));
		txtCabreros.setFont(new Font("Century Gothic", Font.BOLD, 14));
		txtCabreros.setColumns(10);
		txtCabreros.setBackground(Color.BLACK);
		panel_3.add(txtCabreros, BorderLayout.CENTER);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_2_2.setBounds(26, 311, 160, 32);
		aboutus.getContentPane().add(panel_2_2);
		panel_2_2.setLayout(new BorderLayout(0, 0));
		
		txtDatabaseDeveloper = new JTextField();
		txtDatabaseDeveloper.setText("DATABASE DEVELOPER");
		txtDatabaseDeveloper.setHorizontalAlignment(SwingConstants.CENTER);
		txtDatabaseDeveloper.setForeground(new Color(128, 255, 0));
		txtDatabaseDeveloper.setFont(new Font("Century Gothic", Font.BOLD, 14));
		txtDatabaseDeveloper.setColumns(10);
		txtDatabaseDeveloper.setBackground(Color.BLACK);
		panel_2_2.add(txtDatabaseDeveloper, BorderLayout.CENTER);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_2_1.setBounds(26, 250, 160, 32);
		aboutus.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		txtMainDeveloper = new JTextField();
		txtMainDeveloper.setText("MAIN DEVELOPER");
		txtMainDeveloper.setHorizontalAlignment(SwingConstants.CENTER);
		txtMainDeveloper.setForeground(new Color(128, 255, 0));
		txtMainDeveloper.setFont(new Font("Century Gothic", Font.BOLD, 15));
		txtMainDeveloper.setColumns(10);
		txtMainDeveloper.setBackground(Color.BLACK);
		panel_2_1.add(txtMainDeveloper, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_2.setBounds(26, 169, 160, 32);
		aboutus.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		txtUiDesigner = new JTextField();
		txtUiDesigner.setText("UI DESIGNER");
		txtUiDesigner.setHorizontalAlignment(SwingConstants.CENTER);
		txtUiDesigner.setForeground(new Color(128, 255, 0));
		txtUiDesigner.setFont(new Font("Century Gothic", Font.BOLD, 15));
		txtUiDesigner.setColumns(10);
		txtUiDesigner.setBackground(Color.BLACK);
		panel_2.add(txtUiDesigner, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel_1.setBounds(213, 311, 242, 32);
		aboutus.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		txtEstremaduraRashlyR = new JTextField();
		txtEstremaduraRashlyR.setText("ESTREMADURA, RASHLY R.");
		txtEstremaduraRashlyR.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstremaduraRashlyR.setForeground(new Color(128, 255, 0));
		txtEstremaduraRashlyR.setFont(new Font("Century Gothic", Font.BOLD, 14));
		txtEstremaduraRashlyR.setColumns(10);
		txtEstremaduraRashlyR.setBackground(Color.BLACK);
		panel_1.add(txtEstremaduraRashlyR);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 255, 0), new Color(128, 255, 0)));
		panel.setBounds(213, 250, 242, 32);
		aboutus.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtListangcoMarkLaurenz = new JTextField();
		txtListangcoMarkLaurenz.setFont(new Font("Century Gothic", Font.BOLD, 14));
		txtListangcoMarkLaurenz.setForeground(new Color(128, 255, 0));
		txtListangcoMarkLaurenz.setBackground(new Color(0, 0, 0));
		panel.add(txtListangcoMarkLaurenz, BorderLayout.CENTER);
		txtListangcoMarkLaurenz.setText("LISTANGCO, MARK LAURENZ R.");
		txtListangcoMarkLaurenz.setHorizontalAlignment(SwingConstants.CENTER);
		txtListangcoMarkLaurenz.setColumns(10);
		
		
		JLabel BACKGROUND = new JLabel("");
		BACKGROUND.setIcon(new ImageIcon("C:\\Users\\Renz\\Downloads\\ABOUTUSBG.png"));
		BACKGROUND.setBounds(0, 0, 525, 396);
		BACKGROUND.setBackground(Color.gray);
		BACKGROUND.setOpaque(true);
		aboutus.getContentPane().add(BACKGROUND);
		

      
	}
}