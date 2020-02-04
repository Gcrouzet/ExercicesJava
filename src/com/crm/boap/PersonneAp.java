/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Personne;

/**
 * @author CRM
 *
 */
public class PersonneAp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne();
		pers.surnom = "Cgabi";
		pers.setNom("Crouzet");
		pers.setPrenom("Gabriel");
		System.out.println("Bienvenue " + pers.getPrenom() + " " + pers.getNom() + " (" + pers.surnom + ")");
	}

}
