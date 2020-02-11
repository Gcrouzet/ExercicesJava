/**
 * 
 */
package com.crm.bo;

/**
 * Classe métier Banque
 * 
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 06/02/20
 *
 */
public class Banque {
	final int DECOUVERT = -150;
	private String numeroCompte;
	private int solde;
	private static int compteur = 0;

	public Banque(int solde) {
		this.solde = solde;
		compteur++;
		numeroCompte = String.format("%010d", compteur);
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public int getDECOUVERT() {
		return DECOUVERT;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public int depot(int montant) {
		solde = solde + montant;
		return solde;
	}

	public boolean retrait(int montant) {
		if (solde - montant >= -150) {
			solde = solde - montant;
			return true;
		} else
			return false;
	}

}