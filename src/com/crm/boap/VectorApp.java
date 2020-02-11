/**
 * 
 */
package com.crm.boap;

import java.util.Vector;

import com.crm.bo.Personne;

/**
 * utilisation Vector
 * 
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 10/02/20
 *
 */
public class VectorApp {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector groupe = new Vector();
		Personne michael = new Personne("Michael", "Jordan");
		Personne lebron = new Personne("James", "Lebron");

		groupe.addElement(michael);
		groupe.addElement(lebron);

		Personne unBasketteur1 = (Personne) groupe.get(0);
		System.out.println(unBasketteur1.getNom());
		System.out.println("Mon equipe a  " + groupe.size() + " joueurs");

		Personne kobe = new Personne("Kobe", "Bryant");
		groupe.addElement(kobe);
		System.out.println("Mon equipe a  " + groupe.size() + " joueurs");
		System.out.println("Lebron est à la " + (groupe.indexOf(lebron) + 1) + " position");

		lebron.setSurnom("King James");
		Personne lebronModif = (Personne) groupe.get(1);
		System.out.println("Le surnom de Lebron James est " + lebronModif.getSurnom());

	}

}
