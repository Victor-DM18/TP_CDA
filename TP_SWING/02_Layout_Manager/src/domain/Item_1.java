package domain;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.net.InetAddress;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Item_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel zoneClient;
	private JTextField txtNomMachine;
	private JTextField txtMV;
	private JTextField txtAdresseIP;
	private JTextField txttUtilisateur;
	private JTextField txtOS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item_1 frame = new Item_1();
					frame.setResizable(true);
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
	public Item_1() throws Exception {
		setTitle("Propri\u00E8t\u00E9s syst\u00E8me");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 270);
		zoneClient = new JPanel();
		zoneClient.setBorder(new EmptyBorder(5, 5, 5, 5));
		zoneClient.setLayout(new BorderLayout(0, 0));
		setContentPane(zoneClient);
		
		JLabel lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.LEFT);
		lblImage.setIcon(new ImageIcon("D:\\JAVA_SWING\\TP_SWING\\02_Layout_Manager\\Image\\Java-logo.png"));
		zoneClient.add(lblImage, BorderLayout.WEST);
		
		JPanel panCentre = new JPanel();
		zoneClient.add(panCentre, BorderLayout.CENTER);
		panCentre.setLayout(new BorderLayout(20, 0));
		
		JPanel panCentreGauche = new JPanel();
		panCentre.add(panCentreGauche, BorderLayout.WEST);
		panCentreGauche.setLayout(new GridLayout(5, 1, 5, 30));
		
		JLabel lblNomMachine = new JLabel("Nom de la machine");
		panCentreGauche.add(lblNomMachine);
		
		JLabel lblAdresseIP = new JLabel("Adresse IP");
		panCentreGauche.add(lblAdresseIP);
		
		JLabel lblUtilisateur = new JLabel("Utilisateur");
		panCentreGauche.add(lblUtilisateur);
		
		JLabel lblOS = new JLabel("Nom de l'OS");
		panCentreGauche.add(lblOS);
		
		JLabel lblMV = new JLabel("Machine virtuelle");
		panCentreGauche.add(lblMV);
		
		JPanel paneCentreCentre = new JPanel();
		panCentre.add(paneCentreCentre, BorderLayout.CENTER);
		paneCentreCentre.setLayout(new GridLayout(5, 1, 0, 30));
		
		txtNomMachine = new JTextField();
		paneCentreCentre.add(txtNomMachine);
		txtNomMachine.setColumns(50);
		txtNomMachine.setText(InetAddress.getLocalHost().getHostName());

		
		txtAdresseIP = new JTextField();
		paneCentreCentre.add(txtAdresseIP);
		txtAdresseIP.setColumns(50);
		txtAdresseIP.setText(InetAddress.getLocalHost().getHostAddress());

		
		txttUtilisateur = new JTextField();
		paneCentreCentre.add(txttUtilisateur);
		txttUtilisateur.setColumns(50);
		txttUtilisateur.setText(System.getProperty("user.name"));

		
		txtOS = new JTextField();
		txtOS.setForeground(new Color(0, 0, 0));
		paneCentreCentre.add(txtOS);
		txtOS.setColumns(50);
		txtOS.setText(System.getProperty("os.name"));

		txtMV = new JTextField();
		txtMV.setText("");
		paneCentreCentre.add(txtMV);
		txtMV.setColumns(10);
		txtMV.setText(System.getProperty("java.vm.name"));

	}

}
