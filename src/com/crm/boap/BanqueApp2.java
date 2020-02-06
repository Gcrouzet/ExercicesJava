/**
 *
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Banque;

/**
 * @author Crouzet Gabriel
 * @version 1.0.0
 * @since 06/02/20
 */
public class BanqueApp2 {
	public static void main(String[] args) {

		Banque cb = new Banque();
		Scanner sc = new Scanner(System.in);
		while (5 < 6) {
			Banque.creerCompte();
		}
//		System.out.println("Veuillez saisir le solde :");
//		cb.setSolde(sc.nextInt());
//		cb.retrait();
//		cb.depot();

	}

}
