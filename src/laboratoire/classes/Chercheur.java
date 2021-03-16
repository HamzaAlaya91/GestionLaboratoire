package laboratoire.classes;

public class Chercheur {
	
	private String nom;
	private String poste;
	private int numOrdinateur;
	
	static int NbChercheurs;
	
	public Chercheur(String nom, int numOrdinateur , String poste) {
		this.nom = nom;
		this.poste = poste;
		this.numOrdinateur = numOrdinateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public int getNumOrdinateur() {
		return numOrdinateur;
	}

	public void setNumOrdinateur(int numOrdinateur) {
		this.numOrdinateur = numOrdinateur;
	}

	public static int getNbChercheurs() {
		return NbChercheurs;
	}

	public static void setNbChercheurs(int nbChercheurs) {
		NbChercheurs = nbChercheurs;
	}

	@Override
	public String toString() {
		return "Chercheur [nom=" + nom + ", poste=" + poste + ", numOrdinateur=" + numOrdinateur + "]";
	}

	public boolean equals(Chercheur chercheur) {
		
		return ( this.nom == chercheur.nom && this.poste == chercheur.poste && this.numOrdinateur == chercheur.numOrdinateur );
		
	}
	
	
	
	
	
	
	
	

}
