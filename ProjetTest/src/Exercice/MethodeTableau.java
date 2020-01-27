/**
 * 
 */
package Exercice;

import java.util.Scanner;

import com.api.Utils;

/**
 * @author CRM
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
		int[] tabInt = new int[taille];

		for (int i = 0; i < tabInt.length; i++) {

			System.out.println("Veuillez saisir un nombre :");
			int nb = sc.nextInt();
			tabInt[i] = nb;
			System.out.println("nombre " + nb);
		}

		System.out.println("la somme des nombres du tableau est " + Utils.tableau(tabInt));
		sc.close();
	}

}
