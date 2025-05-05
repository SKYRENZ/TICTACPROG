import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class GAMEFRAME {

    JFrame GAMEframe;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JTextField xCount, oCount;
    private int xCount1 = 0, oCount1 = 0;
    private String startGame = "X";
    private int b1 = 10, b2 = 10, b3 = 10, b4 = 10, b5 = 10, b6 = 10, b7 = 10, b8 = 10, b9 = 10;
    private int i = 0;

    // --- Database connection info ---
    private static final String URL = "jdbc:mysql://localhost:3306/test1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = ""; // <-- empty for default XAMPP

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                GAMEFRAME window = new GAMEFRAME();
                window.GAMEframe.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public GAMEFRAME() {
        initialize();
    }

    // Alternate click for X and O
    private void choosePlayer() {
        startGame = startGame.equalsIgnoreCase("X") ? "O" : "X";
    }

    // --- Save winner to database ---
	public void resultx() {
		DatabaseUtil.saveWinner("Player X Win");
	}
	public void resulto() {
		DatabaseUtil.saveWinner("Player O Win");
	}
    private void saveWinnerToDB(String winner) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "INSERT INTO testing (winner) VALUES (?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, winner);
            statement.executeUpdate();
            statement.close();
            con.close();
            System.out.println("Message stored in database: " + winner);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(GAMEframe, "DB Error: " + e.getMessage());
        }
    }

    // --- Game logic ---
    private void winningGame() {
        // Player X wins
        if ((b1 == 1 && b2 == 1 && b3 == 1) ||
            (b4 == 1 && b5 == 1 && b6 == 1) ||
            (b7 == 1 && b8 == 1 && b9 == 1) ||
            (b1 == 1 && b4 == 1 && b7 == 1) ||
            (b2 == 1 && b5 == 1 && b8 == 1) ||
            (b3 == 1 && b6 == 1 && b9 == 1) ||
            (b1 == 1 && b5 == 1 && b9 == 1) ||
            (b3 == 1 && b5 == 1 && b7 == 1)) {
            JOptionPane.showMessageDialog(GAMEframe, "Player X Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resultx();
            disableButtons();
        }
        // Player O wins
        else if ((b1 == 0 && b2 == 0 && b3 == 0) ||
                 (b4 == 0 && b5 == 0 && b6 == 0) ||
                 (b7 == 0 && b8 == 0 && b9 == 0) ||
                 (b1 == 0 && b4 == 0 && b7 == 0) ||
                 (b2 == 0 && b5 == 0 && b8 == 0) ||
                 (b3 == 0 && b6 == 0 && b9 == 0) ||
                 (b1 == 0 && b5 == 0 && b9 == 0) ||
                 (b3 == 0 && b5 == 0 && b7 == 0)) {
            JOptionPane.showMessageDialog(GAMEframe, "Player O Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resulto();
            disableButtons();
        }
        // Draw
        else if (i == 9) {
            JOptionPane.showMessageDialog(GAMEframe, "No one wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            disableButtons();
        }
    }

    private void disableButtons() {
        btn1.setEnabled(false); btn2.setEnabled(false); btn3.setEnabled(false);
        btn4.setEnabled(false); btn5.setEnabled(false); btn6.setEnabled(false);
        btn7.setEnabled(false); btn8.setEnabled(false); btn9.setEnabled(false);
    }

    private void resetGame() {
        btn1.setText(""); btn2.setText(""); btn3.setText("");
        btn4.setText(""); btn5.setText(""); btn6.setText("");
        btn7.setText(""); btn8.setText(""); btn9.setText("");
        btn1.setEnabled(true); btn2.setEnabled(true); btn3.setEnabled(true);
        btn4.setEnabled(true); btn5.setEnabled(true); btn6.setEnabled(true);
        btn7.setEnabled(true); btn8.setEnabled(true); btn9.setEnabled(true);
        b1 = b2 = b3 = b4 = b5 = b6 = b7 = b8 = b9 = 10;
        i = 0;
        startGame = "X";
    }

    public void initialize() {
        GAMEframe = new JFrame();
        GAMEframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\1.png"));
        GAMEframe.setTitle("TIC-TAC-PROG");
        GAMEframe.setBounds(100, 100, 700, 650);
        GAMEframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GAMEframe.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
        GAMEframe.setLocationRelativeTo(null);
        GAMEframe.setResizable(false);

        JPanel MAINpanel = new JPanel();
        MAINpanel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(128, 128, 128), new Color(0, 0, 0), new Color(128, 128, 128)));
        GAMEframe.getContentPane().add(MAINpanel);
        MAINpanel.setLayout(new GridLayout(4, 3, 2, 2));

        // --- BACK button ---
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(128, 64, 0), 2));
        MAINpanel.add(panel);
        panel.setLayout(new BorderLayout(0, 0));
        JButton BTNBACK = new JButton("BACK");
        BTNBACK.addActionListener(e -> {
            MainFrame mf = new MainFrame();
            mf.mainframe.setVisible(true);
            GAMEframe.dispose();
        });
        BTNBACK.setForeground(new Color(0, 255, 255));
        BTNBACK.setBackground(new Color(255, 128, 128));
        BTNBACK.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 35));
        panel.add(BTNBACK, BorderLayout.CENTER);

        // --- RESET button ---
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(128, 64, 0), 2));
        MAINpanel.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));
        JButton BTNRESET = new JButton("RESET");
        BTNRESET.setForeground(new Color(255, 0, 0));
        BTNRESET.setBackground(new Color(128, 255, 255));
        BTNRESET.addActionListener(e -> resetGame());
        BTNRESET.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 35));
        panel_1.add(BTNRESET, BorderLayout.CENTER);

        // --- Score panel ---
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(128, 64, 0), 2));
        MAINpanel.add(panel_2);
        panel_2.setLayout(new GridLayout(2, 2, 0, 0));

        JPanel panel_12 = new JPanel();
        panel_12.setBackground(new Color(255, 0, 0));
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_12);
        panel_12.setLayout(new BorderLayout(0, 0));
        JLabel lblNewLabel = new JLabel("PLAYER X");
        lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 17));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel_12.add(lblNewLabel, BorderLayout.CENTER);

        JPanel panel_13 = new JPanel();
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.add(panel_13);
        panel_13.setLayout(new BorderLayout(0, 0));
        xCount = new JTextField("0");
        xCount.setHorizontalAlignment(SwingConstants.CENTER);
        xCount.setBackground(new Color(255, 128, 128));
        panel_13.add(xCount, BorderLayout.CENTER);
        xCount.setColumns(10);

        JPanel panel_14 = new JPanel();
        panel_14.setBackground(new Color(0, 255, 255));
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
        oCount = new JTextField("0");
        oCount.setHorizontalAlignment(SwingConstants.CENTER);
        oCount.setBackground(new Color(128, 255, 255));
        panel_15.add(oCount, BorderLayout.CENTER);
        oCount.setColumns(10);

        // --- Game buttons ---
        btn1 = createGameButton(1); MAINpanel.add(wrapButton(btn1));
        btn2 = createGameButton(2); MAINpanel.add(wrapButton(btn2));
        btn3 = createGameButton(3); MAINpanel.add(wrapButton(btn3));
        btn4 = createGameButton(4); MAINpanel.add(wrapButton(btn4));
        btn5 = createGameButton(5); MAINpanel.add(wrapButton(btn5));
        btn6 = createGameButton(6); MAINpanel.add(wrapButton(btn6));
        btn7 = createGameButton(7); MAINpanel.add(wrapButton(btn7));
        btn8 = createGameButton(8); MAINpanel.add(wrapButton(btn8));
        btn9 = createGameButton(9); MAINpanel.add(wrapButton(btn9));
    }

    private JButton createGameButton(int btnNumber) {
        JButton btn = new JButton("");
        btn.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 70));
        btn.addActionListener(e -> {
            if (!btn.getText().equals("")) return;
            btn.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                btn.setForeground(Color.RED);
                setButtonValue(btnNumber, 1);
            } else {
                btn.setForeground(Color.BLUE);
                setButtonValue(btnNumber, 0);
            }
            i++;
            choosePlayer();
            winningGame();
        });
        return btn;
    }

    private JPanel wrapButton(JButton btn) {
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(128, 64, 0), 2));
        panel.setLayout(new BorderLayout(0, 0));
        panel.add(btn, BorderLayout.CENTER);
        return panel;
    }

    private void setButtonValue(int btnNumber, int value) {
        switch (btnNumber) {
            case 1: b1 = value; break;
            case 2: b2 = value; break;
            case 3: b3 = value; break;
            case 4: b4 = value; break;
            case 5: b5 = value; break;
            case 6: b6 = value; break;
            case 7: b7 = value; break;
            case 8: b8 = value; break;
            case 9: b9 = value; break;
        }
    }
}
