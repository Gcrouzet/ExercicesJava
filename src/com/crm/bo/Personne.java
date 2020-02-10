/**
 * 
 */
package com.crm.bo;

import java.util.Date;

/**
 * setteur getteur nom/prenom/surnom Classe métier
 * 
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 05/02/20
 *
 */
public class Personne {

	// Attributs
	private String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

	// Constructeurs

	public Personne() {
		nom = "";
		prenom = "";
		surnom = "";

	}

	public Personne(String prenom, String nom, String surnom) {
		this.prenom = prenom;
		this.nom = nom;
		this.surnom = surnom;
	}

	// Méthodes
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getSurnom() {
		return surnom;
	}

//	méthode qui modifie la valeur de "nom"
	public void setNom(String n) {
		nom = n;
	}

	public void setPrenom(String n) {
		prenom = n;
	}

	public void setSurnom(String n) {
		surnom = n;
	}

	public void afficherDetails() {
		System.out.println("prenom : " + prenom + " nom : " + nom + "(surnom :" + surnom + ")");

	}

	public void afficherDetails(String langue) {
		if (langue.equals("en")) {
			System.out.println("firstname : " + prenom + " lastname : " + nom + "(nickname :" + surnom + ")");
		} else if (langue.equals("it")) {
			System.out.println("conome : " + prenom + " nome : " + nom + " (soprannome :" + surnom + ")");
		}else {
			System.out.println("prenom : " + prenom + " nom : " + nom + "(surnom :" + surnom + ")");
		}
	}

	public boolean isEquals(Personne pers) {
		if (this.prenom.equals(pers.prenom) && this.nom.equals(pers.nom)) {
			return true;
		}
		return false;
	}

	public int incrementeNombre(int nb) {
		return nb++;
	}

	public void modifierPersonne(Personne pers) {
		pers.nom = pers.nom.toUpperCase();
		pers.prenom = pers.prenom.toUpperCase();
	}
}
