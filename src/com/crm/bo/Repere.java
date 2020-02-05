/**
 * 
 */
package com.crm.bo;

/**
 * @author CRM
 *
 */
public class Repere {
	private int abscisseA;
	private int abscisseB;
	private int ordonnéeA;
	private int ordonnéeB;

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

	public void pointA() {
		System.out.println("le point A se trouve en : {" + abscisseA + ", " + ordonnéeA + "}");
	}

	public void pointB() {
		System.out.println("le point B se trouve en : {" + abscisseB + ", " + ordonnéeB + "}");
	}
	public void afficherDistanceAB () {
		System.out.println("La distance entre A et B est de : "+Math.sqrt(Math.pow(abscisseB-abscisseA,2)+Math.pow(ordonnéeB-ordonnéeA,2)));
		
	}
}
