/**
 * 
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Repere;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 05/02/20
 *
 */
public class RepereApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Repere rect = new Repere();

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir l'abscisse du point A :");
		rect.setAbcisseA(sc.nextInt());
		System.out.println("Veuillez saisir l'ordonnée du point A :");
		rect.setOrdonnéeA(sc.nextInt());
		rect.pointA();
		
		System.out.println("Veuillez saisir l'abscisse du point B :");
		rect.setAbcisseB(sc.nextInt());
		System.out.println("Veuillez saisir l'ordonnée du point B :");
		rect.setOrdonnéeB(sc.nextInt());
		rect.pointB();
		sc.close();
		rect.afficherDistanceAB();
		
	}

}
