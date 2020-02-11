/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Repere;

/**
 * classe application Repere placer 2 points et calculer la distance
 * 
 * @author Crouzet Gabriel
 * @version 2.0
 * @since 05/02/20
 *
 */
public class RepereApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Repere rect = new Repere(1, 3, 4, 5);

		System.out.println("{" + rect.getAbcisseA() + ", " + rect.getOrdonnéeA() + "}");
		System.out.println("{" + rect.getAbcisseB() + ", " + rect.getOrdonnéeB() + "}");
		rect.afficherDistanceAB();

	}

}
