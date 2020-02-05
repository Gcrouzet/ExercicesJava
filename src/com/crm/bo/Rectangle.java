/**
 * 
 */
package com.crm.bo;

/**
 * @author CRM
 *
 */
public class Rectangle {
	private float largeur;
	private float longueur;

	public void setLargeur(float l) {
		largeur = l;
	}

	public void setLongueur(float l) {
		longueur = l;
	}

	public float getLargeur() {
		return largeur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void perimetreRectangle() {
		System.out.println("Le périmetre du rectangle fait " + (longueur + largeur) * 2 + " cm");
	}

	public void surfaceRectangle() {
		System.out.println("la surface du rectangle fait " + longueur * largeur + " cm²");
	}
	public void compareRectangle() {
		
	}
}
