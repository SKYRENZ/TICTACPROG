import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.EtchedBorder;
import java.awt.Button;
import java.awt.Font;
import java.awt.Toolkit;

public class MatchHistoryFrame {
    private static final String URL = "jdbc:mysql://localhost:3306/test1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "chocolates";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private JFrame historyframe;
    private JTable table;
    private DefaultTableModel tableModel;
    private JPanel panel;

    public static void main(String[] args) {
        MatchHistoryFrame historyFrame = new MatchHistoryFrame();
        historyFrame.createAndShowGUI();
    }

    public void createAndShowGUI() {
        // Create the JFrame and initialize the table model
        historyframe = new JFrame();
        historyframe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Renz\\Downloads\\finalicon\\IP(Icon)\\1.png"));
        historyframe.setTitle("TIC-TAC-PROG");
        historyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        historyframe.setBounds(50, 50, 400, 800);

        // Create a DefaultTableModel to hold the data
        tableModel = new DefaultTableModel();

        // Create the JTable with the table model
        table = new JTable(tableModel);
        table.setForeground(new Color(128, 255, 0));
        table.setBackground(new Color(0, 0, 0));

        // Customize the table header renderer
        JTableHeader header = table.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setForeground(Color.BLACK);
                setBackground(Color.GREEN);
                return this;
            }
        });
        historyframe.getContentPane().setLayout(null);

        // Add the JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 0, 384, 402);
        historyframe.getContentPane().add(scrollPane);
        
        panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(128, 255, 0), new Color(128, 255, 0)));
        panel.setBounds(290, 718, 84, 32);
        historyframe.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));
        
        Button BACKBTN = new Button("BACK");
        BACKBTN.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {

				MainFrame mf = new MainFrame();
				mf.mainframe.setVisible(true);
				historyframe.dispose();
        	}
        });
        BACKBTN.setForeground(new Color(128, 255, 0));
        BACKBTN.setFont(new Font("Castellar", Font.BOLD, 23));
        BACKBTN.setBackground(Color.BLACK);
        panel.add(BACKBTN, BorderLayout.CENTER);

        // Show the JFrame
        historyframe.setVisible(true);

        // Load and display the initial data in the JTable
        loadData();
    }

    public void loadData() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName(DRIVER);

            // Establish the connection
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Create a statement
            stmt = conn.createStatement();

            // Execute the query
            String query = "SELECT * FROM testing";
            rs = stmt.executeQuery(query);

            // Clear the table model
            tableModel.setRowCount(0);
            tableModel.setColumnCount(0);

            // Get the metadata of the ResultSet
            int columnCount = rs.getMetaData().getColumnCount();

            // Add the column names to the table model
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rs.getMetaData().getColumnName(i));
            }

            // Add the data rows to the table model
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteData() {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Load the JDBC driver
            Class.forName(DRIVER);

            // Establish the connection
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Create a statement
            stmt = conn.createStatement();

            // Execute the delete query
            String query = "DELETE FROM testing";
            stmt.executeUpdate(query);

            // Reload the data in the JTable
            loadData();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
