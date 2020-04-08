package loginPortal;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Patient_checkin {

	private JFrame frame;
	private JTextField textField_prID;
	private JTable table;
	private JTextField textField_13;
	private JTextField textField_patientid;
	private JTextField textField_MD;
	private JTextField textFieldsaff;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patient_checkin window = new Patient_checkin();
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
	public Patient_checkin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		
		
		JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2","Column2","Column2"}, 0));
		table.setBounds(232, 710, 1479, 293);
		frame.getContentPane().add(table);
		
		JLabel uhdlogo = new JLabel("");
		uhdlogo.setBounds(12, 13, 516, 253);
		frame.getContentPane().add(uhdlogo);
		uhdlogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hospitallogo = new JLabel("");
		hospitallogo.setBounds(1631, 13, 259, 253);
		frame.getContentPane().add(hospitallogo);
		hospitallogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		
		JLabel lblMedication = new JLabel("Enter Prescription ID :");
		lblMedication.setForeground(new Color(0, 0, 255));
		lblMedication.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMedication.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMedication.setBounds(169, 474, 204, 16);
		frame.getContentPane().add(lblMedication);
		
		textField_prID = new JTextField();
		textField_prID.setColumns(10);
		textField_prID.setBounds(245, 503, 103, 22);
		frame.getContentPane().add(textField_prID);
		
		JLabel lblDescription = new JLabel("Patient ID");
		lblDescription.setForeground(new Color(0, 0, 255));
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescription.setBounds(438, 474, 135, 16);
		frame.getContentPane().add(lblDescription);
		
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
		            		
		            	
		            		
		            		String sqlInsert = "INSERT INTO [dbo].[Prescrition]([Id],[Patient_id] ,[medication_id] ,[staff_id]) VALUES (?,?,?,?)";
		            		PreparedStatement sqlstatement = con.prepareStatement(sqlInsert);
		            		sqlstatement.setString(1, textField_prID.getText());
		            		sqlstatement.setString(2, textField_patientid.getText());
		            		sqlstatement.setString(3, textField_MD.getText());
		            		sqlstatement.setString(4, textFieldsaff.getText());
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
		btnAdd.setBounds(811, 502, 108, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(0, 0, 255));
		btnClear.setBackground(Color.BLACK);
		btnClear.setBounds(950, 502, 108, 25);
		frame.getContentPane().add(btnClear);
		
	
		
		JLabel lblEnterPrescriptionId = new JLabel("Enter Prescription ID :");
		lblEnterPrescriptionId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterPrescriptionId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterPrescriptionId.setBounds(1400, 681, 204, 16);
		frame.getContentPane().add(lblEnterPrescriptionId);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(1608, 678, 103, 22);
		frame.getContentPane().add(textField_13);
		
		JButton button_7 = new JButton("LOAD");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  get_DBString = ("SELECT * FROM Prescrition");

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
				            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)});
				            		
			            		}
	    
			        	}
			        
					// Handle any errors that may have occurred.
					catch (Exception e1) {
						e1.printStackTrace();
					}
			}
		});
		button_7.setForeground(Color.GREEN);
		button_7.setBackground(Color.BLACK);
		button_7.setBounds(1723, 678, 111, 25);
		frame.getContentPane().add(button_7);
		
		JButton btnclear = new JButton("CLEAR");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				model1.setRowCount(0);
			}
		});
		btnclear.setForeground(Color.BLUE);
		btnclear.setBackground(Color.BLACK);
		btnclear.setBounds(1726, 716, 108, 25);
		frame.getContentPane().add(btnclear);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.RED);
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setBounds(1726, 754, 108, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton exitbutton = new JButton("");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		exitbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBackground(new Color(70, 130, 180));
		exitbutton.setBounds(1778, 853, 112, 150);
		frame.getContentPane().add(exitbutton);
		exitbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/exitpic.png"));
		
		textField_patientid = new JTextField();
		textField_patientid.setColumns(10);
		textField_patientid.setBounds(426, 503, 103, 22);
		frame.getContentPane().add(textField_patientid);
		
		JLabel lblMedicationId = new JLabel("Medication ID");
		lblMedicationId.setForeground(Color.BLUE);
		lblMedicationId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMedicationId.setBounds(574, 474, 135, 16);
		frame.getContentPane().add(lblMedicationId);
		
		textField_MD = new JTextField();
		textField_MD.setColumns(10);
		textField_MD.setBounds(572, 503, 103, 22);
		frame.getContentPane().add(textField_MD);
		
		textFieldsaff = new JTextField();
		textFieldsaff.setColumns(10);
		textFieldsaff.setBounds(696, 503, 103, 22);
		frame.getContentPane().add(textFieldsaff);
		
		JLabel lblStaffId = new JLabel("Staff ID");
		lblStaffId.setForeground(Color.BLUE);
		lblStaffId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStaffId.setBounds(689, 475, 135, 16);
		frame.getContentPane().add(lblStaffId);
	}
}
