package loginPortal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Medication_list {

	private JFrame frame;
	private JTextField textField_id;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medication_list window = new Medication_list();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Medication_list() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2","Column2", "Column4","Column5"}, 0));
		table.setBounds(119, 461, 1628, 576);
		frame.getContentPane().add(table);
		
		
		JLabel uhdlogo = new JLabel("");
		uhdlogo.setBounds(12, 13, 516, 253);
		frame.getContentPane().add(uhdlogo);
		uhdlogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hospitallogo = new JLabel("");
		hospitallogo.setBackground(new Color(0, 0, 0));
		hospitallogo.setBounds(1649, 13, 259, 253);
		hospitallogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		frame.getContentPane().add(hospitallogo);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		
		JButton exitbutton = new JButton("");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		exitbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		exitbutton.setForeground(new Color(0, 0, 0));
		exitbutton.setBackground(new Color(0, 0, 0));
		exitbutton.setBounds(1778, 853, 112, 150);
		frame.getContentPane().add(exitbutton);
		exitbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/exitpic.png"));
		
		JLabel lblSearchPatientBy = new JLabel("Search Medication By ID :");
		lblSearchPatientBy.setForeground(new Color(255, 0, 0));
		lblSearchPatientBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchPatientBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchPatientBy.setBounds(12, 297, 204, 16);
		frame.getContentPane().add(lblSearchPatientBy);
		
		
		JButton btnFind = new JButton("SEARCH");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

String get_DBString = ("SELECT * FROM Medecation WHERE Id = '"+textField_id.getText()+"'");
                
                String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
  						"databaseName=UHD_PHARMACY;integratedSecurity=true;";

  				// Declare the JDBC objects.
  				Connection con = null;
  				Statement stmt = null;
  				ResultSet rs = null;
  				
  		        	try {
  		        		// Establish the connection.
  		        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
  		            		con = DriverManager.getConnection(connectionUrl);
  		            		stmt = con.createStatement();
  		            		rs = stmt.executeQuery(get_DBString);
  		            		
  		            		while (rs.next()) {
  		            			
  			            		DefaultTableModel model = (DefaultTableModel) table.getModel();
  			            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)});
  			            		
  		            		}
      
  		        	}
  		        
  				// Handle any errors that may have occurred.
  				catch (Exception e1) {
  					e1.printStackTrace();
  				}
				
			}
		});
		btnFind.setForeground(Color.GREEN);
		btnFind.setBackground(Color.BLACK);
		btnFind.setBounds(364, 294, 102, 25);
		frame.getContentPane().add(btnFind);
		
		
		JButton btnLoadAllMed = new JButton("Load All Medication");
		btnLoadAllMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  String  get_DBString = ("SELECT * FROM Medecation");

	              String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
							"databaseName=UHD_PHARMACY;integratedSecurity=true;";

					// Declare the JDBC objects.
					Connection con = null;
					Statement stmt = null;
					ResultSet rs = null;
					
			        	try {
			        		// Establish the connection.
			        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			            		con = DriverManager.getConnection(connectionUrl);
			            		stmt = con.createStatement();
			            		rs = stmt.executeQuery(get_DBString);
			            		
			            		while (rs.next()) {
			            			
				            		DefaultTableModel model = (DefaultTableModel) table.getModel();
				            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)});
				            		
			            		}
	    
			        	}
			        
					// Handle any errors that may have occurred.
					catch (Exception e1) {
						e1.printStackTrace();
					}

			}
		});
		btnLoadAllMed.setForeground(new Color(255, 0, 0));
		btnLoadAllMed.setBackground(Color.BLACK);
		btnLoadAllMed.setBounds(1067, 294, 160, 25);
		frame.getContentPane().add(btnLoadAllMed);
		
		JLabel lblStartDate = new JLabel("Start Date :");
		lblStartDate.setForeground(new Color(0, 0, 255));
		lblStartDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStartDate.setBounds(529, 346, 204, 16);
		frame.getContentPane().add(lblStartDate);
		
		
		JButton button_1 = new JButton("FIND");
		button_1.setForeground(new Color(255, 0, 0));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(222, 375, 102, 25);
		frame.getContentPane().add(button_1);
		
		JLabel lblEndDate = new JLabel("End Date :");
		lblEndDate.setForeground(new Color(0, 0, 255));
		lblEndDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndDate.setBounds(529, 378, 204, 16);
		frame.getContentPane().add(lblEndDate);
		
		
		JButton button_2 = new JButton("FIND");
		button_2.setForeground(new Color(0, 0, 255));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(743, 411, 102, 25);
		frame.getContentPane().add(button_2);
		
		JLabel lblSearchPatientBy_1 = new JLabel("Search Medication By Date  Added : ");
		lblSearchPatientBy_1.setForeground(new Color(0, 0, 255));
		lblSearchPatientBy_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchPatientBy_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchPatientBy_1.setBounds(466, 298, 269, 16);
		frame.getContentPane().add(lblSearchPatientBy_1);
		
		
		JButton button_3 = new JButton("SEARCH");
		button_3.setForeground(Color.GREEN);
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(857, 294, 102, 25);
		frame.getContentPane().add(button_3);
		
		JLabel lblSearchMedicationBy = new JLabel("Search Medication By Name :");
		lblSearchMedicationBy.setForeground(new Color(255, 0, 0));
		lblSearchMedicationBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchMedicationBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchMedicationBy.setBounds(12, 340, 204, 16);
		frame.getContentPane().add(lblSearchMedicationBy);
		
		textField_id = new JTextField();
		textField_id.setColumns(10);
		textField_id.setBounds(222, 295, 102, 22);
		frame.getContentPane().add(textField_id);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(222, 337, 102, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(743, 295, 102, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(743, 344, 102, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(743, 376, 102, 22);
		frame.getContentPane().add(textField_4);
		
		JButton btclear = new JButton("Clear Table");
		btclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				model1.setRowCount(0);
			}
		});
		btclear.setForeground(Color.BLUE);
		btclear.setBackground(Color.BLACK);
		btclear.setBounds(1760, 461, 160, 25);
		frame.getContentPane().add(btclear);
		
	}

}
