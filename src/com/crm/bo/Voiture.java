/**
 * 
 */
package com.crm.bo;

/**
 * Classe métier Voiture
 * 
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 11/02/20
 */
public class Voiture {
	private String marque;
	private String couleur;
	private int nombrePortes;
	private int prix;
	private int vitesseCourante;
	private boolean etatVoiture;
	final private int VILLE = 50;
	final private int ROUTE = 80;
	final private int AUTOROUTE = 130;

	public Voiture() {
		marque = "";
		couleur = "";
		nombrePortes = 0;
		prix = 0;
		vitesseCourante = 0;
	}

	public Voiture(String marque, String couleur, int nbPortes, int prix, int vCourante) {
		this.marque = marque;
		this.couleur = couleur;
		this.nombrePortes = nbPortes;
		this.prix = prix;
		this.vitesseCourante = vCourante;

	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNombrePortes() {
		return nombrePortes;
	}

	public void setNombrePortes(int nombrePortes) {
		this.nombrePortes = nombrePortes;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getVitesseCourante() {
		return vitesseCourante;
	}

	public void setVitesseCourante(int vitesseCourante) {
		this.vitesseCourante = vitesseCourante;
	}

	public int accélération(int vitesse) {
		return getVitesseCourante() + vitesse;
	}

	public int ralentir(int vitesse) {
		return getVitesseCourante() - vitesse;
	}

	public void klaxonner() {
		System.out.println("tututut");
	}

	public void demarrer() {
		etatVoiture = true;
	}
	
}
