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
	public String surnom;
	private String nom;
	private String prenom;
	private String detail;
	protected Date dateNaissance;

//	Méthodes	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
//	méthode qui modifie la valeur de "nom"
	public void setNom(String n) {
		nom = n;
	}

	

	public void setPrenom(String n) {
		prenom = n;
	}
}
