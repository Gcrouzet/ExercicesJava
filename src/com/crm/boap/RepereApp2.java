/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Repere;

/**
 * @author CRM
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
