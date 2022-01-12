package domain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Item_3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNb1;
	private JTextField txtNb2;
	private JTextField txtNb3;
	private JTextField txtNb4;
	private JTextField txtNb5;
	private JTextField txtNbChance;
	private ButtonGroup buttonGroup;
	private JRadioButton rdPremier;
	private JRadioButton rdSecond;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item_3 frame = new Item_3();
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
	 */
	public Item_3() {
		setTitle("Fran\u00E7aise des jeux");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\JAVA_SWING\\TP_SWING\\01_Fenetre_Composant\\Image\\french-lotto.png"));
		lblNewLabel.setBounds(53, 11, 230, 77);
		contentPane.add(lblNewLabel);

		buttonGroup = new ButtonGroup();
		rdPremier = new JRadioButton("Premier");
		rdPremier.setBounds(28, 110, 109, 23);
		contentPane.add(rdPremier);
		buttonGroup.add(rdPremier);

		rdSecond = new JRadioButton("Second");
		rdSecond.setBounds(197, 110, 109, 23);
		contentPane.add(rdSecond);
		buttonGroup.add(rdSecond);

		rdPremier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdSecond_selected(e);
			}
		});

		rdSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdPremier_selected(e);

			}
		});

		JLabel lblDate = new JLabel("Tirage du 10/01/2022");
		lblDate.setBounds(10, 154, 167, 23);
		contentPane.add(lblDate);

		txtNb1 = new JTextField();
		txtNb1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNb1.setBounds(10, 198, 20, 20);
		contentPane.add(txtNb1);
		txtNb1.setColumns(10);

		txtNb2 = new JTextField();
		txtNb2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNb2.setBounds(57, 198, 20, 20);
		contentPane.add(txtNb2);
		txtNb2.setColumns(10);

		txtNb3 = new JTextField();
		txtNb3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNb3.setBounds(108, 198, 20, 20);
		contentPane.add(txtNb3);
		txtNb3.setColumns(10);

		txtNb4 = new JTextField();
		txtNb4.setHorizontalAlignment(SwingConstants.CENTER);
		txtNb4.setBounds(160, 198, 17, 20);
		contentPane.add(txtNb4);
		txtNb4.setColumns(10);

		txtNb5 = new JTextField();
		txtNb5.setHorizontalAlignment(SwingConstants.CENTER);
		txtNb5.setBounds(210, 198, 20, 20);
		contentPane.add(txtNb5);
		txtNb5.setColumns(10);

		txtNbChance = new JTextField();
		txtNbChance.setHorizontalAlignment(SwingConstants.CENTER);
		txtNbChance.setBounds(302, 198, 20, 20);
		contentPane.add(txtNbChance);
		txtNbChance.setColumns(10);
	}

	private void rdPremier_selected(ActionEvent e) {

		if (rdPremier.isSelected()) {
			txtNb1.setText("14");
			txtNb2.setText("34");
			txtNb3.setText("35");
			txtNb4.setText("41");
			txtNb5.setText("43");
			txtNbChance.setText("9");
		} else
			txtNb1.setText("20");
		txtNb2.setText("21");
		txtNb3.setText("28");
		txtNb4.setText("31");
		txtNb5.setText("33");
		txtNbChance.setText("");

	}

	private void rdSecond_selected(ActionEvent e) {

		if (rdSecond.isSelected()) {
			txtNb1.setText("20");
			txtNb2.setText("21");
			txtNb3.setText("28");
			txtNb4.setText("31");
			txtNb5.setText("33");
			txtNbChance.setText("");
		}else
			txtNb1.setText("14");
		txtNb2.setText("34");
		txtNb3.setText("35");
		txtNb4.setText("41");
		txtNb5.setText("43");
		txtNbChance.setText("9");
	}

}
