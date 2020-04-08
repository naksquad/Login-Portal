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

public class The_patient_portal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String user_id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					The_patient_portal window = new The_patient_portal(user_id);
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
	public The_patient_portal(String user_id) {
		initialize(user_id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String user_id) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel uhdpic1 = new JLabel("");
		uhdpic1.setBounds(12, 13, 516, 253);
		frame.getContentPane().add(uhdpic1);
		uhdpic1.setIcon(new ImageIcon("src/loginPortal/PrPIC/uhd.png"));
		
		JLabel hosp_logo = new JLabel("");
		hosp_logo.setBounds(1649, 28, 259, 253);
		frame.getContentPane().add(hosp_logo);
		hosp_logo.setIcon(new ImageIcon("src/loginPortal/PrPIC/hosip.png"));
		
		JButton Buttonpatient = new JButton("");
		Buttonpatient.setVerticalAlignment(SwingConstants.BOTTOM);
		Buttonpatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				My_profile_edit.main(user_id);
				
			}
		});
		Buttonpatient.setForeground(Color.WHITE);
		Buttonpatient.setBackground(Color.WHITE);
		Buttonpatient.setIcon(new ImageIcon("src/loginPortal/PrPIC/myprofile.png"));
		Buttonpatient.setBounds(676, 571, 155, 159);
		frame.getContentPane().add(Buttonpatient);
		
		JLabel lblPatientList = new JLabel("MY PROFILE");
		lblPatientList.setBackground(new Color(0, 0, 255));
		lblPatientList.setForeground(new Color(255, 0, 0));
		lblPatientList.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPatientList.setBounds(700, 727, 144, 26);
		frame.getContentPane().add(lblPatientList);
		
		JButton exitbutton = new JButton("");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		exitbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setBackground(Color.WHITE);
		exitbutton.setBounds(1796, 887, 112, 150);
		frame.getContentPane().add(exitbutton);
		exitbutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/exitpic.png"));
		
		JButton nursebutton = new JButton("");
		nursebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				My_presction_patient.main(user_id);
			}
		});
		nursebutton.setVerticalAlignment(SwingConstants.BOTTOM);
		nursebutton.setForeground(Color.WHITE);
		nursebutton.setBackground(Color.WHITE);
		nursebutton.setBounds(1247, 571, 155, 159);
		frame.getContentPane().add(nursebutton);
		nursebutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/rxpatient.png"));
		
		JLabel lblNurseRecord = new JLabel("MY PRESCRIPTIONS");
		lblNurseRecord.setForeground(Color.RED);
		lblNurseRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNurseRecord.setBackground(Color.BLUE);
		lblNurseRecord.setBounds(1257, 727, 144, 26);
		frame.getContentPane().add(lblNurseRecord);
		
	}
	public static void setVisible(boolean b) throws InterruptedException {
		The_patient_portal.setVisible(b);
		
	}
	

}
