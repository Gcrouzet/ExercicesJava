package com.crm.formation;

import java.util.Scanner;

import com.api.Utils;
/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		double rayon = 6;
		double surface = Utils.surfaceCercleV2(rayon);
		System.out.println(surface);

		Scanner Rcercle = new Scanner(System.in);
		System.out.println("Veuillez saisir le rayon :");
		Double rayon2 = Rcercle.nextDouble();
		double surface2;
		surface2 = Utils.volumeSphère(rayon2);
		System.out.println("le volume de la sphère est " + surface2);
		Rcercle.close();
	}

}
