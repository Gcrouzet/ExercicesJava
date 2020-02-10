/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Personne;

/**
 * @author Crouzet Gabriel
 * @version 2.0
 * @since 05/02/20
 *
 */
public class PersonneApp2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne("Gabriel","Crouzet","Cgabi");
		pers.afficherDetails("en");

	}

}
