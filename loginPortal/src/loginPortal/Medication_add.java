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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Medication_add {

	private JFrame frame;
	private JTextField textField_MEDID1;
	private JTextField textField_MEDID2;
	private JTextField textField_MEDID3;
	private JTextField textField_MED_ID;
	private JTable table;
	private JTextField textField_DESC1;
	private JTextField textField_DESC2;
	private JTextField textField_DESC3;
	private JTextField textField_QUANTI;
	private JTextField textField_QUANT2;
	private JTextField textField_QUANT3;
	private JTextField textField_NAME1;
	private JTextField textField_NAME2;
	private JTextField textField_NAME3;
	private JTextField textField_PR1;
	private JTextField textField_PR2;
	private JTextField textField_PR3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medication_add window = new Medication_add();
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
	public Medication_add() {
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
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		
		JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2","Column2", "Column4","Column5"}, 0));
		table.setBounds(86, 710, 1628, 340);
		frame.getContentPane().add(table);
		
		JLabel uhdlogo = new JLabel("");
		uhdlogo.setBounds(12, 13, 516, 253);
		frame.getContentPane().add(uhdlogo);
		uhdlogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hospitallogo = new JLabel("");
		hospitallogo.setBounds(1631, 13, 259, 253);
		frame.getContentPane().add(hospitallogo);
		hospitallogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		
		JLabel lblMedication = new JLabel("Enter Medication ID :");
		lblMedication.setForeground(new Color(0, 255, 0));
		lblMedication.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMedication.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMedication.setBounds(23, 412, 204, 16);
		frame.getContentPane().add(lblMedication);
		
		JLabel lblDescription = new JLabel("DESCRIPTION");
		lblDescription.setForeground(new Color(0, 0, 255));
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescription.setBounds(598, 412, 135, 16);
		frame.getContentPane().add(lblDescription);
		
		JLabel lblEnterQuantity = new JLabel("ENTER QUANTITY");
		lblEnterQuantity.setForeground(Color.BLUE);
		lblEnterQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterQuantity.setBounds(918, 412, 135, 16);
		frame.getContentPane().add(lblEnterQuantity);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		            		
		            	
		            		
		            		String sqlInsert = "INSERT INTO [dbo].[Medecation]([Id],[Name],[Descprition],[Quantity],[Price]) VALUES (?,?,?,?,?)";
		            		PreparedStatement sqlstatement = con.prepareStatement(sqlInsert);
		            		sqlstatement.setString(1, textField_MEDID1.getText());
		            		sqlstatement.setString(2, textField_NAME1.getText());
		            		sqlstatement.setString(3, textField_DESC1.getText());
		            		sqlstatement.setString(4, textField_QUANTI.getText());
		            		sqlstatement.setString(5, textField_PR1.getText());
		            		sqlstatement.executeUpdate();
		
		        	}
		        
				// Handle any errors that may have occurred.
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAdd.setForeground(Color.RED);
		btnAdd.setBackground(Color.BLACK);
		btnAdd.setBounds(1478, 436, 108, 25);
		frame.getContentPane().add(btnAdd);
		
		JLabel label_1 = new JLabel("Enter Medication ID :");
		label_1.setForeground(new Color(0, 255, 0));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(23, 492, 204, 16);
		frame.getContentPane().add(label_1);
		
		JButton button_2 = new JButton("ADD");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		            		
		            	
		            		
		            		String sqlInsert = "INSERT INTO [dbo].[Medecation]([Id],[Name],[Descprition],[Quantity],[Price]) VALUES (?,?,?,?,?)";
		            		PreparedStatement sqlstatement = con.prepareStatement(sqlInsert);
		            		sqlstatement.setString(1, textField_MEDID2.getText());
		            		sqlstatement.setString(2, textField_NAME2.getText());
		            		sqlstatement.setString(3, textField_DESC2.getText());
		            		sqlstatement.setString(4, textField_QUANTI.getText());
		            		sqlstatement.setString(5, textField_PR2.getText());
		            		sqlstatement.executeUpdate();
		
		        	}
		        
				// Handle any errors that may have occurred.
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(1478, 527, 108, 25);
		frame.getContentPane().add(button_2);
		
		JLabel label_3 = new JLabel("Enter Medication ID :");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(new Color(0, 255, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(23, 583, 204, 16);
		frame.getContentPane().add(label_3);
		
		JButton button_4 = new JButton("ADD");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		            		
		            	
		            		
		            		String sqlInsert = "INSERT INTO [dbo].[Medecation]([Id],[Name],[Descprition],[Quantity],[Price]) VALUES (?,?,?,?,?)";
		            		PreparedStatement sqlstatement = con.prepareStatement(sqlInsert);
		            		sqlstatement.setString(1, textField_MEDID3.getText());
		            		sqlstatement.setString(2, textField_NAME3.getText());
		            		sqlstatement.setString(3, textField_DESC3.getText());
		            		sqlstatement.setString(4, textField_QUANT3.getText());
		            		sqlstatement.setString(5, textField_PR3.getText());
		            		sqlstatement.executeUpdate();
		
		        	}
		        
				// Handle any errors that may have occurred.
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		button_4.setForeground(Color.RED);
		button_4.setBackground(Color.BLACK);
		button_4.setBounds(1478, 621, 108, 25);
		frame.getContentPane().add(button_4);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(0, 0, 255));
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(1603, 436, 108, 25);
		frame.getContentPane().add(btnClear);
		
		JButton button_5 = new JButton("CLEAR");
		button_5.setForeground(Color.BLUE);
		button_5.setBackground(Color.BLACK);
		button_5.setBounds(1603, 527, 108, 25);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("CLEAR");
		button_6.setForeground(Color.BLUE);
		button_6.setBackground(Color.BLACK);
		button_6.setBounds(1603, 621, 108, 25);
		frame.getContentPane().add(button_6);
		
		JLabel lblEnterPrescriptionId = new JLabel("Enter med ID :");
		lblEnterPrescriptionId.setForeground(new Color(255, 0, 0));
		lblEnterPrescriptionId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterPrescriptionId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterPrescriptionId.setBounds(1400, 681, 204, 16);
		frame.getContentPane().add(lblEnterPrescriptionId);
	
		JButton button_7 = new JButton("LOAD");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String get_DBString = ("SELECT * FROM Medecation WHERE Id = '"+textField_MED_ID.getText()+"'");
	                
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
	  			            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5)});
	  			            		
	  		            		}
	      
	  		        	}
	  		        
	  				// Handle any errors that may have occurred.
	  				catch (Exception e1) {
	  					e1.printStackTrace();
	  				}
			}
		});
		button_7.setForeground(new Color(0, 128, 128));
		button_7.setBackground(Color.BLACK);
		button_7.setBounds(1723, 678, 111, 25);
		frame.getContentPane().add(button_7);
		
		JButton btnUpdateCLEAR = new JButton("CLEAR");
		btnUpdateCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				model1.setRowCount(0);
			}
		});
		btnUpdateCLEAR.setForeground(Color.BLUE);
		btnUpdateCLEAR.setBackground(Color.BLACK);
		btnUpdateCLEAR.setBounds(1726, 758, 108, 25);
		frame.getContentPane().add(btnUpdateCLEAR);
		
		JButton btnDelete = new JButton("LOAD ALL");
		btnDelete.addActionListener(new ActionListener() {
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
				            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5)});
				            		
			            		}
	    
			        	}
			        
					// Handle any errors that may have occurred.
					catch (Exception e1) {
						e1.printStackTrace();
					}
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setBounds(1726, 716, 108, 25);
		frame.getContentPane().add(btnDelete);
		
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
		
		textField_MEDID1 = new JTextField();
		textField_MEDID1.setColumns(10);
		textField_MEDID1.setBounds(106, 441, 102, 22);
		frame.getContentPane().add(textField_MEDID1);
		
		textField_MEDID2 = new JTextField();
		textField_MEDID2.setColumns(10);
		textField_MEDID2.setBounds(106, 528, 102, 22);
		frame.getContentPane().add(textField_MEDID2);
		
		textField_MEDID3 = new JTextField();
		textField_MEDID3.setColumns(10);
		textField_MEDID3.setBounds(106, 622, 102, 22);
		frame.getContentPane().add(textField_MEDID3);
		
		textField_MED_ID = new JTextField();
		textField_MED_ID.setColumns(10);
		textField_MED_ID.setBounds(1609, 679, 102, 22);
		frame.getContentPane().add(textField_MED_ID);
		
		textField_DESC1 = new JTextField();
		textField_DESC1.setColumns(10);
		textField_DESC1.setBounds(511, 437, 339, 22);
		frame.getContentPane().add(textField_DESC1);
		
		textField_DESC2 = new JTextField();
		textField_DESC2.setColumns(10);
		textField_DESC2.setBounds(511, 528, 339, 22);
		frame.getContentPane().add(textField_DESC2);
		
		textField_DESC3 = new JTextField();
		textField_DESC3.setColumns(10);
		textField_DESC3.setBounds(511, 622, 339, 22);
		frame.getContentPane().add(textField_DESC3);
		
		textField_QUANTI = new JTextField();
		textField_QUANTI.setColumns(10);
		textField_QUANTI.setBounds(928, 437, 102, 22);
		frame.getContentPane().add(textField_QUANTI);
		
		textField_QUANT2 = new JTextField();
		textField_QUANT2.setColumns(10);
		textField_QUANT2.setBounds(928, 528, 102, 22);
		frame.getContentPane().add(textField_QUANT2);
		
		textField_QUANT3 = new JTextField();
		textField_QUANT3.setColumns(10);
		textField_QUANT3.setBounds(928, 618, 102, 22);
		frame.getContentPane().add(textField_QUANT3);
		
		JLabel lblEnterPrice = new JLabel("ENTER PRICE");
		lblEnterPrice.setForeground(Color.BLUE);
		lblEnterPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterPrice.setBounds(1186, 412, 135, 16);
		frame.getContentPane().add(lblEnterPrice);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(Color.BLUE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(327, 412, 135, 16);
		frame.getContentPane().add(lblName);
		
		textField_NAME1 = new JTextField();
		textField_NAME1.setColumns(10);
		textField_NAME1.setBounds(311, 437, 102, 22);
		frame.getContentPane().add(textField_NAME1);
		
		textField_NAME2 = new JTextField();
		textField_NAME2.setColumns(10);
		textField_NAME2.setBounds(311, 528, 102, 22);
		frame.getContentPane().add(textField_NAME2);
		
		textField_NAME3 = new JTextField();
		textField_NAME3.setColumns(10);
		textField_NAME3.setBounds(311, 622, 102, 22);
		frame.getContentPane().add(textField_NAME3);
		
		textField_PR1 = new JTextField();
		textField_PR1.setColumns(10);
		textField_PR1.setBounds(1185, 437, 102, 22);
		frame.getContentPane().add(textField_PR1);
		
		textField_PR2 = new JTextField();
		textField_PR2.setColumns(10);
		textField_PR2.setBounds(1185, 528, 102, 22);
		frame.getContentPane().add(textField_PR2);
		
		textField_PR3 = new JTextField();
		textField_PR3.setColumns(10);
		textField_PR3.setBounds(1185, 622, 102, 22);
		frame.getContentPane().add(textField_PR3);
	}

}
