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
public class BanqueApp {
	public static void main(String[] args) {
		
		
		Banque cb = new Banque();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le numero du compte :");
		cb.setNumeroCompte(sc.nextInt());
		System.out.println("Veuillez saisir le solde :");
		cb.setSolde(sc.nextInt());
		cb.retrait();
		cb.depot();
		sc.close();
		
	}
}