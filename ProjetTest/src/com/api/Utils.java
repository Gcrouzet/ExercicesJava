package com.api;

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
		double surface = Math.pow(rayon, 2)*Math.PI;
		return surface;
		
	}
	
}
