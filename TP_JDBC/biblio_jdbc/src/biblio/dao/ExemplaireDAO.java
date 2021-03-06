package biblio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import biblio.domain.EnumStatusExemplaire;
import biblio.domain.Exemplaire;

public class ExemplaireDAO {

	Connection cnx1 = null;

	public ExemplaireDAO(Connection cnx1) {
		this.cnx1 = cnx1;
	}
	
	public void changeStatusByExemplaireId(int idExemplaire, boolean disponible) throws SQLException {
		String req = "UPDATE exemplaire SET status = ? WHERE idExemplaire = ?";
		PreparedStatement statement = cnx1.prepareStatement(req);
		
		statement.setString(1, disponible ?  "DISPONIBLE" :  "PRETE");
		statement.setInt(2, idExemplaire);
		statement.executeUpdate();
	}

	public Exemplaire findByKey(int idExemplaire) throws SQLException {
		
		Exemplaire ex = null;

		String req1 = "select * " + " FROM exemplaire where idExemplaire = ? ";
		PreparedStatement stmt1 = cnx1.prepareStatement(req1);
		ResultSet rs1 = null;
		
		stmt1.setInt(1, idExemplaire);
		
		
		if (stmt1.execute()) {
			rs1 = stmt1.getResultSet();
			if (rs1.next()) {
				ex = new Exemplaire(rs1.getInt("idExemplaire"), rs1.getDate("dateAchat"), EnumStatusExemplaire.valueOf(rs1.getString("status").trim()), null);
				
			}
		}
		return ex;

	}
	
	public ArrayList<Exemplaire> findAll() throws SQLException {
		
		String req2 = "SELECT * FROM exemplaire";
		PreparedStatement stmt2 = cnx1.prepareStatement(req2);
		ResultSet rs2 = stmt2.executeQuery(req2);
		
		ArrayList<Exemplaire> listeExemplaire = new ArrayList<Exemplaire>();
		
		while (rs2.next()) {
			
			
			Exemplaire ex2 = new Exemplaire(rs2.getInt("idExemplaire"), rs2.getDate("dateAchat"), EnumStatusExemplaire.valueOf(rs2.getString("status").trim()), null);
			listeExemplaire.add(ex2);
		}
		
		return listeExemplaire;
	}

}
