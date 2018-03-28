import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class About_us {

	 JFrame frmAboutUs;
	 JTable table;
	 private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public About_us() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmAboutUs = new JFrame();
		frmAboutUs.setTitle("About us");
		frmAboutUs.setAlwaysOnTop(true);
		frmAboutUs.getContentPane().setBackground(new Color(245, 222, 179));
		frmAboutUs.setResizable(false);
		frmAboutUs.setBackground(new Color(70, 130, 180));
		frmAboutUs.setBounds(100, 100, 707, 472);
		frmAboutUs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAboutUs.getContentPane().setLayout(null);
		frmAboutUs.setVisible(true);
		
		JLabel l1 = new JLabel("DIRECTORY OF OFFICERS AND EMPLOYEES");
		l1.setBounds(61, 31, 576, 33);
		l1.setForeground(new Color(255, 69, 0));
		l1.setFont(new Font("Tekton Pro", Font.PLAIN, 32));
		l1.setBackground(new Color(128, 0, 0));
		frmAboutUs.getContentPane().add(l1);
		
		
		
		String data[][] = {
				{"1","Commissioner of Police","cp.amulyapatnaik@delhipolice.gov.in","23490201 ","23722052"},
				{"2","Special CP/Admin.","splcp-admin-dl@nic.in","23490201 ","23722052"},
				{"3","Special CP/GA","Splcp-ga-dl@nic.in","23490201 ","23722052"},
				{"4","Spl.CP/Security","splcp.sec@delhipolice.gov.in","23490201 ","23722052"},
				{"5","Spl. CP/Crime ","splcp-crime-dl@nic.in","23490201","23722052"},
				{"6","Spl. CP/Law & Order (South)","splcp-losouth@ delhi police.gov.in","23490201 ","23722052"},
				{"7","Spl. CP/Law & Order (North)","Splcp.lonorth@ delhi police.gov.in","23490201 ","23722052"},
				{"8","Spl. CP/Training","Splcp-trg-dl@nic.in","23490201 ","23722052"},
				{"9","Spl. CP/Training","splcp.int@delhipolice.gov.in","23490201","23722052"},
				{"10","Spl. CP/Traffic S","Splcp-trafic-dl@nic.inspecialcp.traffic","23490201 ","23722052"},
				{"11","Spl.CP/Vigilance","splcp-vigilance-dl@nic.in","23490201 ","23722052"},
				{"12","Joint CP/Vig","Jtcp-vigilance-dl@nic.in","23490201 ","23722052"},
				{"13","Joint CP/Central Range","jtcp-cr-dl@nic.in","23490201 ","23722052"},
				{"14","Joint C.P./Eastern Range ","jtcp-er-dl@nic.in","23490201 ","23722052"},
				{"15","XYZ","jtcp-nr-dl@nic.in","23490201 ","23722052"},
				{"16","ABC","jtcp-ndr-dl@nic.in","23490201 ","23722052"},
				{"17","XYZ","jtcp-ser-dl@nic.in","23490201 ","23722052"},
				{"18","ABC","jtcp-pi-dl@nic.in","23490201 ","23722052"},
				{"19","XYZ","Jtcp-hq-dl@nic.in","23490201 ","23722052"},
				{"20","ABC","Jtcp-hq-dl@nic.in","23490201 ","23722052"},
				{"21","XYZ","jtcpcrime@delhipolice.gov.in","23490201 ","23722052"},
				{"22","ABC","Jtcpt-dlp@nic.in","23490201 ","23722052"},
				{"23","XYZ","cp.ops@delhipolice.gov.in","23490201 ","23722052"},
				{"24","ABC","jtcpt-dtp@nic.in","23490201 ","23722052"},
				{"25","XYZ","dcp.-pro-dl@nic.in","23490201 ","23722052"},
				{"26","ABC","so-cp-dl@nic.in","23490201 ","23722052"},
				{"27","XYZ","dcp-hq@delhipolice.gov.in","23490201 ","23722052"},
				{"28","ABC","Dcp.est@delhipolice.gov.in","23490201 ","23722052"},
				{"29","XYZ","dcp.splcell@Delhipolice.gov.in","23490201 ","23722052"},
				{"30","ABC","dcp.lb@delhipolice.gov.in","23490201 ","23722052"}

		};
		
		String column[] = {"S.No.","Officer","Email","TEl.Off","Fax No."};
		table = new JTable(data,column);
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setRowSelectionAllowed(false);
		
		table.setBounds(42, 74, 576, 335);
		JScrollPane scrollBar = new JScrollPane(table);
		scrollBar.setBounds(57, 101, 580, 313);
		scrollBar.setBackground(new Color(255, 255, 255));
	
		frmAboutUs.getContentPane().add(scrollBar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\COM\\firstprog\\images\\background_bumps_light_86951_1920x1080.jpg"));
		lblNewLabel.setBounds(0, 0, 712, 432);
		frmAboutUs.getContentPane().add(lblNewLabel);
	}
}
