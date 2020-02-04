/**
 * 
 */
package com.crm.boap;

import java.util.Scanner;

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
