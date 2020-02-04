/**
 * 
 */
package com.crm.bo;

import java.util.Date;


/**
 * @author CRM
 *
 */
public class Personne {
//	Attributs
	private String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

//	Méthodes	
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
