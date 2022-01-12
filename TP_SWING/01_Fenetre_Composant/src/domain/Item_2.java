package domain;

import java.net.InetAddress;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Item_2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomMachine;
	private JTextField txtAdresseIP;
	private JTextField txtUtilisateur;
	private JTextField txtNomOS;
	private JTextField txtMV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item_2 frame = new Item_2();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Item_2() throws Exception {
		setTitle("Propri\u00E8t\u00E9s syst\u00E8me");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImage = new JLabel();
		lblImage.setIcon(new ImageIcon(".\\.\\.\\Image\\Java-logo.png"));
		lblImage.setBounds(-51, 11, 182, 222);
		contentPane.add(lblImage);
		
		JLabel lblNomMachine = new JLabel("Nom de la machine");
		lblNomMachine.setBounds(151, 25, 112, 21);
		contentPane.add(lblNomMachine);
		
		JLabel lblAdresseIP = new JLabel("Adresse IP");
		lblAdresseIP.setBounds(151, 66, 99, 21);
		contentPane.add(lblAdresseIP);
		
		JLabel lblUtilisateur = new JLabel("Utilisateur");
		lblUtilisateur.setBounds(151, 108, 99, 21);
		contentPane.add(lblUtilisateur);
		
		JLabel lblNomOS = new JLabel("Nom de l'OS");
		lblNomOS.setBounds(151, 150, 99, 21);
		contentPane.add(lblNomOS);
		
		JLabel lblMV = new JLabel("Machine Virtuellle");
		lblMV.setBounds(151, 194, 112, 21);
		contentPane.add(lblMV);
		
		txtNomMachine = new JTextField();
		txtNomMachine.setBounds(269, 25, 197, 20);
		contentPane.add(txtNomMachine);
		txtNomMachine.setColumns(10);
		txtNomMachine.setText(InetAddress.getLocalHost().getHostName());
		//InetAddressNameMachine();

		txtAdresseIP = new JTextField();
		txtAdresseIP.setBounds(269, 66, 197, 20);
		contentPane.add(txtAdresseIP);
		txtAdresseIP.setColumns(10);
		txtAdresseIP.setText(InetAddress.getLocalHost().getHostAddress());
		//InetAddressIP();

		txtUtilisateur = new JTextField();
		txtUtilisateur.setBounds(269, 108, 197, 20);
		contentPane.add(txtUtilisateur);
		txtUtilisateur.setColumns(10);
		txtUtilisateur.setText(System.getProperty("user.name"));
		
		txtNomOS = new JTextField();
		txtNomOS.setBounds(269, 150, 197, 20);
		contentPane.add(txtNomOS);
		txtNomOS.setColumns(10);
		txtNomOS.setText(System.getProperty("os.name"));
		
		txtMV = new JTextField();
		txtMV.setBounds(273, 194, 193, 20);
		contentPane.add(txtMV);
		txtMV.setColumns(10);
		txtMV.setText(System.getProperty("java.vm.name"));
		
	}
	
	/*
	 * private void InetAddressIP( ) throws Exception { InetAddress ip =
	 * InetAddress.getLocalHost();
	 * 
	 * txtAdresseIP.setText(ip.getHostAddress());
	 * 
	 * }
	 */
	
	/*
	 * private void InetAddressNameMachine( ) throws Exception { InetAddress
	 * NomMachine = InetAddress.getLocalHost();
	 * 
	 * txtNomMachine.setText(NomMachine.getHostName());
	 * 
	 * }
	 */
	
}
