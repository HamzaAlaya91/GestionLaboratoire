package laboratoire.classes;

import java.util.Arrays;

public class Bureau {
	
	
	private final  int NB_MAX_CHERCHUER = 5;
	private int code ;
	private String nom;
	private Chercheur[] chercheurs;
	
	private int nbChercheur;
	
	public Bureau() {
		
	}
	
	public Bureau(int code, String nom) {
		this.code = code ;
		this.nom = nom;
		chercheurs = new Chercheur[NB_MAX_CHERCHUER];
	}
	
	

	public int getNbChercheur() {
		return nbChercheur;
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNB_MAX_CHERCHUER() {
		return NB_MAX_CHERCHUER;
	}


	@Override
	public String toString() {
		return "Bureau [NB_MAX_CHERCHUER=" + NB_MAX_CHERCHUER + ", code=" + code + ", nom=" + nom + ", chercheurs="
				+ Arrays.toString(chercheurs) + ", nbChercheur=" + nbChercheur + "]";
	}
	
	
	
	
	
	public int trouverChercheur(Chercheur chercheur) {	
		for (int i = 0 ; i<nbChercheur; i++) {
			if (chercheurs[i].equals(chercheur)) {
				return i;
			}
		}
		return -1;
	}
	
	
	public void ajouterChercheur(Chercheur chercheur) {
		if (nbChercheur < NB_MAX_CHERCHUER && trouverChercheur(chercheur) == -1) {
			chercheurs[nbChercheur] = chercheur;
			nbChercheur++;
		}
	}
	
	
	public static Bureau compare(Bureau b1,Bureau b2) {
		if (b1.nbChercheur > b2.nbChercheur) {
			return b1;
		}
		return b2;
	}
	
	
	
}
