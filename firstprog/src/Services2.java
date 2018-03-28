

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Services2 {

	private JFrame frmWanted;

	/**
	 * Launch the application.
	

	/**
	 * Create the application.
	 */
	public Services2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmWanted = new JFrame();
		frmWanted.setAlwaysOnTop(true);
		frmWanted.setTitle("Wanted");
		frmWanted.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\COM\\firstprog\\images\\download.png"));
		frmWanted.setResizable(false);
		frmWanted.setBackground(SystemColor.activeCaption);
		frmWanted.getContentPane().setBackground(Color.WHITE);
		frmWanted.setBounds(100, 100, 450, 300);
		frmWanted.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmWanted.getContentPane().setLayout(null);
		frmWanted.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("WANTED");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(99, 0, 241, 59);
		frmWanted.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setForeground(SystemColor.activeCaptionText);
		label.setBackground(SystemColor.controlText);
		Image img=new ImageIcon(this.getClass().getResource("/bin_laden.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 59, 88, 137);
		frmWanted.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/lady.jpg")).getImage();
		label_1.setIcon(new ImageIcon(img1));
		label_1.setBounds(109, 59, 109, 137);
		frmWanted.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/Dawood.jpg")).getImage();
		label_2.setIcon(new ImageIcon(img2));
		label_2.setBounds(228, 38, 98, 179);
		frmWanted.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/gangster.jpg")).getImage();
		label_3.setIcon(new ImageIcon(img3));
		label_3.setBounds(336, 38, 88, 172);
		frmWanted.getContentPane().add(label_3);
		
		JLabel lblOsama = new JLabel("OSAMA");
		lblOsama.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblOsama.setHorizontalAlignment(SwingConstants.CENTER);
		lblOsama.setBounds(10, 196, 88, 27);
		frmWanted.getContentPane().add(lblOsama);
		
		JLabel lblBin = new JLabel("BIN");
		lblBin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBin.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblBin.setBounds(10, 217, 88, 18);
		frmWanted.getContentPane().add(lblBin);
		
		JLabel lblLaden = new JLabel("LADEN");
		lblLaden.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaden.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblLaden.setBounds(10, 229, 88, 32);
		frmWanted.getContentPane().add(lblLaden);
		
		JLabel lblBegum = new JLabel("BEGUM");
		lblBegum.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegum.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblBegum.setBounds(99, 196, 119, 27);
		frmWanted.getContentPane().add(lblBegum);
		
		JLabel lblJaan = new JLabel("JAAN");
		lblJaan.setHorizontalAlignment(SwingConstants.CENTER);
		lblJaan.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblJaan.setBounds(99, 217, 119, 27);
		frmWanted.getContentPane().add(lblJaan);
		
		JLabel lblblackLady = new JLabel("(Black Lady)");
		lblblackLady.setHorizontalAlignment(SwingConstants.CENTER);
		lblblackLady.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblblackLady.setBounds(109, 234, 109, 27);
		frmWanted.getContentPane().add(lblblackLady);
		
		JLabel lblDawood = new JLabel("DAWOOD");
		lblDawood.setHorizontalAlignment(SwingConstants.CENTER);
		lblDawood.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblDawood.setBounds(228, 186, 98, 46);
		frmWanted.getContentPane().add(lblDawood);
		
		JLabel lblIbrahim = new JLabel("IBRAHIM");
		lblIbrahim.setHorizontalAlignment(SwingConstants.CENTER);
		lblIbrahim.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblIbrahim.setBounds(228, 213, 98, 37);
		frmWanted.getContentPane().add(lblIbrahim);
		
		JLabel lblPistol = new JLabel("PISTOL");
		lblPistol.setHorizontalAlignment(SwingConstants.CENTER);
		lblPistol.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblPistol.setBounds(336, 186, 88, 37);
		frmWanted.getContentPane().add(lblPistol);
		
		JLabel lblPete = new JLabel("PETE");
		lblPete.setHorizontalAlignment(SwingConstants.CENTER);
		lblPete.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblPete.setBounds(336, 203, 88, 46);
		frmWanted.getContentPane().add(lblPete);
		
		JLabel lblmunna = new JLabel("(munna)");
		lblmunna.setHorizontalAlignment(SwingConstants.CENTER);
		lblmunna.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblmunna.setBounds(336, 234, 88, 27);
		frmWanted.getContentPane().add(lblmunna);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel_1.setBounds(-19, 0, 463, 271);
		frmWanted.getContentPane().add(lblNewLabel_1);
	}

}
