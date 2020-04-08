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

public class Prescpriton_reccord {

	private JFrame frame;
	private JTextField textField_prid;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prescpriton_reccord window = new Prescpriton_reccord();
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
	public Prescpriton_reccord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2","Column3", "Column4","Column5", "Column6","Column7", "Column8","Column7", "Column8"}, 0));
		table.setBounds(105, 461, 1628, 576);
		frame.getContentPane().add(table);
        
		
		JLabel uhdlogo = new JLabel("");
		uhdlogo.setBounds(12, 13, 516, 253);
		frame.getContentPane().add(uhdlogo);
		uhdlogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hospitallogo = new JLabel("");
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
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBackground(new Color(0, 128, 128));
		exitbutton.setBounds(1778, 853, 112, 150);
		frame.getContentPane().add(exitbutton);
		exitbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/exitpic.png"));
		
		JLabel lblSearchPatientBy = new JLabel("Search Prescription By ID :");
		lblSearchPatientBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchPatientBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchPatientBy.setBounds(34, 297, 204, 16);
		frame.getContentPane().add(lblSearchPatientBy);
		
		
		JButton btnFind = new JButton("SEARCH");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	  String get_DBString = ("SELECT Prescrition.Id,staff.First_Name,staff.Last_Name FROM Prescrition WHERE Id = '"+textField_prid.getText()+"'");
	                
				  String  get_DBString = ("SELECT  Prescrition.Id, client.First_Name, client.Last_Name, Medecation.Name, Medecation.Name, Medecation.Descprition, Medecation.Quantity, Medecation.Price, staff.First_Name, staff.Last_Name FROM Prescrition JOIN client ON Prescrition.Patient_id = client.Id  JOIN Medecation ON Prescrition.medication_id = Medecation.Id JOIN staff ON Prescrition.staff_id = staff.Id WHERE Prescrition.Id = '"+textField_prid.getText()+"';");
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
	  			            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10)});
	  			            		
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

		
		JButton btnLoadAllPatients = new JButton("Load All Prescriptions");
		btnLoadAllPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   String  get_DBString = ("SELECT  Prescrition.Id, client.First_Name, client.Last_Name, Medecation.Name, Medecation.Name, Medecation.Descprition, Medecation.Quantity, Medecation.Price, staff.First_Name, staff.Last_Name FROM Prescrition JOIN client ON Prescrition.Patient_id = client.Id  JOIN Medecation ON Prescrition.medication_id = Medecation.Id JOIN staff ON Prescrition.staff_id = staff.Id;");

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
					            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10)});
					            		
				            		}
		    
				        	}
				        
						// Handle any errors that may have occurred.
						catch (Exception e1) {
							e1.printStackTrace();
						}
			}
		});
		btnLoadAllPatients.setForeground(Color.BLUE);
		btnLoadAllPatients.setBackground(Color.BLACK);
		btnLoadAllPatients.setBounds(962, 294, 160, 25);
		frame.getContentPane().add(btnLoadAllPatients);
		
		JLabel lblStartDate = new JLabel("Start Date :");
		lblStartDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStartDate.setBounds(466, 339, 204, 16);
		frame.getContentPane().add(lblStartDate);
		
		
		JLabel lblPatientById = new JLabel("Patient First Name :");
		lblPatientById.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientById.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatientById.setBounds(34, 340, 204, 16);
		frame.getContentPane().add(lblPatientById);
		
		
		JButton button_1 = new JButton("FIND");
		button_1.setForeground(new Color(255, 0, 0));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(250, 407, 102, 25);
		frame.getContentPane().add(button_1);
		
		JLabel lblPatientLastName = new JLabel("Patient Last Name :");
		lblPatientLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatientLastName.setBounds(34, 378, 204, 16);
		frame.getContentPane().add(lblPatientLastName);
		
		JLabel lblEndDate = new JLabel("End Date :");
		lblEndDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndDate.setBounds(466, 375, 204, 16);
		frame.getContentPane().add(lblEndDate);
		
		
		JButton button_2 = new JButton("FIND");
		button_2.setForeground(Color.RED);
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(682, 407, 102, 25);
		frame.getContentPane().add(button_2);
		
		JLabel lblSearchPatientBy_1 = new JLabel("Search Prescription By Date :");
		lblSearchPatientBy_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchPatientBy_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchPatientBy_1.setBounds(466, 298, 204, 16);
		frame.getContentPane().add(lblSearchPatientBy_1);
		
		
		JButton button_3 = new JButton("SEARCH");
		button_3.setForeground(Color.GREEN);
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(796, 294, 102, 25);
		frame.getContentPane().add(button_3);
		
		textField_prid = new JTextField();
		textField_prid.setColumns(10);
		textField_prid.setBounds(250, 295, 102, 22);
		frame.getContentPane().add(textField_prid);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(250, 337, 102, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(250, 372, 102, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(682, 295, 102, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(682, 337, 102, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(682, 376, 102, 22);
		frame.getContentPane().add(textField_5);
		
		JButton buttonclear = new JButton("Clear");
		buttonclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				model1.setRowCount(0);
			}
		});
		buttonclear.setForeground(new Color(255, 0, 0));
		buttonclear.setBackground(Color.BLACK);
		buttonclear.setBounds(962, 336, 160, 25);
		frame.getContentPane().add(buttonclear);
		
	
	}

}
