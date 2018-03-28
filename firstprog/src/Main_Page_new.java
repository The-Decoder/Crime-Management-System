
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.sql.Connection;                                      // importing established connection
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main_Page_new implements ActionListener, MenuListener {
	
	JMenu Records , Search ,home , about_us , services, contact_us;
	JMenuItem  view,del , modify , check,service1 , service2, service3, service4, service5;

	 JFrame frm;
	  JLabel L1;
	  JLabel L2;
	  JLabel L3;
	  JPanel panel_2;
	 

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Main_Page_new() {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frm = new JFrame();
		frm.setAutoRequestFocus(false);
		frm.setBackground(Color.WHITE);
		frm.setTitle("Crime Management\r\n");
		frm.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		
		JMenuBar jmb = new JMenuBar();
		jmb.setToolTipText("");
		home = new JMenu("HOME");
		about_us = new JMenu("ABOUT US");
		
		about_us.setForeground(Color.BLACK);
		services = new JMenu("SERVICES");
		services.setForeground(Color.BLACK);
		
		view = new JMenuItem("View Records");
		contact_us = new JMenu("CONTACT US");
		contact_us.setForeground(Color.BLACK);
		Records = new JMenu("RECORDS");
		Records.setForeground(Color.BLACK);
		
		Search = new JMenu("SEARCH");
		Search.setForeground(Color.BLACK);
		del = new JMenuItem("Delete Records");
		modify = new JMenuItem("Modify Records");
		check = new JMenuItem("Check");
		Records.add(view);
		Records.add(del);
		Records.add(modify);
		
		service1 = new JMenuItem("Missing Persons");
		services.add(service1);
		service2 = new JMenuItem("Most Wanted");
		services.add(service2);
		service3 = new JMenuItem("UnIdentified Person Found");
		services.add(service3);
		service4 = new JMenuItem("UnClaimed/Seized Vehicles");
		services.add(service4);
		service5 = new JMenuItem("Missing/Stolen Mobile Phones");
		services.add(service5);
		jmb.add(home);
		jmb.add(about_us);
		jmb.add(services);
		jmb.add(Search);
		jmb.add(Records);
	    jmb.add(contact_us);
		
		jmb.setBackground(Color.WHITE);
		jmb.setBounds(0, 0, 727, 35);
		frm.getContentPane().add(jmb);
		
		JLabel main_icon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
		main_icon.setIcon(new ImageIcon(img));
		main_icon.setBounds(123, 105, 217, 276);
		frm.getContentPane().add(main_icon);
		
		L1 = new JLabel("NATIONAL CRIME");
		L1.setForeground(Color.WHITE);
		L1.setFont(new Font("Tw Cen MT", Font.ITALIC, 34));
		L1.setBounds(367, 158, 296, 61);
		frm.getContentPane().add(L1);
		
		L2 = new JLabel("RECORDS");
		L2.setForeground(Color.WHITE);
		L2.setFont(new Font("Tw Cen MT", Font.ITALIC, 34));
		L2.setBounds(367, 199, 296, 61);
		frm.getContentPane().add(L2);
		
		L3 = new JLabel("BUREAU");
		L3.setBackground(Color.WHITE);
		L3.setForeground(Color.WHITE);
		L3.setFont(new Font("Tw Cen MT", Font.ITALIC, 34));
		L3.setBounds(367, 240, 296, 61);
		frm.getContentPane().add(L3);
		
		frm.getContentPane().setBackground(Color.WHITE);
		frm.setLocation(300,300);
		frm.setBounds(100, 100, 733, 490);
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		frm.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 451, 717, 10);
		frm.getContentPane().add(panel);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(0, 30, 10, 431);
		frm.getContentPane().add(panel1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(717, 30, 10, 431);
		frm.getContentPane().add(panel_2);
		
		JLabel backgroundImage = new JLabel("");
		backgroundImage.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\feathers_lines_patterns_light_background_dark_10617_1920x1080.jpg"));
		backgroundImage.setBounds(0, 0, 750, 461);
		frm.getContentPane().add(backgroundImage);
		about_us.addMenuListener(this);
		contact_us.addMenuListener(this);
		modify.addActionListener(this);
		service1.addActionListener(this);
		service2.addActionListener(this);
		service3.addActionListener(this);
		service4.addActionListener(this);
		service5.addActionListener(this);
		Search.addMenuListener(this);
		del.addActionListener(this);
		
		}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == del) {
			Delete_record dr = new Delete_record();
		}
		if(ae.getSource()==service1) {
			Services1 s1 = new Services1();
			
		}
		
		if(ae.getSource()==service2) {
			Services2 s2 = new Services2();
			
		}
		
		if(ae.getSource()==service3) {
			Services3 s3 = new Services3();
			
		}
		
		if(ae.getSource()==service4) {
			Services4 s4 = new Services4();
			
		}
		
		if(ae.getSource()==service5) {
			Services5 s5 = new Services5();
			
		}
		
		
		if(ae.getSource()==modify) {
			Modify m = new Modify();
			
		}
		
		
	}

	//@Override
	public void menuCanceled(MenuEvent me) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void menuDeselected(MenuEvent me) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void menuSelected(MenuEvent me) {
		// TODO Auto-generated method stub
		
		if(me.getSource().equals(home)) {
			Main_Page_new mpn = new Main_Page_new();
			
		}
		if(me.getSource().equals(about_us)) {
			About_us au = new About_us();
			
		}
		
		if(me.getSource().equals(contact_us)){
			Contact_us cu = new Contact_us();
		}
		if(me.getSource().equals(Search)) {
			
			Search s = new Search();
		}
		
	}
	
}
