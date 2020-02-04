/**
 * 
 */
package Exercice;

import java.util.Scanner;

/** Utilisation de la boucle for
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class SommeNFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nombre, somme;
		somme = 0 ;
		Scanner nbr = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier :");
		nombre = nbr.nextInt();
		nbr.close();
		for (;nombre>0;nombre--) {
			somme=somme+nombre;
			}
		System.out.println("Le résultat avec pour est :"+somme);
	}

	

}
