import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Search implements ActionListener,MenuListener {

	 JFrame frmSearch;
	 JTextField textField;
	 JTextField textField_1;
	 JButton btnGoBack,btnSearch;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Search() {
		frmSearch = new JFrame();
		frmSearch.setBackground(Color.BLACK);
		
		frmSearch.setAlwaysOnTop(true);
		frmSearch.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmSearch.setTitle("Search");
		frmSearch.getContentPane().setBackground(Color.WHITE);
		frmSearch.setBounds(100, 100, 436, 349);
		frmSearch.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSearch.getContentPane().setLayout(null);
		frmSearch.setVisible(true);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBackground(Color.WHITE);
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		lblFirstName.setBounds(85, 114, 105, 28);
		frmSearch.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Tekton Pro", Font.PLAIN, 16));
		lblLastName.setBounds(85, 155, 105, 28);
		frmSearch.getContentPane().add(lblLastName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(193, 110, 135, 27);
		frmSearch.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(193, 154, 135, 28);
		frmSearch.getContentPane().add(textField_1);
		
		btnSearch = new JButton("Search..");
		btnSearch.setBackground(new Color(50, 205, 50));
		btnSearch.addActionListener(this);
			
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBounds(101, 219, 89, 36);
		frmSearch.getContentPane().add(btnSearch);
		
		btnGoBack = new JButton("Go Back..");
		btnGoBack.setBackground(new Color(255, 51, 51));

		btnGoBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGoBack.setBounds(214, 219, 100, 36);
		frmSearch.getContentPane().add(btnGoBack);
		
		JLabel lblSearchRecord = new JLabel("SEARCH RECORD");
		lblSearchRecord.setForeground(Color.WHITE);
		lblSearchRecord.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 19));
		lblSearchRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchRecord.setBounds(101, 24, 200, 51);
		frmSearch.getContentPane().add(lblSearchRecord);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		label_2.setBounds(0, 0, 424, 310);
		frmSearch.getContentPane().add(label_2);
		
		btnGoBack.addActionListener(this);
	}

	//@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btnGoBack) {
			
      		Main_Page_new mpn = new Main_Page_new();
		}
		
	}

	//@Override
	public void menuCanceled(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void menuDeselected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void menuSelected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */


