package com.api;

import java.util.Scanner;

/**
 * Différent essai de méthode
 * 
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class Utils {
	public static final float PI = 3.14f;
	public static final String COULEUR_BLEU = "bleu";

	public static void afficherMessage(String texte) {
		System.out.println(texte);
	}

	public static int somme(int a, int b) {
		int s = a + b;
		return s;
	}

	public static float surface(float rayon) {
		float surface1 = rayon * rayon * PI;
		return surface1;
	}

	public static double surfaceCercleV2(double rayon) {
		double surface = Math.pow(rayon, 2) * Math.PI;
		return surface;

	}

	public static double volumeSphère(double rayon) {
		double surface = (double) 4 / 3 * Math.pow(rayon, 3) * Math.PI;
		return surface;
	}

	public static String scannerSimpleTexte() {
		Scanner simple = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		String chaine1 = simple.nextLine();
		simple.close();
		return chaine1;

	}

	public static int tableau(int[]tabInt ) {
	int somme=0;
		for(int nb : tabInt) {
			somme += nb;
			
		}
		return somme;
	}

}
