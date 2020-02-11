/**
 *
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Banque;

/** classe application banque
 * @author Crouzet Gabriel
 * @version 1.0.0
 * @since 06/02/20
 */
public class BanqueApp {
	public static void main(String[] args) {

		Banque bnp = new Banque(219);
		System.out.println("Votre numéro de compte est de : " + bnp.getNumeroCompte());
		System.out.println("Votre solde est : " + bnp.getSolde()+" €");
		Scanner sc = new Scanner(System.in);
		System.out.println("Que souhaitez-vous faire ? retrait/depot ");
		String choix = sc.nextLine();
		if (choix.equals("retrait")) {
			System.out.println("Combien souhaitez-vous retirer ? ");
			if (bnp.retrait(sc.nextInt()) == true)
				System.out.println("Votre nouveau solde est de : " + bnp.getSolde()+" €");
			else
				System.out.println("Vous ne pouvez dépasser le découvert qui est de 150 €");
		} else if (choix.equals("depot")) {
			System.out.println("Combien souhaitez-vous déposer ? ");
			bnp.depot(sc.nextInt());
			System.out.println("Votre nouveau solde est de : " + bnp.getSolde()+" €");
		} else
			System.out.println("Erreur");
	}
}