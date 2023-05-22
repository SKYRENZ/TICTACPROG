import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class GAMEFRAMEBNW{

	 	JFrame GAMEframeBNW;
	    JButton btn1; // Declare the buttons at the class level
	    JButton btn2;
	    JButton btn3;
	    JButton btn4;
	    JButton btn5;
	    JButton btn6;
	    JButton btn7;
	    JButton btn8;
	    JButton btn9;
	    private JTextField xCount;
	    private JTextField oCount;
	    private int xCount1;
	    private int oCount1;
	    private String startGame = "X";
	    private int b1=10;
		private int b2=10;
		private int b3=10;
		private int b4=10;
		private int b5=10;
		private int b6=10;
		private int b7=10;
		private int b8=10;
		private int b9=10;
		private int i=0;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GAMEFRAMEBNW window = new GAMEFRAMEBNW();
					window.GAMEframeBNW.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GAMEFRAMEBNW() {
		initialize();
	}
	
	//alternate click for X and O//
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="O";
		}
		else {
			startGame="X";
		}
	}
	//alternate click for X and O//
	
	// for sql //
	public void resultx() {
		   
		String winner ="Player X Win";
		try {
	           Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con=DriverManager.getConnection
	                   ("jdbc:mysql://localhost:3306/test1","root","chocolates");
	           
	           String query = "INSERT INTO test1.testing ( winner) VALUES ( ?)";
	            PreparedStatement statement = con.prepareStatement(query );
	            statement.setString(1, winner);
	            statement.executeUpdate();
	            statement.close();
	            con.close();
	            System.out.println("Message stored in database: " + winner);
	       }
		
	       catch (Exception e) {}
	}
	public void resulto() {
		   
		String winner ="Player O Win";
		try {
	           Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection con=DriverManager.getConnection
	                   ("jdbc:mysql://localhost:3306/test1","root","chocolates");
	           
	           String query = "INSERT INTO test1.testing ( winner) VALUES ( ?)";
	            PreparedStatement statement = con.prepareStatement(query );
	            statement.setString(1, winner);
	            statement.executeUpdate();
	            statement.close();
	            con.close();
	            System.out.println("Message stored in database: " + winner);
	       }
		
	       catch (Exception e) {}
	}
	// for sql //
	
	//game logic//
	private void winningGame()
	{
		//for player X only //
		if(b1==1 && b2==1 && b3==1) {
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
			
		}
		else if(b4 == 1 && b5 == 1 && b6 == 1){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
		}
		else if(b7 == 1 && b8 == 1 && b9 == 1){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
		}
		else if(b1 == 1 && b4 == 1 && b7 == 1){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
		}
		else if(b2 == 1 && b5 == 1 && b8 == 1){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
		}
		else if(b3 == 1 && b6 == 1 && b9 == 1){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
		}
		else if(b1 == 1 && b5 == 1 && b9 == 1){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
		}
		else if(b3 == 1 && b5 == 1 && b7 == 1){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player X Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			resultx();
		}
		
		
		
		//for player O only//
		else if(b1==0 && b2==0 && b3==0) {
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if(b4 == 0 && b5 == 0 && b6 == 0){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if(b7 == 0 && b8 == 0 && b9 == 0){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if(b1 == 0 && b4 == 0 && b7 == 0){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if(b2 == 0 && b5 == 0 && b8 == 0){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if(b3 == 0 && b6 == 0 && b9 == 0){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if(b1 == 0 && b5 == 0 && b9 == 0){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if(b3 == 0 && b5 == 0 && b7 == 0){
			JOptionPane.showMessageDialog(GAMEframeBNW, "Player O Win!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			resulto();
		}
		else if( i == 9){
			JOptionPane.showMessageDialog(GAMEframeBNW, "No one wins!", " Tic tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}
		
		}
	//game logic//
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		GAMEframeBNW = new JFrame();
		GAMEframeBNW.setTitle("TIC-TAC-PROG");
		GAMEframeBNW.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\1.png"));
		GAMEframeBNW.setBounds(100, 100, 700, 650);
		GAMEframeBNW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GAMEframeBNW.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		GAMEframeBNW.setLocationRelativeTo(null);
		GAMEframeBNW.setResizable(false);
		
		JPanel MAINpanel = new JPanel();
		MAINpanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(128, 128, 128), new Color(0, 0, 0), new Color(128, 128, 128)));
		GAMEframeBNW.getContentPane().add(MAINpanel);
		MAINpanel.setLayout(new GridLayout(4, 3, 2, 2));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton BTNBACK = new JButton("BACK");
		BTNBACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame();
				mf.mainframe.setVisible(true);
				GAMEframeBNW.dispose();
			}
		});
		BTNBACK.setForeground(new Color(255, 255, 255));
		BTNBACK.setBackground(new Color(0, 0, 0));
		BTNBACK.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 35));
		panel.add(BTNBACK, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton BTNRESET = new JButton("RESET");
		BTNRESET.setBackground(new Color(255, 255, 255));
		BTNRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
				
			}
		});
		BTNRESET.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 35));
		panel_1.add(BTNRESET, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 0, 0));
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		panel_12.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		xCount = new JTextField();
		xCount.setText("0");
		xCount.setHorizontalAlignment(SwingConstants.CENTER);
		xCount.setBackground(new Color(255, 255, 255));
		panel_13.add(xCount, BorderLayout.CENTER);
		xCount.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER O");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		oCount = new JTextField();
		oCount.setForeground(new Color(255, 255, 255));
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		oCount.setText("0");
		oCount.setBackground(new Color(0, 0, 0));
		panel_15.add(oCount, BorderLayout.CENTER);
		oCount.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		btn1 = new JButton("");
		btn1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn1.setForeground(Color.BLACK);
					b1=1;
					i++;
				}
				else {
					btn1.setForeground(Color.GRAY);
					b1=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_3.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		btn2 = new JButton("");
		btn2.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn2.setForeground(Color.BLACK);
					b2=1;
					i++;
				}
				else {
					btn2.setForeground(Color.GRAY);
					b2=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_4.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		btn3 = new JButton("");
		btn3.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn3.setForeground(Color.BLACK);
					b3=1;
					i++;
				}
				else {
					btn3.setForeground(Color.GRAY);
					b3=0;
					i++;
				}
				choosePlayer();
				winningGame();
					}
				});
		panel_5.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		btn4 = new JButton("");
		btn4.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn4.setForeground(Color.BLACK);
					b4=1;
					i++;
				}
				else {
					btn4.setForeground(Color.GRAY);
					b4=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		btn5 = new JButton("");
		btn5.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn5.setForeground(Color.BLACK);
					b5=1;
					i++;
				}
				else {
					btn5.setForeground(Color.GRAY);
					b5=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		btn6 = new JButton("");
		btn6.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn6.setForeground(Color.BLACK);
					b6=1;
					i++;
				}
				else {
					btn6.setForeground(Color.GRAY);
					b6=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		btn7 = new JButton("");
		btn7.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn7.setForeground(Color.BLACK);
					b7=1;
					i++;
				}
				else {
					btn7.setForeground(Color.GRAY);
					b7=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_9.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		btn8 = new JButton("");
		btn8.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn8.setForeground(Color.BLACK);
					b8=1;
					i++;
				}
				else {
					btn8.setForeground(Color.GRAY);
					b8=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_10.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MAINpanel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		btn9 = new JButton("");
		btn9.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn9.setForeground(Color.BLACK);
					b9=1;
					i++;
				}
				else {
					btn9.setForeground(Color.GRAY);
					b9=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		panel_11.add(btn9, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		GAMEframeBNW.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("THEME");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("RED AND BLUE");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GAMEFRAME window = new GAMEFRAME();
				window.GAMEframe.setVisible(true);
				GAMEframeBNW.dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
	}

	}

