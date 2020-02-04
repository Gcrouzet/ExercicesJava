/**
 * 
 */
package Exercice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ApiJavaComparerTableauV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le nombre d'éléments du tableau");
		int taille = sc.nextInt();
		int arr1[] = new int[taille];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Entrer un élément");
			int nb = sc.nextInt();
			arr1[i] = nb;
		}
		System.out.println("entrer le nombre d'éléments du tableau");
		int taille1 = sc.nextInt();
		int arr2[] = new int[taille1];
		for (int y = 0; y < arr2.length; y++) {
			System.out.println("Entrer un élément");
			int nb = sc.nextInt();
			arr2[y] = nb;
		}
		sc.close();
		if (Arrays.equals(arr1, arr2))
			System.out.println("le tableau est identique");
		else
			System.out.println("le tableau n'est pas identique");
	}

	

}
