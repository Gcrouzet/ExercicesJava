/**
 * 
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Rectangle;

/**
 * @author CRM
 *
 */
public class RectangleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle();

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la largeur du rectangle :");
		rec1.setLargeur(sc.nextFloat());
		System.out.println("Veuillez saisir la longueur du rectangle :");
		rec1.setLongueur(sc.nextFloat());

		rec1.perimetreRectangle();
		rec1.surfaceRectangle();

		Rectangle rec2 = new Rectangle();

		System.out.println("Veuillez saisir la largeur du rectangle :");
		rec2.setLargeur(sc.nextFloat());
		System.out.println("Veuillez saisir la longueur du rectangle :");
		rec2.setLongueur(sc.nextFloat());
		sc.close();

		rec2.perimetreRectangle();
		rec2.surfaceRectangle();

	}

}
