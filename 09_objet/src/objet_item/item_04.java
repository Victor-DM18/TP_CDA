package objet_item;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class item_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String regex = "(?<prot>\\S+):\\/\\/(?<server>\\S*?)\\/(?<file>.*)";
		String url;

		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez une URL > ");
		url = sc.nextLine();

		sc.close();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(url);

		while (matcher.find()) {
			System.out.println("Protocole : " + matcher.group("prot"));
			System.out.println("Serveur : " + matcher.group("server"));
			System.out.println("Fichier : " + matcher.group("file"));
		}
	}

}
