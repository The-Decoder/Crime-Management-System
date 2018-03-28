

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Services5 {

	private JFrame frmMissingstolenMobilePhones;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Services5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMissingstolenMobilePhones = new JFrame();
		frmMissingstolenMobilePhones.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmMissingstolenMobilePhones.setTitle("Missing/Stolen Mobile Phones");
		frmMissingstolenMobilePhones.setAlwaysOnTop(true);
		frmMissingstolenMobilePhones.setResizable(false);
		frmMissingstolenMobilePhones.getContentPane().setBackground(Color.WHITE);
		frmMissingstolenMobilePhones.setBounds(100, 100, 450, 453);
		frmMissingstolenMobilePhones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMissingstolenMobilePhones.getContentPane().setLayout(null);
		frmMissingstolenMobilePhones.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("MISSING/STOLEN MOBILE PHONES");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 11, 374, 35);
		frmMissingstolenMobilePhones.getContentPane().add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setBounds(47, 50, 112, 30);
		frmMissingstolenMobilePhones.getContentPane().add(lblDate);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblName.setBounds(37, 80, 122, 30);
		frmMissingstolenMobilePhones.getContentPane().add(lblName);
		
		JLabel lblFathersName = new JLabel("Fathers Name :");
		lblFathersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFathersName.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblFathersName.setBounds(0, 110, 138, 35);
		frmMissingstolenMobilePhones.getContentPane().add(lblFathersName);
		
		JLabel lblMobileName = new JLabel("Mobile Name :");
		lblMobileName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileName.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblMobileName.setBounds(0, 140, 147, 30);
		frmMissingstolenMobilePhones.getContentPane().add(lblMobileName);
		
		JLabel lblColor = new JLabel("Color :");
		lblColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblColor.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblColor.setBounds(47, 170, 104, 30);
		frmMissingstolenMobilePhones.getContentPane().add(lblColor);
		
		JLabel lblEmeiNo = new JLabel("IMEI No. :");
		lblEmeiNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmeiNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblEmeiNo.setBounds(37, 200, 101, 30);
		frmMissingstolenMobilePhones.getContentPane().add(lblEmeiNo);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNumber.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(9, 230, 122, 30);
		frmMissingstolenMobilePhones.getContentPane().add(lblPhoneNumber);
		
		JLabel lblCurrentPriceOf = new JLabel("Current price ");
		lblCurrentPriceOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentPriceOf.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblCurrentPriceOf.setBounds(27, 260, 94, 30);
		frmMissingstolenMobilePhones.getContentPane().add(lblCurrentPriceOf);
		
		JLabel lblOfPhone = new JLabel("of Phone :");
		lblOfPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfPhone.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblOfPhone.setBounds(36, 277, 102, 35);
		frmMissingstolenMobilePhones.getContentPane().add(lblOfPhone);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 80, 177, 25);
		frmMissingstolenMobilePhones.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 110, 177, 25);
		frmMissingstolenMobilePhones.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(131, 140, 177, 25);
		frmMissingstolenMobilePhones.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(131, 170, 112, 25);
		frmMissingstolenMobilePhones.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(131, 200, 164, 25);
		frmMissingstolenMobilePhones.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(131, 230, 164, 25);
		frmMissingstolenMobilePhones.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(131, 275, 112, 30);
		frmMissingstolenMobilePhones.getContentPane().add(textField_7);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(152, 348, 112, 35);
		frmMissingstolenMobilePhones.getContentPane().add(btnNewButton);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(131, 50, 177, 25);
		frmMissingstolenMobilePhones.getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel_1.setBounds(-20, 0, 464, 424);
		frmMissingstolenMobilePhones.getContentPane().add(lblNewLabel_1);
	}
}
