package laboratoire.test;

import laboratoire.classes.Bureau;
import laboratoire.classes.Chercheur;
import laboratoire.classes.Laboratoire;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chercheur ch1 = new Chercheur("hamza", 20, "poste1");
		Chercheur ch2 = new Chercheur("alaya", 20, "poste2");
		
		System.out.println(" Chercheur2 est égale au chercheur1 :  " + ch2.equals(ch1));
		
		
		Bureau bureauA = new Bureau(123, "Bureau 1");
		Bureau bureauB = new Bureau(456, "Bureau 2");
		
		bureauA.ajouterChercheur(ch1);
		bureauA.ajouterChercheur(ch2);
		
		
		System.out.println(bureauA.getNbChercheur());
		System.out.println(bureauB.getNbChercheur());
		
		Laboratoire laboratoire = new Laboratoire("medicale", "virologie", bureauA);
		
		System.out.println(" le  bureau est : " + bureauA.toString());
		System.out.println("Comapre:" + Bureau.compare(bureauA, bureauB));
		
		
	}

}
