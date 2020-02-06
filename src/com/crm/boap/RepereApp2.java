/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Repere;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 05/02/20
 *
 */
public class RepereApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Repere rect = new Repere(1, 3, 4, 5);
		
		
		rect.pointA();
		rect.pointB();
		rect.afficherDistanceAB();

	}

}
