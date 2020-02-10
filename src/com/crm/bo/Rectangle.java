/**
 * 
 */
package com.crm.bo;

/**
 * Classe métier
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 05/02/20
 *
 */
public class Rectangle {
	
	private float largeur;
	private float longueur;
	
	
	public Rectangle() {
		
	}
	public Rectangle(float largeur, float longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	

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

	public float perimetreRectangle() {
		return (longueur + largeur) * 2;
	}

	public float surfaceRectangle() {
		return longueur * largeur;
	}
	
	public void compareRectangle(Rectangle rect2) {
		if(this.surfaceRectangle()>rect2.surfaceRectangle()) {
			System.out.println("le premier rectangle est plus grand");
		}else if (this.surfaceRectangle()==rect2.surfaceRectangle()) {
			System.out.println("pareil");
		}else {
			System.out.println("le deuxième rectangle est plus grand");
		}
	}
}
