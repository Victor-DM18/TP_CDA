package repertoire_item;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class item_01 {

	static HashMap<String, String> repertoire = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myRepertoire();

	}

	private static void myRepertoire() {
		// TODO Auto-generated method stub

		String numVictor = "0128374621";
		String numAlex = "0728394652";

		repertoire.put("Victor", numVictor);
		repertoire.put("Alex", numAlex);

		while (true) {
			String search = JOptionPane.showInputDialog("Quelle numero de telephone vhercez-vous ? : ");

			if (search == null)
				System.exit(0);

			String number = repertoire.get(search);

			if (number != null)
				JOptionPane.showMessageDialog(null, search + " : " + number);
			else
				JOptionPane.showMessageDialog(null, search + " n'est pas present dans le repertoire ");
		}

	}

}
