package Exercice;

import java.util.Scanner;

import com.api.Utils;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 27/01/20
 *
 */
public class MethodeTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la taille du tableau :");
		int taille = sc.nextInt();
		System.out.println("La taille du tableau est " + taille);
		int[] tabInter = new int[taille];

		for (int i = 0; i < tabInter.length; i++) {

			System.out.println("Veuillez saisir un nombre :");
			int nb = sc.nextInt();
			tabInter[i] = nb;

		}

		System.out.println("la somme des nombres du tableau est " + Utils.tableauSomme(tabInter));
		sc.close();
	}

}
