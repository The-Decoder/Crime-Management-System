

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Services1 {

	 JFrame frmMissingPersons;
	 JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblFathers;
	private JTextField textField_2;
	private JLabel lblAgeRangeFrom;
	private JTextField textField_3;
	private JLabel lblEnd;
	private JTextField textField_4;
	private JLabel lblHeight;
	private JTextField textField_5;
	private JLabel lblReligion;
	private JTextField textField_6;
	private JLabel lblMissingPersons;
	private JLabel lblSex;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Services1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMissingPersons = new JFrame();
		frmMissingPersons.setAlwaysOnTop(true);
		frmMissingPersons.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmMissingPersons.setTitle("Missing Persons");
		frmMissingPersons.setResizable(false);
		frmMissingPersons.getContentPane().setBackground(Color.WHITE);
		frmMissingPersons.getContentPane().setForeground(UIManager.getColor("Desktop.background"));
		frmMissingPersons.setBounds(100, 100, 450, 300);
		frmMissingPersons.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMissingPersons.getContentPane().setLayout(null);
		frmMissingPersons.setVisible(true);
		
		lblNewLabel = new JLabel("Missing \r\n  Date :");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 47, 130, 27);
		frmMissingPersons.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(42, 80, 120, 27);
		frmMissingPersons.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 80, 185, 27);
		frmMissingPersons.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblFathers = new JLabel("Fathers Name :");
		lblFathers.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblFathers.setHorizontalAlignment(SwingConstants.CENTER);
		lblFathers.setBounds(20, 113, 116, 27);
		frmMissingPersons.getContentPane().add(lblFathers);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 113, 185, 27);
		frmMissingPersons.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblAgeRangeFrom = new JLabel("Age Range From :");
		lblAgeRangeFrom.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblAgeRangeFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgeRangeFrom.setBounds(5, 146, 135, 27);
		frmMissingPersons.getContentPane().add(lblAgeRangeFrom);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 146, 68, 27);
		frmMissingPersons.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblEnd = new JLabel("End :");
		lblEnd.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblEnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnd.setBounds(190, 146, 57, 27);
		frmMissingPersons.getContentPane().add(lblEnd);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(239, 146, 68, 27);
		frmMissingPersons.getContentPane().add(textField_4);
		
		lblHeight = new JLabel("Height :");
		lblHeight.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setBounds(55, 179, 92, 27);
		frmMissingPersons.getContentPane().add(lblHeight);
		
		textField_5 = new JTextField();
		textField_5.setBounds(131, 179, 68, 27);
		frmMissingPersons.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblReligion = new JLabel("Religion :");
		lblReligion.setHorizontalAlignment(SwingConstants.CENTER);
		lblReligion.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblReligion.setBounds(42, 212, 115, 27);
		frmMissingPersons.getContentPane().add(lblReligion);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(131, 212, 115, 27);
		frmMissingPersons.getContentPane().add(textField_6);
		
		lblMissingPersons = new JLabel("MISSING PERSONS");
		lblMissingPersons.setForeground(new Color(0, 0, 205));
		lblMissingPersons.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMissingPersons.setHorizontalAlignment(SwingConstants.CENTER);
		lblMissingPersons.setBounds(79, -11, 292, 71);
		frmMissingPersons.getContentPane().add(lblMissingPersons);
		
		lblSex = new JLabel("Sex :");
		lblSex.setHorizontalAlignment(SwingConstants.CENTER);
		lblSex.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblSex.setBounds(209, 179, 57, 27);
		frmMissingPersons.getContentPane().add(lblSex);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(326, 223, 98, 27);
		frmMissingPersons.getContentPane().add(btnSubmit);
	    		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("male");
		rdbtnNewRadioButton.setBackground(new Color(221, 160, 221));
		rdbtnNewRadioButton.setBounds(262, 182, 54, 23);
		frmMissingPersons.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBackground(new Color(221, 160, 221));
		rdbtnFemale.setBounds(326, 182, 68, 23);
		frmMissingPersons.getContentPane().add(rdbtnFemale);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(131, 47, 185, 27);
		frmMissingPersons.getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel_2.setBounds(-21, -11, 465, 282);
		frmMissingPersons.getContentPane().add(lblNewLabel_2);
	}
}
