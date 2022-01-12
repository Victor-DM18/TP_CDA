package domain;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Item_2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFile;
	private JTextArea txtMot;
	private JTextArea txtContenu;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item_2 frame = new Item_2();
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
	public Item_2() {
		setTitle("Editeur de texte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblSearch = new JLabel("Recherche de mot");
		panel.add(lblSearch);
		
		JButton btnSaerch = new JButton("Chercher");
		panel.add(btnSaerch);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Fichier :");
		panel_1.add(lblNewLabel);
		
		txtFile = new JTextField();
		panel_1.add(txtFile);
		txtFile.setColumns(30);
		
		JButton btnOk = new JButton("Ok");
		panel_1.add(btnOk);
		btnOk.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				try {
					btnOk_onClick(e, txtContenu);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		txtMot = new JTextArea();
		txtMot.setLineWrap(true);
		scrollPane.setRowHeaderView(txtMot);
		txtMot.setColumns(10);
		
		txtContenu = new JTextArea();
		txtContenu.setLineWrap(true);
		scrollPane.setViewportView(txtContenu);
		txtContenu.setColumns(10);
	}
	
	private void btnOk_onClick (ActionEvent e, JTextArea txtContenu ) throws Exception {
		/*
		 * File file = new File(
		 * "D:\\\\JAVA_SWING\\\\TP_SWING\\\\02_Layout_Manager\\\\src\\\\domain\\\\file.txt"
		 * );
		 * 
		 * BufferedReader in = new BufferedReader( new InputStreamReader(new
		 * FileInputStream(file), "UTF8"));
		 * 
		 * 
		 * while((line = in.readLine()) != null && txtFile.getText().equals("file")) {
		 * 
		 * txtContenu.setText(line); } in.close();
		 */
		
		
		try 
			{
			BufferedReader inStream  
  				= new BufferedReader (new FileReader("D:\\\\JAVA_SWING\\\\TP_SWING\\\\02_Layout_Manager\\\\src\\\\domain\\\\file.txt"));
			String line = inStream.readLine();  
		 	while (line != null && txtFile.getText().equals("file.txt"))
		 	 {                        
 	       txtContenu.append(line + "");                
	      line = inStream.readLine();    
	  	String[] word = txtContenu.getText().split("");

	      
	      Arrays.sort(word);
	      txtMot.setText(Arrays.toString(word));
			}
			inStream.close();   
		
			} catch (Exception i) 
				{
          txtContenu.setText("Exception cause: "+ i);
		      i.printStackTrace();
		      
				
		      
				}
	}
		

}
