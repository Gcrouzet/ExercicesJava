/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Point;


/**
 * classe application Repere placer 2 points et calculer la distance
 * 
 * @author Crouzet Gabriel
 * @version 2.0
 * @since 05/02/20
 *
 */
public class RepereApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Point pointA = new Point(1, 3);
		Point pointB = new Point(4, 3);
		pointA.afficherDetail();
		pointB.afficherDetail();
		System.out.println(pointA.calculDistanceAB(pointB));

	}

}
