package loginPortal;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import java.awt.Canvas;
import java.awt.Font;




public class The_main {

	public static JFrame The_login_window;
	private JTextField textFieldNAK1;
	private JPasswordField textFieldNAKID2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] arg) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					The_main window = new The_main();
					window.The_login_window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public The_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		The_login_window = new JFrame();
		The_login_window.getContentPane().setBackground(Color.WHITE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		The_login_window.setBounds(0, 0,screen.width,screen.height - 30);
		The_login_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		The_login_window.getContentPane().setLayout(null);
		The_login_window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		The_login_window.setUndecorated(true);
	
		
		JButton btnTest = new JButton("LOGIN");
		btnTest.setBackground(Color.WHITE);
		btnTest.setForeground(Color.BLACK);
		
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				Take_user_name_pass get_credential = new Take_user_name_pass(textFieldNAK1.getText(),textFieldNAKID2.getText());
				// System.out.println(textFieldNAKID2.getText());
				get_credential.master_taker();	
				
				
				
			}
		});
		btnTest.setBounds(860, 660, 97, 25);
		The_login_window.getContentPane().add(btnTest);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				The_login_window.dispose();
			}
		});
		btnExit.setBounds(979, 660, 97, 25);
		The_login_window.getContentPane().add(btnExit);
		
		textFieldNAK1 = new JTextField();
		textFieldNAK1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textFieldNAK1.setForeground(Color.RED);
		textFieldNAK1.setBounds(860, 579, 216, 22);
		The_login_window.getContentPane().add(textFieldNAK1);
		textFieldNAK1.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel.setBounds(751, 582, 97, 16);
		The_login_window.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblPassword.setBounds(751, 617, 97, 16);
		The_login_window.getContentPane().add(lblPassword);
		
		textFieldNAKID2 = new JPasswordField();
		textFieldNAKID2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textFieldNAKID2.setForeground(Color.RED);
		textFieldNAKID2.setBounds(860, 614, 216, 22);
		The_login_window.getContentPane().add(textFieldNAKID2);
		
		JLabel uhdpic = new JLabel("");
		uhdpic.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		uhdpic.setBounds(12, 13, 515, 253);
		The_login_window.getContentPane().add(uhdpic);
		
		JLabel hosp_logo = new JLabel("");
		hosp_logo.setBounds(1687, 47, 259, 253);
		hosp_logo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		The_login_window.getContentPane().add(hosp_logo);
	}

	public static void setVisible(boolean c)  {
		
		
	}
}

