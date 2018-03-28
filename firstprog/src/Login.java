import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Login extends JFrame implements ActionListener {

	JPanel contentPane;
	JTextField user;
	JButton btnLogin,btnQuit;
	JFrame frame;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setAutoRequestFocus(false);
		setResizable(false);
		
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		setTitle("ECMS-Login");
		
		setBounds(100, 100, 360, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(54, 59, 106, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(54, 98, 106, 28);
		contentPane.add(lblPassword);
		
		user = new JTextField();
		user.setBounds(146, 63, 133, 24);
		contentPane.add(user);
		user.setColumns(10);
		
		
		btnLogin= new JButton("LOGIN");
		btnLogin.setBounds(87, 162, 89, 23);
		contentPane.add(btnLogin);
		
		
		btnQuit = new JButton("QUIT");
		
		btnQuit.setBounds(200, 162, 89, 23);
		contentPane.add(btnQuit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 102, 133, 24);
		contentPane.add(passwordField);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\fractal_flower_shiny_fractal_art_102675_1920x1080.jpg"));
		lblNewLabel.setBounds(0, 1, 354, 223);
		contentPane.add(lblNewLabel);
		btnLogin.addActionListener(this);
		btnQuit.addActionListener(this);
		
	}

	//@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == btnLogin) {
			if(user.getText().equals("crime") && passwordField.getText().equals("nocrime")) {
				this.dispose();
							Main_Page_new mpn = new Main_Page_new();
			}
			
		}
		if(ae.getSource() == btnQuit) {
			this.dispose();
		}
		
	}
}
