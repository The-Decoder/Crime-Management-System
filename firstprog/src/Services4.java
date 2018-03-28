

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Services4 {

	private JFrame frmUnclaimedseizedVehicles;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Services4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmUnclaimedseizedVehicles = new JFrame();
		frmUnclaimedseizedVehicles.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmUnclaimedseizedVehicles.setTitle("Un-Claimed/Seized Vehicles");
		frmUnclaimedseizedVehicles.setAlwaysOnTop(true);
		frmUnclaimedseizedVehicles.getContentPane().setBackground(Color.WHITE);
		frmUnclaimedseizedVehicles.setBounds(100, 100, 450, 317);
		frmUnclaimedseizedVehicles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnclaimedseizedVehicles.setResizable(false);
		frmUnclaimedseizedVehicles.getContentPane().setLayout(null);
		frmUnclaimedseizedVehicles.setVisible(true);
		
		JLabel lblU = new JLabel("Unclaimed/Seized Vehicles");
		lblU.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblU.setForeground(new Color(255, 255, 224));
		lblU.setHorizontalAlignment(SwingConstants.CENTER);
		lblU.setBounds(32, 11, 358, 34);
		frmUnclaimedseizedVehicles.getContentPane().add(lblU);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 48, 93, 34);
		frmUnclaimedseizedVehicles.getContentPane().add(lblNewLabel);
		
		JLabel lblGivenBelowIs = new JLabel("Given below is the form that will assist you in formulating the desired ");
		lblGivenBelowIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblGivenBelowIs.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblGivenBelowIs.setBounds(10, 73, 424, 28);
		frmUnclaimedseizedVehicles.getContentPane().add(lblGivenBelowIs);
		
		JLabel lblQuerySoAs = new JLabel("query so as to fetch the required information  from our central ");
		lblQuerySoAs.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuerySoAs.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblQuerySoAs.setBounds(-11, 93, 424, 28);
		frmUnclaimedseizedVehicles.getContentPane().add(lblQuerySoAs);
		
		JLabel lblDatabase = new JLabel("database.");
		lblDatabase.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatabase.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblDatabase.setBounds(-3, 112, 96, 28);
		frmUnclaimedseizedVehicles.getContentPane().add(lblDatabase);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number :");
		lblRegistrationNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblRegistrationNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNumber.setBounds(10, 140, 163, 40);
		frmUnclaimedseizedVehicles.getContentPane().add(lblRegistrationNumber);
		
		JLabel lblEngineNumber = new JLabel("Engine Number :");
		lblEngineNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEngineNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblEngineNumber.setBounds(10, 178, 200, 40);
		frmUnclaimedseizedVehicles.getContentPane().add(lblEngineNumber);
		
		JLabel lblChassisNumber = new JLabel("Chassis Number :");
		lblChassisNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblChassisNumber.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblChassisNumber.setBounds(10, 213, 200, 40);
		frmUnclaimedseizedVehicles.getContentPane().add(lblChassisNumber);
		
		textField = new JTextField();
		textField.setBounds(174, 140, 136, 30);
		frmUnclaimedseizedVehicles.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 180, 136, 30);
		frmUnclaimedseizedVehicles.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 220, 136, 30);
		frmUnclaimedseizedVehicles.getContentPane().add(textField_2);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBackground(new Color(0, 0, 255));
		btnSearch.setBounds(335, 140, 89, 25);
		frmUnclaimedseizedVehicles.getContentPane().add(btnSearch);
		
		JButton button = new JButton("Search");
		button.setBackground(new Color(0, 0, 255));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(335, 180, 89, 25);
		frmUnclaimedseizedVehicles.getContentPane().add(button);
		
		JButton button_1 = new JButton("Search");
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(0, 0, 255));
		button_1.setBounds(335, 220, 89, 25);
		frmUnclaimedseizedVehicles.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel_1.setBounds(-24, 0, 468, 288);
		frmUnclaimedseizedVehicles.getContentPane().add(lblNewLabel_1);
	}

}
