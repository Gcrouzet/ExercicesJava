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
	private String boite;
	private int vitesseCourante = 0;
	private boolean etatVoiture = false;
	private boolean ville = false;
	private boolean route = false;
	private boolean autoroute = false;

	public Voiture() {
		marque = "";
		couleur = "";
		nombrePortes = 0;
		prix = 0;
		vitesseCourante = 0;
		boite="";
	}

	public Voiture(String marque, String couleur, int nbPortes, int prix, String boite) {
		this.marque = marque;
		this.couleur = couleur;
		this.nombrePortes = nbPortes;
		this.prix = prix;
		this.boite=boite;
	}

	

	public boolean isVille() {
		return ville;
	}

	public boolean isRoute() {
		return route;
	}

	public boolean isAutoroute() {
		return autoroute;
	}

	public void setAutoroute(boolean autoroute) {
		this.autoroute = autoroute;
	}

	public void setRoute(boolean route) {
		this.route = route;
	}

	public void setVille(boolean ville) {
		this.ville = ville;
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

	public boolean isEtatVoiture() {
		return etatVoiture;
	}

	public void accélérationVille(int vitesse) {
		if (getVitesseCourante() + vitesse > 50) {
			System.out.println("Vous ne pouvez pas autant accélérer en ville");
			vitesseCourante=50;
		} else
			vitesseCourante = getVitesseCourante() + vitesse;
	}

	public void accélérationRoute(int vitesse) {
		if (getVitesseCourante() + vitesse > 80) {
			System.out.println("Vous ne pouvez pas autant accélérer sur route");
			vitesseCourante=80;
		} else
			vitesseCourante = getVitesseCourante() + vitesse;
	}

	public void accélérationAutoroute(int vitesse) {
		if (getVitesseCourante() + vitesse > 130) {
			System.out.println("Vous ne pouvez pas autant accélérer sur autoroute");
			vitesseCourante=130;
		} else
			vitesseCourante = getVitesseCourante() + vitesse;
	}

	public int ralentir(int vitesse) {
		return vitesseCourante=getVitesseCourante() - vitesse;
	}

	public void klaxonner() {
		System.out.println("tututut");
	}

	public void demarrer() {
		etatVoiture = true;
	}

	public void arreter() {
		etatVoiture = false;
	}
	public void afficherDetail() {
		System.out.println("Marque : "+marque);
		System.out.println("couleur : "+couleur);
		System.out.println(nombrePortes+" portes");
		System.out.println("Prix : "+prix+" €");
		System.out.println("boite "+boite);
	}
}
