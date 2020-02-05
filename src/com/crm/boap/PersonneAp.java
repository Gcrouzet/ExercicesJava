/**
 * 
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 27/01/20
 *
 */
public class PersonneAp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne();

//		System.out.println("Bienvenue " + pers.getPrenom() + " " + pers.getNom() + " (" + pers.surnom + ")");
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom :");
		pers.setNom(sc.nextLine());
		System.out.println("Veuillez saisir votre prénom :");
		pers.setPrenom(sc.nextLine());
		System.out.println("Veuillez saisir votre surnom :");
		pers.setSurnom(sc.nextLine());
		sc.close();

		pers.afficherDetails();
	}

}
