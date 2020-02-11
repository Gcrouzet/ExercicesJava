/**
 * 
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Personne;

/**classe application Personne
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 04/02/20
 *
 */
public class PersonneApp {
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
		
		
//		Personne pers2 = new Personne();
//		pers2.afficherDetails();
		
//		Personne pers3 = new Personne ("bob", "dylan");
//		pers3.afficherDetails();
	}

}
