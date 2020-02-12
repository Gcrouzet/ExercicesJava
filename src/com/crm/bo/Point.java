/**
 * 
 */
package com.crm.bo;

/**
 * Classe métier Point
 * 
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 05/02/20
 *
 */
public class Point {
	private int abscisse;
	private int ordonnée;

	public Point() {

	}

	public Point(int abscisse, int ordonnée) {
		this.abscisse = abscisse;
		this.ordonnée = ordonnée;

	}

	public int getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}

	public int getOrdonnée() {
		return ordonnée;
	}

	public void setOrdonnée(int ordonnée) {
		this.ordonnée = ordonnée;
	}

	public double calculDistanceAB(Point point2) {
		return Math.sqrt(Math.pow(point2.getAbscisse()-this.getAbscisse(), 2) + Math.pow(point2.getOrdonnée() - this.getOrdonnée(), 2));

	}
	public void afficherDetail() {
		System.out.println(abscisse);
		System.out.println(ordonnée);
	}
}
