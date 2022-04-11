package biblio.domain;

import java.sql.Date;
import java.util.Set;

public class Exemplaire  {
	
	

	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private Livre isbn;
	

	/*
	 * public Exemplaire() { this( 0, null, null, null); }
	 */
	
	Set<EmpruntEnCours> emp;
	
	

	public Exemplaire() {
		super();
	}



	public Exemplaire(int idexemplaire2, Date dateAchat, EnumStatusExemplaire enumStatus, Livre isbn ) {
		this.setIdExemplaire( idexemplaire2);
		this.setDateAchat( dateAchat);
		this.setStatus( enumStatus);
		this.setIsbn( isbn);

	}



	public Exemplaire(String idexemplaire2, Date dateachat2, String Status) {
		super();
	}



	public int getIdExemplaire() {
		return idExemplaire;
	}


	public void setIdExemplaire(int idexemplaire2) {
		this.idExemplaire = idexemplaire2;
	}


	public Date getDateAchat() {
		return dateAchat;
	}


	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}


	public EnumStatusExemplaire getStatus() {
		return status;
	}


	public void setStatus(EnumStatusExemplaire enumStatus) {
		this.status = enumStatus;
	}


	public Livre getIsbn() {
		return isbn;
	}


	public void setIsbn(Livre isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "\n\nidExemplaire = " + idExemplaire + "\ndateAchat = " + dateAchat + "\nstatus = " + status
				+ "\nisbn = " + isbn + "\n\n";
	}



}
