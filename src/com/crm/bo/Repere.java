/**
 * 
 */
package com.crm.bo;

/**
 * Classe métier Repere
 * 
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 05/02/20
 *
 */
public class Repere {
	private int abscisseA;
	private int abscisseB;
	private int ordonnéeA;
	private int ordonnéeB;

	public Repere() {

	}

	public Repere(int abscisseA, int abscisseB, int ordonnéeA, int ordonnéeB) {
		this.abscisseA = abscisseA;
		this.abscisseB = abscisseB;
		this.ordonnéeA = ordonnéeA;
		this.ordonnéeB = ordonnéeB;
	}

	public int getAbcisseA() {
		return abscisseA;
	}

	public void setAbcisseA(int abscisseA) {
		this.abscisseA = abscisseA;
	}

	public int getAbcisseB() {
		return abscisseB;
	}

	public void setAbcisseB(int abscisseB) {
		this.abscisseB = abscisseB;
	}

	public int getOrdonnéeA() {
		return ordonnéeA;
	}

	public void setOrdonnéeA(int ordonnéeA) {
		this.ordonnéeA = ordonnéeA;
	}

	public int getOrdonnéeB() {
		return ordonnéeB;
	}

	public void setOrdonnéeB(int ordonnéeB) {
		this.ordonnéeB = ordonnéeB;
	}

	public double afficherDistanceAB() {
		return Math.sqrt(Math.pow(abscisseB - abscisseA, 2) + Math.pow(ordonnéeB - ordonnéeA, 2));

	}
}
