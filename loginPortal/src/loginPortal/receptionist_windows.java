package loginPortal;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;

public class receptionist_windows {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @param object 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receptionist_windows window = new receptionist_windows();
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
	public receptionist_windows() {
		initializeReception();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initializeReception() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
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
				Patient_reccord.main();
				
			}
		});
		Buttonpatient.setForeground(Color.WHITE);
		Buttonpatient.setBackground(Color.WHITE);
		Buttonpatient.setIcon(new ImageIcon("src/loginPortal/PrPIC/pLis.png"));
		Buttonpatient.setBounds(343, 559, 155, 147);
		frame.getContentPane().add(Buttonpatient);
		
		JLabel lblPatientList = new JLabel("PATIENT RECORD");
		lblPatientList.setBackground(new Color(0, 0, 255));
		lblPatientList.setForeground(new Color(255, 0, 0));
		lblPatientList.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPatientList.setBounds(365, 704, 144, 26);
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
				Medication_portal.main(null);
			}
		});
		nursebutton.setVerticalAlignment(SwingConstants.BOTTOM);
		nursebutton.setForeground(Color.WHITE);
		nursebutton.setBackground(Color.WHITE);
		nursebutton.setBounds(814, 546, 155, 160);
		frame.getContentPane().add(nursebutton);
		nursebutton.setIcon(new ImageIcon("src/loginPortal/PrPIC/nurseR.png"));
		
		JLabel lblNurseRecord = new JLabel("MEDICATION RECORD");
		lblNurseRecord.setForeground(Color.RED);
		lblNurseRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNurseRecord.setBackground(Color.BLUE);
		lblNurseRecord.setBounds(824, 704, 144, 26);
		frame.getContentPane().add(lblNurseRecord);
		
		JButton prescripbutton1 = new JButton("");
		prescripbutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prescpriton_reccord.main(null);
			}
		});
		prescripbutton1.setVerticalAlignment(SwingConstants.BOTTOM);
		prescripbutton1.setForeground(Color.WHITE);
		prescripbutton1.setBackground(Color.WHITE);
		prescripbutton1.setBounds(1283, 546, 155, 160);
		frame.getContentPane().add(prescripbutton1);
		prescripbutton1.setIcon(new ImageIcon("src/loginPortal/PrPIC/rxdoc.png"));
		
		JLabel lblPrescriptionRecord = new JLabel("PRESCRIPTION RECORD");
		lblPrescriptionRecord.setForeground(Color.RED);
		lblPrescriptionRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPrescriptionRecord.setBackground(Color.BLUE);
		lblPrescriptionRecord.setBounds(1283, 704, 168, 26);
		frame.getContentPane().add(lblPrescriptionRecord);
		
	}
	public static void setVisible(boolean b) throws InterruptedException {
		receptionist_windows.setVisible(b);
		
	}
}
