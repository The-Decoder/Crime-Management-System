import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Contact_us {

	 JFrame frmContactUs;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Contact_us() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContactUs = new JFrame();
		frmContactUs.setResizable(false);
		frmContactUs.setFont(new Font("Dialog", Font.BOLD, 12));
		frmContactUs.setAlwaysOnTop(true);
		frmContactUs.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmContactUs.setTitle("Contact Us");
		frmContactUs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmContactUs.getContentPane().setBackground(Color.WHITE);
		frmContactUs.setBackground(Color.WHITE);
		frmContactUs.setBounds(100, 100, 656, 457);
		frmContactUs.getContentPane().setLayout(null);
		frmContactUs.setVisible(true);
		
		JLabel lblEmailUsAt = new JLabel("Email Us at delpol@vsnl.com");
		lblEmailUsAt.setForeground(Color.WHITE);
		lblEmailUsAt.setFont(new Font("Tekton Pro", Font.PLAIN, 23));
		lblEmailUsAt.setBounds(184, 26, 352, 36);
		frmContactUs.getContentPane().add(lblEmailUsAt);
		
		JLabel lblYourName = new JLabel("Your Name");
		lblYourName.setForeground(Color.WHITE);
		lblYourName.setBackground(Color.WHITE);
		lblYourName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYourName.setBounds(113, 87, 106, 27);
		frmContactUs.getContentPane().add(lblYourName);
		
		JLabel lblYourEmailAddress = new JLabel("Your Email Address");
		lblYourEmailAddress.setForeground(Color.WHITE);
		lblYourEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYourEmailAddress.setBounds(113, 125, 159, 27);
		frmContactUs.getContentPane().add(lblYourEmailAddress);
		
		JLabel lblYour = new JLabel("Your Contact No.");
		lblYour.setBackground(Color.WHITE);
		lblYour.setForeground(Color.WHITE);
		lblYour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYour.setBounds(113, 161, 141, 27);
		frmContactUs.getContentPane().add(lblYour);
		
		JLabel lblComplaintssuggestion = new JLabel("Complaints/Suggestion");
		lblComplaintssuggestion.setForeground(Color.WHITE);
		lblComplaintssuggestion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblComplaintssuggestion.setBounds(113, 222, 189, 27);
		frmContactUs.getContentPane().add(lblComplaintssuggestion);
		
		JLabel lblCommentsappreciations = new JLabel("Comments/Appreciations");
		lblCommentsappreciations.setForeground(Color.WHITE);
		lblCommentsappreciations.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCommentsappreciations.setBounds(113, 238, 189, 27);
		frmContactUs.getContentPane().add(lblCommentsappreciations);
		
		textField = new JTextField();
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textField.setBounds(306, 83, 174, 34);
		frmContactUs.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setBackground(new Color(255, 0, 0));
		btnSubmit.setForeground(new Color(248, 248, 255));
		btnSubmit.setBounds(316, 355, 116, 36);
		frmContactUs.getContentPane().add(btnSubmit);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(306, 128, 174, 34);
		frmContactUs.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(306, 173, 174, 34);
		frmContactUs.getContentPane().add(textField_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(306, 222, 299, 112);
		frmContactUs.getContentPane().add(editorPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel.setBounds(-19, 0, 672, 428);
		frmContactUs.getContentPane().add(lblNewLabel);
	}
}
