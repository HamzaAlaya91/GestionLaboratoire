package laboratoire.classes;

import java.util.Arrays;

public class Laboratoire {
	
	private  final int NB_MAX_BUREAU = 50;
	private String nom;
	private String specialte;
	private Bureau[] bureaux;
	
	int nbBureau;
	
	
	public Laboratoire(String nom, String specialte, Bureau bureau) {
		super();
		this.nom = nom;
		this.specialte = specialte;
		bureaux = new Bureau[NB_MAX_BUREAU];
		bureaux[0]= bureau;
		nbBureau++;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getSpecialte() {
		return specialte;
	}

	public void setSpecialte(String specialte) {
		this.specialte = specialte;
	}


	public int getNB_MAX_BUREAU() {
		return NB_MAX_BUREAU;
	}
	
	public void ajouterBureau(Bureau bureau) {
		if (nbBureau<NB_MAX_BUREAU) {
			bureaux[nbBureau] = bureau;
			nbBureau++;
		}
	}


	@Override
	public String toString() {
		return "Laboratoire [NB_MAX_BUREAU=" + NB_MAX_BUREAU + ", nom=" + nom + ", specialte=" + specialte
				+ ", bureaux=" + Arrays.toString(bureaux) + ", nbBureau=" + nbBureau + "]";
	}
	
	
	
	

}
