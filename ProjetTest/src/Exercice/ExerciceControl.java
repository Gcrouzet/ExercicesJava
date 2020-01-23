package Exercice;

import java.util.Scanner;

public class ExerciceControl {

	public static void main(String[] args) {
		int longueur, largeur, périmetre;
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir la longueur du rectangle :");
		longueur = sc.nextInt();
		if (longueur <= 0) {
			System.out.println("Veuillez saisir la longueur du rectangle :");
			longueur = sc.nextInt();
		}
		System.out.println("Veuillez saisir la largeur du rectangle :");
		largeur = sc.nextInt();
		if (largeur <= 0) {
			System.out.println("Veuillez saisir la largeur du rectangle :");
			largeur = sc.nextInt();
			sc.close();

		}
		périmetre = (longueur + largeur) * 2;
		System.out.println("le périmétre du rectangle est :" + périmetre);

	}

}
