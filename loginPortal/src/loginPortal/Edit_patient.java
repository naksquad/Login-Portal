package loginPortal;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class Edit_patient {

	private JFrame frame;
	private JTextField textField_ID;
	private JTextField textField_family;
	private JTextField textField_1_FistNmae;
	private JTextField textField_adress1;
	private JTextField textField_4adress2;
	private JTextField textField_lastname;
	private JTextField textField_suffix;
	private JTextField textField_prefix;
	private JTextField textField_city;
	private JTextField textField_state;
	private JTextField textField_1phone;
	private JTextField textField_dob;
	private JTextField textField_cell;
	private JTextField textField_social;
	private JTextField textField_alergi;
	private JTextField textField_email;
	private JTextField textField_zip;
	private JTextField textField_work;
	private JTextField textField_middle_name;
	private JTextField textField_scanner;
	private JTextField textField_gender;
	private JTextField textField_dispense;
	private JTextField textField_password;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_patient window = new Edit_patient();
					window.frame.setVisible(true);
					//receptionist_windows.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Edit_patient() {
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
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JLabel uhdlogo = new JLabel("");
		uhdlogo.setBackground(new Color(100, 149, 237));
		uhdlogo.setBounds(22, 13, 516, 253);
		frame.getContentPane().add(uhdlogo);
		uhdlogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hospitallogo = new JLabel("");
		hospitallogo.setBackground(new Color(100, 149, 237));
		hospitallogo.setBounds(1631, 13, 259, 253);
		frame.getContentPane().add(hospitallogo);
		hospitallogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		
		JLabel lblNewLabel = new JLabel("ID : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 289, 108, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("First Name : ");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(49, 334, 108, 16);
		frame.getContentPane().add(lblLastName);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(141, 287, 308, 22);
		frame.getContentPane().add(textField_ID);
		textField_ID.setColumns(10);
		
		JLabel lblFamilly = new JLabel("Familly  :");
		lblFamilly.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFamilly.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFamilly.setBounds(22, 383, 108, 16);
		frame.getContentPane().add(lblFamilly);
		
		textField_family = new JTextField();
		textField_family.setColumns(10);
		textField_family.setBounds(141, 381, 496, 22);
		frame.getContentPane().add(textField_family);
		
		textField_1_FistNmae = new JTextField();
		textField_1_FistNmae.setColumns(10);
		textField_1_FistNmae.setBounds(141, 332, 308, 22);
		frame.getContentPane().add(textField_1_FistNmae);
		
		JLabel lblAddress = new JLabel("Address 1 :");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(22, 435, 108, 16);
		frame.getContentPane().add(lblAddress);
		
		textField_adress1 = new JTextField();
		textField_adress1.setColumns(10);
		textField_adress1.setBounds(141, 433, 496, 22);
		frame.getContentPane().add(textField_adress1);
		
		JLabel lblAddress_1 = new JLabel("Address 2 :");
		lblAddress_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress_1.setBounds(22, 477, 108, 16);
		frame.getContentPane().add(lblAddress_1);
		
		textField_4adress2 = new JTextField();
		textField_4adress2.setColumns(10);
		textField_4adress2.setBounds(141, 475, 496, 22);
		frame.getContentPane().add(textField_4adress2);
		
		JLabel lblMiddleName = new JLabel("Last Nane :");
		lblMiddleName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiddleName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMiddleName.setBounds(520, 334, 115, 16);
		frame.getContentPane().add(lblMiddleName);
		
		JButton btnScanId = new JButton("Scan ID");
		btnScanId.addActionListener(new ActionListener() {
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
		            		String the_master_id = null;
		            		String the_master_title = null;
		            		String SQL = ("SELECT * FROM client WHERE Id = '"+textField_ID+"'");
		            		stmt = con.createStatement();
		            		rs = stmt.executeQuery(SQL);
		            		//String saver = textField_ID.getText();
		            		while (rs.next()) {
		            			the_master_id = rs.getString(1);
		            						            		
		            		}
		            		
		           
		            		if (textField_ID.getText().equals(the_master_id)) {
		            			
		            			textField_scanner.setText("BAD");
		            		} else { textField_scanner.setText("GOOD");}

	            		
		        	}
		        
				// Handle any errors that may have occurred.
				catch (Exception e1) {
					e1.printStackTrace();
				}
		        
		        	
			}
		});
		btnScanId.setBounds(461, 286, 97, 25);
		frame.getContentPane().add(btnScanId);
		
		JLabel lblSuffix = new JLabel("Suffix :");
		lblSuffix.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSuffix.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSuffix.setBounds(580, 290, 57, 16);
		frame.getContentPane().add(lblSuffix);
		
		textField_lastname = new JTextField();
		textField_lastname.setColumns(10);
		textField_lastname.setBounds(647, 332, 308, 22);
		frame.getContentPane().add(textField_lastname);
		
		textField_suffix = new JTextField();
		textField_suffix.setColumns(10);
		textField_suffix.setBounds(647, 287, 154, 22);
		frame.getContentPane().add(textField_suffix);
		
		JLabel lblPrefix = new JLabel("Prefix :");
		lblPrefix.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrefix.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrefix.setBounds(813, 290, 57, 16);
		frame.getContentPane().add(lblPrefix);
		
		textField_prefix = new JTextField();
		textField_prefix.setColumns(10);
		textField_prefix.setBounds(882, 287, 154, 22);
		frame.getContentPane().add(textField_prefix);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCity.setBounds(22, 519, 108, 16);
		frame.getContentPane().add(lblCity);
		
		textField_city = new JTextField();
		textField_city.setColumns(10);
		textField_city.setBounds(141, 517, 308, 22);
		frame.getContentPane().add(textField_city);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblState.setBounds(397, 519, 108, 16);
		frame.getContentPane().add(lblState);
		
		textField_state = new JTextField();
		textField_state.setColumns(10);
		textField_state.setBounds(511, 517, 125, 22);
		frame.getContentPane().add(textField_state);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhone.setBounds(22, 564, 108, 16);
		frame.getContentPane().add(lblPhone);
		
		textField_1phone = new JTextField();
		textField_1phone.setColumns(10);
		textField_1phone.setBounds(141, 562, 154, 22);
		frame.getContentPane().add(textField_1phone);
		
		JLabel lblDob = new JLabel("DOB :");
		lblDob.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDob.setBounds(22, 604, 108, 16);
		frame.getContentPane().add(lblDob);
		
		textField_dob = new JTextField();
		textField_dob.setColumns(10);
		textField_dob.setBounds(141, 597, 154, 22);
		frame.getContentPane().add(textField_dob);
		
		JLabel lblCellPhone = new JLabel("Cell Phone :");
		lblCellPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCellPhone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCellPhone.setBounds(397, 565, 108, 16);
		frame.getContentPane().add(lblCellPhone);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(397, 605, 108, 16);
		frame.getContentPane().add(lblGender);
		
		textField_cell = new JTextField();
		textField_cell.setColumns(10);
		textField_cell.setBounds(512, 562, 125, 22);
		frame.getContentPane().add(textField_cell);
		
		JLabel lblDispenseBy = new JLabel("Dispense By :");
		lblDispenseBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDispenseBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDispenseBy.setBounds(22, 643, 108, 16);
		frame.getContentPane().add(lblDispenseBy);
		
		JLabel lblSocialSecurity = new JLabel("Social Security # :");
		lblSocialSecurity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSocialSecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSocialSecurity.setBounds(372, 644, 133, 16);
		frame.getContentPane().add(lblSocialSecurity);
		
		textField_social = new JTextField();
		textField_social.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textField_social.setColumns(10);
		textField_social.setBounds(512, 641, 125, 22);
		frame.getContentPane().add(textField_social);
		
		JLabel lblAllergies = new JLabel("Allergies :");
		lblAllergies.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAllergies.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAllergies.setBounds(22, 708, 108, 16);
		frame.getContentPane().add(lblAllergies);
		
		textField_alergi = new JTextField();
		textField_alergi.setColumns(10);
		textField_alergi.setBounds(141, 711, 496, 88);
		frame.getContentPane().add(textField_alergi);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(22, 841, 108, 16);
		frame.getContentPane().add(lblEmail);
		
		textField_email = new JTextField();
		textField_email.setColumns(10);
		textField_email.setBounds(141, 839, 308, 22);
		frame.getContentPane().add(textField_email);
		
		JButton btnNewButton = new JButton("Save & Exit");
		btnNewButton.addActionListener(new ActionListener() {
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
		            		String the_master_id = textField_ID.getText();
		            		String the_master_title = null;
		            		// String SQL = ("INSERT INTO client (Id) VALUES ('"+the_master_id+"'");
		            		// stmt = con.createStatement();
		            		// rs = stmt.executeQuery(SQL);
		            		//String saver = textField_ID.getText();
		            		
		            		String sqlInsert = "INSERT INTO [dbo].[client]([Id],[First_Name],[Last_Name],[Address],[City],[State],[zip],[Phone],[DOB],[Allergies],[Email],[SSN],[Gender],[Password]) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		            		PreparedStatement sqlstatement = con.prepareStatement(sqlInsert);
		            		sqlstatement.setString(1, textField_ID.getText());
		            		sqlstatement.setString(2, textField_1_FistNmae.getText());
		            		sqlstatement.setString(3, textField_lastname.getText());
		            		sqlstatement.setString(4, textField_adress1.getText());
		            		sqlstatement.setString(5, textField_city.getText());
		            		sqlstatement.setString(6, textField_state.getText());
		            		sqlstatement.setString(7, textField_zip.getText());
		            		sqlstatement.setString(8, textField_1phone.getText());
		            		sqlstatement.setString(9, textField_dob.getText());
		            		sqlstatement.setString(10, textField_alergi.getText());
		            		sqlstatement.setString(11, textField_email.getText());
		            		sqlstatement.setString(12, textField_social.getText());
		            		sqlstatement.setString(13, textField_gender.getText());
		            		sqlstatement.setString(14, textField_password.getText());
		            		sqlstatement.executeUpdate();
		
		        	}
		        
				// Handle any errors that may have occurred.
				catch (Exception e1) {
					e1.printStackTrace();
				}
		        	frame.dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(141, 976, 108, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(new Color(255, 0, 0));
		btnSave.setBackground(new Color(0, 0, 0));
		btnSave.setBounds(274, 976, 108, 38);
		frame.getContentPane().add(btnSave);
		
		JButton btnCpoy = new JButton("Copy");
		btnCpoy.setForeground(new Color(255, 0, 0));
		btnCpoy.setBackground(new Color(0, 0, 0));
		btnCpoy.setBounds(407, 976, 108, 38);
		frame.getContentPane().add(btnCpoy);
		
		JLabel lblZip = new JLabel("Zip :");
		lblZip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZip.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblZip.setBounds(671, 520, 108, 16);
		frame.getContentPane().add(lblZip);
		
		JLabel lblWorkPhone = new JLabel("Work Phone :");
		lblWorkPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWorkPhone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWorkPhone.setBounds(671, 565, 108, 16);
		frame.getContentPane().add(lblWorkPhone);
		
		textField_zip = new JTextField();
		textField_zip.setColumns(10);
		textField_zip.setBounds(791, 517, 125, 22);
		frame.getContentPane().add(textField_zip);
		
		textField_work = new JTextField();
		textField_work.setColumns(10);
		textField_work.setBounds(791, 562, 125, 22);
		frame.getContentPane().add(textField_work);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setForeground(new Color(0, 0, 255));
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.setBounds(529, 976, 108, 38);
		frame.getContentPane().add(btnUpdate);
		
		JButton exitbutton = new JButton("");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		exitbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBackground(new Color(0, 191, 255));
		exitbutton.setBounds(1778, 841, 112, 150);
		frame.getContentPane().add(exitbutton);
		exitbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/exitpic.png"));
		
		JLabel lblMiddleNane = new JLabel("Middle Nane :");
		lblMiddleNane.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiddleNane.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMiddleNane.setBounds(671, 383, 115, 16);
		frame.getContentPane().add(lblMiddleNane);
		
		textField_middle_name = new JTextField();
		textField_middle_name.setColumns(10);
		textField_middle_name.setBounds(791, 381, 125, 22);
		frame.getContentPane().add(textField_middle_name);
		
		textField_scanner = new JTextField();
		textField_scanner.setColumns(10);
		textField_scanner.setBounds(474, 315, 64, 22);
		frame.getContentPane().add(textField_scanner);
		
		textField_gender = new JTextField();
		textField_gender.setColumns(10);
		textField_gender.setBounds(512, 602, 64, 22);
		frame.getContentPane().add(textField_gender);
		
		textField_dispense = new JTextField();
		textField_dispense.setColumns(10);
		textField_dispense.setBounds(141, 641, 154, 22);
		frame.getContentPane().add(textField_dispense);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(22, 903, 108, 16);
		frame.getContentPane().add(lblPassword);
		
		textField_password = new JTextField();
		textField_password.setColumns(10);
		textField_password.setBounds(141, 901, 154, 22);
		frame.getContentPane().add(textField_password);
	}
}
