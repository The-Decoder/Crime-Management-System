

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Services3 {

	private JFrame frmUnidentifiedPersonsFound;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Services3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmUnidentifiedPersonsFound = new JFrame();
		frmUnidentifiedPersonsFound.setTitle("Un-Identified Persons Found ");
		frmUnidentifiedPersonsFound.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmUnidentifiedPersonsFound.setAlwaysOnTop(true);
		frmUnidentifiedPersonsFound.setResizable(false);
		frmUnidentifiedPersonsFound.getContentPane().setBackground(Color.WHITE);
		frmUnidentifiedPersonsFound.setBounds(100, 100, 450, 474);
		frmUnidentifiedPersonsFound.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmUnidentifiedPersonsFound.getContentPane().setLayout(null);
		frmUnidentifiedPersonsFound.setVisible(true);
		
		JLabel lblFgreg = new JLabel("Found Date :");
		lblFgreg.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblFgreg.setHorizontalAlignment(SwingConstants.CENTER);
		lblFgreg.setBackground(SystemColor.controlText);
		lblFgreg.setBounds(10, 30, 100, 30);
		frmUnidentifiedPersonsFound.getContentPane().add(lblFgreg);
		
		JLabel lblAgeRange = new JLabel("Age Range :");
		lblAgeRange.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgeRange.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblAgeRange.setBackground(Color.BLACK);
		lblAgeRange.setBounds(10, 60, 110, 30);
		frmUnidentifiedPersonsFound.getContentPane().add(lblAgeRange);
		
		JLabel lblHeight = new JLabel("Height :");
		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeight.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblHeight.setBackground(Color.BLACK);
		lblHeight.setBounds(10, 90, 134, 30);
		frmUnidentifiedPersonsFound.getContentPane().add(lblHeight);
		
		JLabel lblDressUpper = new JLabel("Dress Upper :");
		lblDressUpper.setHorizontalAlignment(SwingConstants.CENTER);
		lblDressUpper.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblDressUpper.setBackground(Color.BLACK);
		lblDressUpper.setBounds(10, 120, 100, 30);
		frmUnidentifiedPersonsFound.getContentPane().add(lblDressUpper);
		
		JLabel lblDressLower = new JLabel("Dress Lower :");
		lblDressLower.setHorizontalAlignment(SwingConstants.CENTER);
		lblDressLower.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblDressLower.setBackground(Color.BLACK);
		lblDressLower.setBounds(10, 150, 98, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblDressLower);
		
		JLabel lblBuild = new JLabel("Build :");
		lblBuild.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuild.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblBuild.setBackground(Color.BLACK);
		lblBuild.setBounds(10, 180, 145, 31);
		frmUnidentifiedPersonsFound.getContentPane().add(lblBuild);
		
		JLabel lblComplex = new JLabel("Complexion :");
		lblComplex.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplex.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblComplex.setBackground(Color.BLACK);
		lblComplex.setBounds(10, 210, 98, 31);
		frmUnidentifiedPersonsFound.getContentPane().add(lblComplex);
		
		JLabel lblFace = new JLabel("Face :");
		lblFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblFace.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblFace.setBackground(Color.BLACK);
		lblFace.setBounds(10, 240, 145, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblFace);
		
		JLabel lblHair = new JLabel("Hair :");
		lblHair.setHorizontalAlignment(SwingConstants.CENTER);
		lblHair.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblHair.setBackground(Color.BLACK);
		lblHair.setBounds(10, 270, 151, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblHair);
		
		JLabel lblFoundDatesex = new JLabel("Sex :");
		lblFoundDatesex.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoundDatesex.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblFoundDatesex.setBackground(Color.BLACK);
		lblFoundDatesex.setBounds(10, 330, 151, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblFoundDatesex);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.CENTER);
		lblState.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblState.setBackground(Color.BLACK);
		lblState.setBounds(10, 360, 145, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblState);
		
		JLabel lblNewLabel = new JLabel("Un-identified Persons Found");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(80, 0, 294, 31);
		frmUnidentifiedPersonsFound.getContentPane().add(lblNewLabel);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setForeground(SystemColor.menu);
		btnSubmit.setBackground(SystemColor.desktop);
		btnSubmit.setBounds(291, 394, 110, 30);
		frmUnidentifiedPersonsFound.getContentPane().add(btnSubmit);
		
		JLabel lblHair_1 = new JLabel("Eyes :");
		lblHair_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHair_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblHair_1.setBackground(Color.BLACK);
		lblHair_1.setBounds(10, 300, 151, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblHair_1);
		
		textField = new JTextField();
		textField.setBounds(110, 30, 110, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 60, 60, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 90, 71, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 120, 71, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(110, 150, 71, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(110, 180, 100, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(110, 180, 100, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(110, 210, 100, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(110, 240, 110, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(110, 270, 100, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(110, 300, 100, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(110, 330, 100, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(110, 360, 145, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_12);
		
		JLabel lblDressUpperC = new JLabel("Dress Upper Color :");
		lblDressUpperC.setHorizontalAlignment(SwingConstants.CENTER);
		lblDressUpperC.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblDressUpperC.setBackground(Color.BLACK);
		lblDressUpperC.setBounds(211, 120, 124, 30);
		frmUnidentifiedPersonsFound.getContentPane().add(lblDressUpperC);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(345, 120, 71, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_13);
		
		JLabel lblDressLowerColor = new JLabel("Dress Lower Color :");
		lblDressLowerColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblDressLowerColor.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblDressLowerColor.setBackground(Color.BLACK);
		lblDressLowerColor.setBounds(211, 147, 124, 30);
		frmUnidentifiedPersonsFound.getContentPane().add(lblDressLowerColor);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(345, 151, 71, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_14);
		
		JLabel lblBeard = new JLabel("Beard :");
		lblBeard.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeard.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblBeard.setBackground(Color.BLACK);
		lblBeard.setBounds(253, 270, 82, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblBeard);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(323, 270, 93, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_15);
		
		JLabel lblMo = new JLabel("Mustaches :");
		lblMo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMo.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblMo.setBackground(Color.BLACK);
		lblMo.setBounds(237, 300, 82, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(lblMo);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(323, 301, 93, 25);
		frmUnidentifiedPersonsFound.getContentPane().add(textField_16);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel_1.setBounds(-18, 0, 462, 445);
		frmUnidentifiedPersonsFound.getContentPane().add(lblNewLabel_1);
	}

}
