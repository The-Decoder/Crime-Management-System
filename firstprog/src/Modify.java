import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Modify implements ActionListener {

	 JFrame frmModify;
	 JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Modify() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
     void initialize() {
		frmModify = new JFrame();
		frmModify.setAutoRequestFocus(false);
		frmModify.setResizable(false);
		frmModify.setTitle("Modify\r\n");
		frmModify.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmModify.setAlwaysOnTop(true);
	
		frmModify.setBounds(100, 100, 368, 263);
		frmModify.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmModify.getContentPane().setLayout(null);
		frmModify.setVisible(true);
		
		JLabel lblFindRecord = new JLabel("Find Record");
		lblFindRecord.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblFindRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblFindRecord.setBounds(93, 33, 162, 41);
		frmModify.getContentPane().add(lblFindRecord);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(117, 72, 119, 14);
		frmModify.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(90, 97, 176, 28);
		frmModify.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Proceed");
		
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(131, 143, 89, 23);
		frmModify.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel.setBounds(-21, 0, 383, 234);
		frmModify.getContentPane().add(lblNewLabel);
		btnNewButton.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		//
		}
		

}
