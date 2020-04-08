package loginPortal;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patient_reccord {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patient_reccord window = new Patient_reccord();
					window.frame.setVisible(true);
					The_main.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Patient_reccord() {
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
		
		JButton patientbutton = new JButton("");
		patientbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_patient.main();
			}
		});
		patientbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		patientbutton.setForeground(Color.WHITE);
		patientbutton.setBackground(Color.WHITE);
		patientbutton.setBounds(882, 560, 155, 150);
		patientbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/addpatient.png"));
		frame.getContentPane().add(patientbutton);
		
		JLabel lab1 = new JLabel("ADD/EDIT PATIENTS");
		lab1.setForeground(Color.RED);
		lab1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lab1.setBackground(Color.BLUE);
		lab1.setBounds(892, 719, 155, 26);
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
		
		JButton plistbutton = new JButton("");
		plistbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Patient_list.main(null);
			}
		});
		plistbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		plistbutton.setForeground(Color.WHITE);
		plistbutton.setBackground(Color.WHITE);
		plistbutton.setBounds(617, 560, 155, 150);
		plistbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/plist.png"));
		frame.getContentPane().add(plistbutton);
		
		JButton Pprescript = new JButton("");
		Pprescript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Patient_checkin.main(null);
			}
		});
		Pprescript.setVerticalAlignment(SwingConstants.BOTTOM);
		Pprescript.setForeground(Color.WHITE);
		Pprescript.setBackground(Color.WHITE);
		Pprescript.setBounds(1129, 560, 155, 150);
		Pprescript.setIcon(new ImageIcon("src/loginPortal/PrPIC/rxpic.png"));
		frame.getContentPane().add(Pprescript);
		
		JLabel lblPatientList = new JLabel("PATIENT LIST");
		lblPatientList.setForeground(Color.RED);
		lblPatientList.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPatientList.setBackground(Color.BLUE);
		lblPatientList.setBounds(644, 723, 155, 26);
		frame.getContentPane().add(lblPatientList);
		
		JLabel lblCheckeinPatient = new JLabel("PATIENT PRESCRIPTION");
		lblCheckeinPatient.setForeground(Color.RED);
		lblCheckeinPatient.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblCheckeinPatient.setBackground(Color.BLUE);
		lblCheckeinPatient.setBounds(1129, 719, 155, 26);
		frame.getContentPane().add(lblCheckeinPatient);
		
	
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	}

}
