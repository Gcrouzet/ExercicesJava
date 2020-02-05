/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Personne;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 27/01/20
 *
 */
public class PersonneApp2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne("Gabriel", "Crouzet", "Cgabi");
		pers.afficherDetails();

	}

}
