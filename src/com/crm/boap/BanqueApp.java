/**
 *
 */
package com.crm.boap;
import java.util.Scanner;

import com.crm.bo.Banque;

/**
 * @author Crouzet Gabriel
 * @version 1.0.0
 * @since 05 02 2020
 */
class CompteBancaireApp {
	public static void main(String[] args) {
		Banque cb = new Banque();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le numero du compte :");
		cb.setNumeroCompte(sc.nextInt());
		System.out.println("Veuillez saisir le solde :");
		cb.setSolde(sc.nextFloat());
		cb.retrait();
		cb.depot();
	}
}