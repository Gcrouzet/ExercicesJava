package com.crm.boap;

import com.crm.bo.Personne;

/**
 * @author CRM
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
		for (Personne p : persTab) {
			p.afficherDetails();
		}
	}
}