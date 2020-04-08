package loginPortal;

import java.awt.Color;
import java.awt.Cursor;
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

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class My_profile_edit {

	private JFrame frame;
	private JTextField adress;
	private JTextField textField_4;
	private JTextField textField_city;
	private JTextField textField_state;
	private JTextField textField_phone;
	private JTextField textField_12;
	private JTextField textField_alergy;
	private JTextField textField_email;
	private JTextField textField_zip;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String user_id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_profile_edit window = new My_profile_edit(user_id);
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
	public My_profile_edit(String user_id) {
		initialize(user_id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String user_id) {
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
		uhdlogo.setBounds(12, 13, 516, 253);
		frame.getContentPane().add(uhdlogo);
		uhdlogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hospitallogo = new JLabel("");
		hospitallogo.setBackground(new Color(100, 149, 237));
		hospitallogo.setBounds(1631, 13, 259, 253);
		frame.getContentPane().add(hospitallogo);
		hospitallogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		
		JLabel lblNewLabelid = new JLabel("ID : ");
		lblNewLabelid.setForeground(new Color(255, 0, 0));
		lblNewLabelid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabelid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelid.setBounds(22, 289, 108, 16);
		frame.getContentPane().add(lblNewLabelid);
		
		JLabel lblLastName = new JLabel("First Name : ");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(49, 334, 108, 16);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address 1 :");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(22, 435, 108, 16);
		frame.getContentPane().add(lblAddress);
		
		adress = new JTextField();
		adress.setColumns(10);
		adress.setBounds(141, 433, 496, 22);
		frame.getContentPane().add(adress);
		
		JLabel lblAddress_1 = new JLabel("Address 2 :");
		lblAddress_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress_1.setBounds(22, 477, 108, 16);
		frame.getContentPane().add(lblAddress_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 475, 496, 22);
		frame.getContentPane().add(textField_4);
		
		JLabel lblMiddleName = new JLabel("Last Nane :");
		lblMiddleName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiddleName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMiddleName.setBounds(397, 334, 115, 16);
		frame.getContentPane().add(lblMiddleName);
		
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
		
		textField_phone = new JTextField();
		textField_phone.setColumns(10);
		textField_phone.setBounds(141, 562, 154, 22);
		frame.getContentPane().add(textField_phone);
		
		JLabel lblDob = new JLabel("DOB :");
		lblDob.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDob.setBounds(22, 604, 108, 16);
		frame.getContentPane().add(lblDob);
		
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
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(512, 562, 125, 22);
		frame.getContentPane().add(textField_12);
		
		JLabel lblSocialSecurity = new JLabel("Social Security # :");
		lblSocialSecurity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSocialSecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSocialSecurity.setBounds(0, 644, 133, 16);
		frame.getContentPane().add(lblSocialSecurity);
		
		JLabel lblAllergies = new JLabel("Allergies :");
		lblAllergies.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAllergies.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAllergies.setBounds(22, 708, 108, 16);
		frame.getContentPane().add(lblAllergies);
		
		textField_alergy = new JTextField();
		textField_alergy.setColumns(10);
		textField_alergy.setBounds(141, 711, 496, 88);
		frame.getContentPane().add(textField_alergy);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(22, 841, 108, 16);
		frame.getContentPane().add(lblEmail);
		
		textField_email = new JTextField();
		textField_email.setColumns(10);
		textField_email.setBounds(141, 839, 308, 22);
		frame.getContentPane().add(textField_email);
		
		JButton btnCpoy = new JButton("Clear");
		btnCpoy.setForeground(new Color(255, 0, 0));
		btnCpoy.setBackground(new Color(0, 0, 0));
		btnCpoy.setBounds(141, 900, 108, 38);
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
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(791, 562, 125, 22);
		frame.getContentPane().add(textField_18);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setForeground(new Color(0, 0, 255));
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.setBounds(286, 900, 108, 38);
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
		
		JLabel lblNewLabel_id = new JLabel("New label");
		lblNewLabel_id.setForeground(new Color(0, 0, 255));
		lblNewLabel_id.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_id.setBounds(142, 283, 209, 31);
		frame.getContentPane().add(lblNewLabel_id);
		
		JLabel labelfirstname = new JLabel("New label");
		labelfirstname.setForeground(Color.BLUE);
		labelfirstname.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelfirstname.setBounds(141, 327, 228, 31);
		frame.getContentPane().add(labelfirstname);
		
		JLabel label_last = new JLabel("New label");
		label_last.setForeground(Color.BLUE);
		label_last.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_last.setBounds(524, 327, 228, 31);
		frame.getContentPane().add(label_last);
		
		JLabel label_dob = new JLabel("New label");
		label_dob.setForeground(Color.BLUE);
		label_dob.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_dob.setBounds(141, 597, 228, 31);
		frame.getContentPane().add(label_dob);
		
		JLabel label_gender = new JLabel("New label");
		label_gender.setForeground(Color.BLUE);
		label_gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_gender.setBounds(522, 597, 228, 31);
		frame.getContentPane().add(label_gender);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(141, 637, 228, 31);
		frame.getContentPane().add(label_5);
		
		String  get_DBString = ("SELECT * FROM client WHERE Id = '"+user_id+"'");

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
	            		
	            			lblNewLabel_id.setText(rs.getString(1));
	            			
	   
	            			labelfirstname.setText(rs.getString(2));
	            			
	            		
	            			label_last.setText(rs.getString(3));
	            			
	            		
	            			label_dob.setText(rs.getString(13));
	            			
	            			
	            			
	            			label_gender.setText(rs.getString(18));
	            			
	            		
	            			label_5.setText(rs.getString(17));
	       
		            		
	            		}

	        	}
	        
			// Handle any errors that may have occurred.
			catch (Exception e1) {
				e1.printStackTrace();
			}
		
	
	}

}
