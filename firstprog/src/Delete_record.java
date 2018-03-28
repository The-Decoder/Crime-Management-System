import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Delete_record {

	private JFrame frmDeleteRecord;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Delete_record() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteRecord = new JFrame();
		frmDeleteRecord.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmDeleteRecord.setTitle("Delete Record");
		frmDeleteRecord.setAlwaysOnTop(true);
		frmDeleteRecord.getContentPane().setBackground(Color.WHITE);
		frmDeleteRecord.setBounds(100, 100, 455, 359);
		frmDeleteRecord.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDeleteRecord.getContentPane().setLayout(null);
		frmDeleteRecord.setVisible(true);
		
		JLabel lblRecordNo = new JLabel("RECORD NO.");
		lblRecordNo.setFont(new Font("Tekton Pro", Font.BOLD, 26));
		lblRecordNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecordNo.setBounds(133, 84, 187, 48);
		frmDeleteRecord.getContentPane().add(lblRecordNo);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(145, 136, 163, 41);
		frmDeleteRecord.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(89, 226, 116, 32);
		frmDeleteRecord.getContentPane().add(btnNewButton);
		
		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGoBack.setBackground(new Color(154, 205, 50));
		btnGoBack.setBounds(240, 226, 116, 32);
		frmDeleteRecord.getContentPane().add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel.setBounds(-19, 0, 472, 330);
		frmDeleteRecord.getContentPane().add(lblNewLabel);
	}

}
