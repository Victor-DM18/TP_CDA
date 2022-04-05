package biblio.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import biblio.domain.EmpruntArchive;
import biblio.domain.EmpruntEnCours;
import biblio.domain.Exemplaire;
import biblio.domain.Utilisateur;

public class EmpruntArchiveDAO {

	Connection cnx1 = null;

	public EmpruntArchiveDAO(Connection cnx1) {
		this.cnx1 = cnx1;
	}

	/**
	 * @return the cnx1
	 */
	public Connection getCn() {
		return cnx1;
	}

	/**
	 * @param cnx1 the cnx1 to set
	 */
	public void setCn(Connection cnx1) {
		this.cnx1 = cnx1;
	}

	public EmpruntArchive findByKey() throws SQLException {

		EmpruntArchive ear = null;

		String req = " SELECT  idEmpruntArchive," + " dateEmprunt, dateRestitutionEff, idExemplaire, idUtilisateur"
				+ " FROM empruntArchive WHERE idEmpruntArchive = ? ";

		PreparedStatement stmt = cnx1.prepareStatement(req);

		// stmt3.setInt(1, idExemplaire);
		stmt.setString(1, JOptionPane.showInputDialog("entrez un identifiant de retour : "));

		ResultSet rs = stmt.executeQuery();

		boolean next = rs.next();

		if (next) {

			int idEmpruntArchive = rs.getInt("idEmpruntArchive");
			Date dateEmprunt = rs.getDate("dateEmprunt");
			Date dateRestitutionEff = rs.getDate("dateRestitutionEff");
			int idExemplaire = rs.getInt("idExemplaire");
			int idUtilisateur = rs.getInt("idUtilisateur");

			if (stmt.execute()) {
				rs = stmt.getResultSet();

				if (rs.next()) {

					ear = new EmpruntArchive(idEmpruntArchive, dateEmprunt, dateRestitutionEff, idExemplaire,
							idUtilisateur);
				}
			}
		}
		return ear;
	}

	public Integer insertArchive(EmpruntArchive retour) throws SQLException {

		Integer inserted = null;

		String insert = "INSERT INTO empruntArchive (idEmpruntArchive, dateEmprunt, dateRestitutionEff, idExemplaire, idUtilisateur) VALUES(seq_archive.nextval, "
				+ "?, ?, ?, ?)";
		//String insert = "INSERT INTO empruntArchive (idEmpruntArchive, dateEmprunt, dateRestitutionEff, idExemplaire, idUtilisateur) VALUES(seq_archive.nextval, ?, ?, ?, ?) SELECT ar.idEmpruntArchive, emp.dateEmprunt, ar.dateRestitutionEff, emp.ideExemplaire, emp.idUtilisateur FROM EmpruntEnCours emp, EmpruntArchive ar WHERE ar.idExemplaire= emp.idExemplaire ";

		// String insert = "INSERT INTO empruntArchive ea VALUES(?, ?, ?, ?, ?)";

		PreparedStatement stmt3 = cnx1.prepareStatement(insert, new String[] { "idEmpruntArchive" });
		// PreparedStatement stmt3 = cnx1.prepareStatement(insert);

		// stmt3.setInt(1, retour.getIdEmpruntArchive());
		
		Date date = new Date(System.currentTimeMillis());

		
		stmt3.setDate(1, retour.getDateEmprunt());
		stmt3.setDate(2, date);
		stmt3.setInt(3, retour.getIdExemplaire());
		stmt3.setInt(4, retour.getIdUtilisateur());

		stmt3.executeUpdate();

		ResultSet rs3 = stmt3.getGeneratedKeys();

		if (rs3.next()) {
			inserted = rs3.getInt(1);

			/*
			 * if (rs3.next()) {
			 * 
			 * inserted = new EmpruntArchive(rs3.getInt("idEmpruntArchive"),
			 * rs3.getDate("dateEmprunt"), rs3.getDate("dateRestitutionEff"),
			 * rs3.getInt("idExemplaire"), rs3.getInt("idUtilisateur")); }
			 */
		}
		return inserted;

	}

	public EmpruntArchive DeleteEmprunt(EmpruntArchive deleted) throws SQLException {

		String delete = "DELETE FROM empruntEnCours WHERE idExemplaire = ?";

		PreparedStatement stmt2 = cnx1.prepareStatement(delete);
		// stmt2.setString(1, JOptionPane.showInputDialog("entrez un identifiant
		// d'exemplaire � rendre"));
		stmt2.setInt(1, deleted.getIdExemplaire());
		stmt2.executeUpdate();

		return null;

	}

	/*
	 * private static Timestamp getCurrentTimeStamp() {
	 * 
	 * Date today = (Date) new java.sql.Date(0); return new
	 * Timestamp(today.getTime());
	 * 
	 * }
	 */

	public  boolean UpdateExemplaire(Exemplaire up) throws SQLException {

		String update = "UPDATE INTO Exemplaire SET status = DISPONIBLE WHERE idExemplaire = ? ";

		PreparedStatement stmt4 = cnx1.prepareStatement(update);
		stmt4.setInt(1, up.getIdExemplaire());

		int Result = stmt4.executeUpdate();

		return Result > 0;

	}

	public ArrayList<EmpruntArchive> findAll() throws SQLException {

		ArrayList<EmpruntArchive> ar = new ArrayList<EmpruntArchive>();

		String req = " SELECT  idEmpruntArchive," + " dateEmprunt, dateRestitutionEff, idExemplaire, idUtilisateur"
				+ " FROM empruntArchive";

		PreparedStatement stmt = cnx1.prepareStatement(req);

		// stmt3.setInt(1, idExemplaire);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {

			int idEmpruntArchive = rs.getInt("idEmpruntArchive");
			Date dateEmprunt = rs.getDate("dateEmprunt");
			Date dateRestitutionEff = rs.getDate("dateRestitutionEff");
			int idExemplaire = rs.getInt("idExemplaire");
			int idUtilisateur = rs.getInt("idUtilisateur");

			EmpruntArchive ear = new EmpruntArchive(idEmpruntArchive, dateEmprunt, dateRestitutionEff, idExemplaire,
					idUtilisateur);
			ar.add(ear);
		}

		return ar;
	}
	
	public ArrayList<EmpruntEnCours> findAll2() throws SQLException {

		String verif = " SELECT * FROM empruntEnCours";

		PreparedStatement stmt2 = cnx1.prepareStatement(verif);

		ArrayList<EmpruntEnCours> listEmprunt = new ArrayList<EmpruntEnCours>();

		ResultSet rs2 = stmt2.executeQuery();

		while (rs2.next()) {

			int idExemplaire = rs2.getInt("idExemplaire");
			int idUtilisateur = rs2.getInt("idUtilisateur");
			Date dateEmprunt = rs2.getDate("dateEmprunt");
			

			EmpruntEnCours em = new EmpruntEnCours(idExemplaire, idUtilisateur, dateEmprunt);
			listEmprunt.add(em);
		}
		return listEmprunt;
	}

}
