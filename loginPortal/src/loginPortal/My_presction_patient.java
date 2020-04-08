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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class My_presction_patient {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String user_id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_presction_patient window = new My_presction_patient(user_id);
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
	public My_presction_patient(String user_id) {
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
		
		JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2","Column3", "Column4","Column5", "Column6","Column7", "Column8","Column7", "Column8"}, 0));
		table.setBounds(35, 484, 1731, 553);
		frame.getContentPane().add(table);
		
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
		
		JLabel lblNewLabel = new JLabel("ID : ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 289, 108, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("First Name : ");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(49, 334, 108, 16);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblMiddleName = new JLabel("Last Nane :");
		lblMiddleName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiddleName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMiddleName.setBounds(15, 377, 115, 16);
		frame.getContentPane().add(lblMiddleName);
		
		JButton btnUpdate = new JButton("PRINT");
		btnUpdate.setForeground(new Color(0, 255, 0));
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.setBounds(1658, 433, 108, 38);
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
		
		JLabel label_namef = new JLabel("New label");
		label_namef.setForeground(Color.BLUE);
		label_namef.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_namef.setBounds(141, 327, 228, 31);
		frame.getContentPane().add(label_namef);
		
		JLabel label_lasn = new JLabel("New label");
		label_lasn.setForeground(Color.BLUE);
		label_lasn.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_lasn.setBounds(142, 370, 228, 31);
		frame.getContentPane().add(label_lasn);
		
		JButton btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.setForeground(new Color(255, 0, 0));
		btnUpdate_1.setBackground(Color.BLACK);
		btnUpdate_1.setBounds(1542, 433, 108, 38);
		frame.getContentPane().add(btnUpdate_1);
		
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
	            			
	   
	            			label_namef.setText(rs.getString(2));
	            			
	            		
	            			label_lasn.setText(rs.getString(3));
	            			
	       
		            		
	            		}

	        	}
	        
			// Handle any errors that may have occurred.
			catch (Exception e1) {
				e1.printStackTrace();
			}
	        	
	        	 String  get_DBString1 = ("SELECT  Prescrition.Id, client.First_Name, client.Last_Name, Medecation.Name, Medecation.Name, Medecation.Descprition, Medecation.Quantity, Medecation.Price, staff.First_Name, staff.Last_Name FROM Prescrition JOIN client ON Prescrition.Patient_id = client.Id  JOIN Medecation ON Prescrition.medication_id = Medecation.Id JOIN staff ON Prescrition.staff_id = staff.Id WHERE Prescrition.Patient_id = '"+user_id+"';");
              String connectionUrl1 = "jdbc:sqlserver://localhost:1433;" +
						"databaseName=UHD_PHARMACY;integratedSecurity=true;";

				// Declare the JDBC objects.
				Connection con1 = null;
				Statement stmt1 = null;
				ResultSet rs1 = null;
				int sum = 0;
		        	try {
		        		// Establish the connection.
		        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		            		con1 = DriverManager.getConnection(connectionUrl1);
		            		stmt1 = con1.createStatement();
		            		rs1 = stmt1.executeQuery(get_DBString1);
		            		
		            		while (rs1.next()) {
		            			
			            		DefaultTableModel model = (DefaultTableModel) table.getModel();
			            		model.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3),rs1.getString(4), rs1.getString(5), rs1.getString(6),rs1.getString(7), rs1.getString(8), rs1.getString(9),rs1.getString(10)});
			            		sum = sum + rs1.getInt(8);
		            		} 
		            		DefaultTableModel model = (DefaultTableModel) table.getModel();
		            		model.addRow(new Object[]{"N/A", "N/A", "N/A","N/A", "N/A", "N/A","Total Price =", sum, "N/A","N/A"});
		            
    
		        	}
		        
				// Handle any errors that may have occurred.
				catch (Exception e1) {
					e1.printStackTrace();
				}
	}
	

}
