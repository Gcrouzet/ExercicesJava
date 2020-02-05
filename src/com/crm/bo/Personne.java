/**
 * 
 */
package com.crm.bo;

import java.util.Date;

/**
 * setteur getteur nom/prenom/surnom
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
		System.out.println("Construction d'un objet personne (sans param)");
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
		System.out.println(prenom + " " + nom + "(" + surnom + ")");

	}
}
