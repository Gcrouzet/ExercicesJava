/**
 * 
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Repere;

/**
 * @author CRM
 *
 */
public class RepereApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Repere re = new Repere();

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir l'abscisse du point A :");
		re.setAbcisseA(sc.nextInt());
		System.out.println("Veuillez saisir l'ordonnée du point A :");
		re.setOrdonnéeA(sc.nextInt());
		re.pointA();
		
		System.out.println("Veuillez saisir l'abscisse du point B :");
		re.setAbcisseB(sc.nextInt());
		System.out.println("Veuillez saisir l'ordonnée du point B :");
		re.setOrdonnéeB(sc.nextInt());
		re.pointB();
		sc.close();
		re.afficherDistanceAB();
		
	}

}
