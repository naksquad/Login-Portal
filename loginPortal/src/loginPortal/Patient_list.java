package loginPortal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

import java.awt.TextArea;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Patient_list {

	private JFrame frame;
	private JTextField textFieldsearbyID;
	JTable Ptable;
	private JTextField textField_byNameF;
	private JTextField textField_byNameL;
	private JTextField textField_byDATES;
	private JTextField textField_byDATEE;
	private JTextField textField_byDATE;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patient_list window = new Patient_list();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 * @param passl2 
	 * @return 
	 * @return 
	 * @return 
	 */


	public Patient_list() {
		initialize();
		
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        
		
		JTable table = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2","Column2", "Column4","Column5", "Column6","Column7", "Column8","Column9", "Column10"}, 0));
		table.setBounds(250, 477, 1389, 526);
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
		exitbutton.setBackground(new Color(70, 130, 180));
		exitbutton.setBounds(1778, 853, 112, 150);
		frame.getContentPane().add(exitbutton);
		exitbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/exitpic.png"));
		
		JLabel lblSearchPatientBy = new JLabel("Search Patient By ID :");
		lblSearchPatientBy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchPatientBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchPatientBy.setBounds(34, 297, 204, 16);
		frame.getContentPane().add(lblSearchPatientBy);
		
		textFieldsearbyID = new JTextField();
		textFieldsearbyID.setColumns(10);
		textFieldsearbyID.setBounds(250, 295, 102, 22);
		frame.getContentPane().add(textFieldsearbyID);
		
		JLabel lblStartDate = new JLabel("Start Date :");
		lblStartDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStartDate.setBounds(466, 339, 204, 16);
		frame.getContentPane().add(lblStartDate);
		
		textField_byNameF = new JTextField();
		textField_byNameF.setColumns(10);
		textField_byNameF.setBounds(250, 337, 102, 22);
		frame.getContentPane().add(textField_byNameF);
		
		JLabel lblPatientById = new JLabel("Patient First Name :");
		lblPatientById.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientById.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatientById.setBounds(34, 340, 204, 16);
		frame.getContentPane().add(lblPatientById);
		
		textField_byNameL = new JTextField();
		textField_byNameL.setColumns(10);
		textField_byNameL.setBounds(250, 372, 102, 22);
		frame.getContentPane().add(textField_byNameL);
		
		JButton button_BY_NAME = new JButton("FIND");
		button_BY_NAME.setForeground(new Color(255, 0, 0));
		button_BY_NAME.setBackground(Color.BLACK);
		button_BY_NAME.setBounds(250, 407, 102, 25);
		frame.getContentPane().add(button_BY_NAME);
		
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
		
		textField_byDATES = new JTextField();
		textField_byDATES.setColumns(10);
		textField_byDATES.setBounds(682, 337, 102, 22);
		frame.getContentPane().add(textField_byDATES);
		
		textField_byDATEE = new JTextField();
		textField_byDATEE.setColumns(10);
		textField_byDATEE.setBounds(682, 372, 102, 22);
		frame.getContentPane().add(textField_byDATEE);
		
		JButton button_BY_DATE = new JButton("FIND");
		button_BY_DATE.setForeground(Color.RED);
		button_BY_DATE.setBackground(Color.BLACK);
		button_BY_DATE.setBounds(682, 407, 102, 25);
		frame.getContentPane().add(button_BY_DATE);
		
		JLabel lblSearchPatientBy_1 = new JLabel("Search Patient By Date :");
		lblSearchPatientBy_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearchPatientBy_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearchPatientBy_1.setBounds(466, 298, 204, 16);
		frame.getContentPane().add(lblSearchPatientBy_1);
		
		textField_byDATE = new JTextField();
		textField_byDATE.setColumns(10);
		textField_byDATE.setBounds(682, 295, 102, 22);
		frame.getContentPane().add(textField_byDATE);
		
		JButton button_FIND_DATE = new JButton("SEARCH");
		button_FIND_DATE.setForeground(Color.GREEN);
		button_FIND_DATE.setBackground(Color.BLACK);
		button_FIND_DATE.setBounds(796, 294, 102, 25);
		frame.getContentPane().add(button_FIND_DATE);
		
		

        
        /////1
			
		JButton btnLoadAllPatients = new JButton("Load All Patients");
		btnLoadAllPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
              String  get_DBString = ("SELECT * FROM client");

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
			            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9), rs.getString(10), rs.getString(13),rs.getString(16)});
			            		
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
       
       
       
        ////2
		JButton btnFindByID = new JButton("SEARCH");
		btnFindByID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                String get_DBString = ("SELECT * FROM client WHERE Id = '"+textFieldsearbyID.getText()+"'");
                
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
  			            		model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9), rs.getString(10), rs.getString(13),rs.getString(16)});
  			            		
  		            		}
      
  		        	}
  		        
  				// Handle any errors that may have occurred.
  				catch (Exception e1) {
  					e1.printStackTrace();
  				}
				
			}
		});
		btnFindByID.setForeground(Color.GREEN);
		btnFindByID.setBackground(Color.BLACK);
		btnFindByID.setBounds(364, 294, 102, 25);
		frame.getContentPane().add(btnFindByID);
		
		JButton btnClearTable = new JButton("Clear Table");
		btnClearTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel) table.getModel();
				model1.setRowCount(0);
			}
		});
		btnClearTable.setForeground(Color.BLUE);
		btnClearTable.setBackground(Color.BLACK);
		btnClearTable.setBounds(1650, 477, 160, 25);
		frame.getContentPane().add(btnClearTable);
	}
}
