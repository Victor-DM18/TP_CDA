package biblio.domain;

public class AdherentGeneral {

	private int nbMaxPret;
	private int dureeMaxPret;
	
	
	public AdherentGeneral(int nbMaxPret, int dureeMaxPret) {
		this.setNbMaxPret(nbMaxPret);
		this.setDureeMaxPret(dureeMaxPret);
	}


	public int getNbMaxPret() {
		return nbMaxPret;
	}


	public void setNbMaxPret(int nbMaxPret) {
		this.nbMaxPret = nbMaxPret;
	}


	public int getDureeMaxPret() {
		return dureeMaxPret;
	}


	public void setDureeMaxPret(int dureeMaxPret) {
		this.dureeMaxPret = dureeMaxPret;
	}


	@Override
	public String toString() {
		return "AdherentGeneral [nbMaxPret=" + nbMaxPret + ", dureeMaxPret=" + dureeMaxPret + "]";
	}
	
	
	
}
