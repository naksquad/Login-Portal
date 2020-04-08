package loginPortal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class My_BILL {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_BILL window = new My_BILL();
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
	public My_BILL() {
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
		lblMiddleName.setBounds(15, 423, 115, 16);
		frame.getContentPane().add(lblMiddleName);
		
		JButton btnUpdate = new JButton("UPDATE\r\n");
		btnUpdate.setForeground(new Color(0, 0, 255));
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
		
		JLabel lblMiddleNane = new JLabel("Middle Nane :");
		lblMiddleNane.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiddleNane.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMiddleNane.setBounds(15, 383, 115, 16);
		frame.getContentPane().add(lblMiddleNane);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(142, 283, 209, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(141, 327, 228, 31);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(142, 416, 228, 31);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(141, 376, 228, 31);
		frame.getContentPane().add(label_2);
		
		table = new JTable();
		table.setBounds(35, 484, 1731, 553);
		frame.getContentPane().add(table);
		
		JLabel lblTotalAmount = new JLabel("Total Amount :");
		lblTotalAmount.setForeground(new Color(0, 128, 0));
		lblTotalAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAmount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalAmount.setBounds(413, 290, 143, 16);
		frame.getContentPane().add(lblTotalAmount);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setForeground(new Color(255, 0, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(565, 283, 209, 31);
		frame.getContentPane().add(label_3);
	}

}
