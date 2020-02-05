/**
 * 
 */
package com.crm.bo;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Banque {

	private int numeroCompte;
	private float solde;
	private char reponse;

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public void retrait() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous faire un retrait? O/N");
		reponse = sc.nextLine().charAt(0);
		if (reponse == 'O') {
			System.out.println("Indiquez la somme que vous voulez retirer :");
			int sommer = sc.nextInt();
			solde = solde - sommer;
			if (solde < (-150))
				System.out.println("Le decouvert autorisé est de -150");
			else
				System.out.println("Le nouveau solde est de : " + solde);
		}
	}

	public void depot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez faire un dépot? O/N");
		reponse = sc.nextLine().charAt(0);
		if (reponse == 'O') {
			System.out.println("Indiquez la somme que vous voulez déposer :");
			float depot = sc.nextFloat();
			solde = solde + depot;
			System.out.println("Le nouveau solde est de : " + solde);
		}
	}
}
