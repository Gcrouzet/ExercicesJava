package com.crm.bo;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 27/01/20
 *
 */
public class PersonneTabApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Déclaration des variables
		Personne[] persTab = new Personne[2];
		Personne pers1 = new Personne();
		Personne pers2 = new Personne();

		// Initialisation
		pers1.setPrenom("Victor");
		pers1.setNom("HUGO");
		pers2.setPrenom("Stephen");
		pers2.setNom("KING");
		pers2.setSurnom("Grrr");
		persTab[0] = pers1;
		persTab[1] = pers2;

		// Parcours du tableau
//		for (Personne p : persTab) {
//			p.afficherDetails();

//			Personne pers2 = new Personne();
//			pers2.afficherDetail();
//			d'clenche une exception aprés déférencement
//			pers2 = null;
//			System.out.println(pers2.getNom());
		int a = 5;
		int b = 5;
		if (a == b) {
			System.out.println("Les 2 entiers sont identiques");
		}
		Personne pers4 = new Personne("khalil", "charih");
		Personne pers5 = new Personne("khalil", "charih");
		if (pers4 == pers5) {
			System.out.println("Les 2 objets sont identiques");
		}
//			Personne pers3 = new Personne("bob","dylan");
//			pers3.afficherDetail();

		int nb = 5;
		pers5.incrementeNombre(nb);
		System.out.println(nb);
		pers4.modifierPersonne(pers5);
		pers5.afficherDetails();

	}
}
