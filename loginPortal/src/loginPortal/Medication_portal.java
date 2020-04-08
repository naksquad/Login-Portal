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
import javax.swing.SwingConstants;

public class Medication_portal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medication_portal window = new Medication_portal();
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
	public Medication_portal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JLabel uhdlogo = new JLabel("");
		uhdlogo.setBounds(12, 13, 516, 253);
		frame.getContentPane().add(uhdlogo);
		uhdlogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hospitallogo = new JLabel("");
		hospitallogo.setBounds(1631, 13, 259, 253);
		frame.getContentPane().add(hospitallogo);
		hospitallogo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		
		JButton addMedtbutton = new JButton("");
		addMedtbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medication_add.main(null);
			}
		});
		addMedtbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		addMedtbutton.setForeground(Color.WHITE);
		addMedtbutton.setBackground(Color.WHITE);
		addMedtbutton.setBounds(1222, 560, 155, 150);
		addMedtbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/addpatient.png"));
		frame.getContentPane().add(addMedtbutton);
		
		JLabel lab1 = new JLabel("ADD/EDIT MEDICATIONS");
		lab1.setForeground(Color.RED);
		lab1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lab1.setBackground(Color.BLUE);
		lab1.setBounds(1232, 723, 155, 26);
		frame.getContentPane().add(lab1);
		
		JButton exitbutton = new JButton("");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		exitbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBackground(Color.WHITE);
		exitbutton.setBounds(1778, 840, 112, 150);
		frame.getContentPane().add(exitbutton);
		exitbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/exitpic.png"));
		
		JButton medtbutton = new JButton("");
		medtbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medication_list.main(null);
			}
		});
		medtbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		medtbutton.setForeground(Color.WHITE);
		medtbutton.setBackground(Color.WHITE);
		medtbutton.setBounds(617, 560, 155, 150);
		medtbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/plist.png"));
		frame.getContentPane().add(medtbutton);
		
		
		JLabel lblPatientList = new JLabel("MEDICATION LIST");
		lblPatientList.setForeground(Color.RED);
		lblPatientList.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPatientList.setBackground(Color.BLUE);
		lblPatientList.setBounds(644, 723, 155, 26);
		frame.getContentPane().add(lblPatientList);
		
	
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	}

}
