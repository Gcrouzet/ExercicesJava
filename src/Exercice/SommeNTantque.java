/**
 * 
 */
package Exercice;

import java.util.Scanner;

/** Utilisation de while
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class SommeNTantque {

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
		while (nombre>0) {
			somme=somme+nombre;
			nombre=nombre-1;
			
			}
		System.out.println("Le résultat avec tant que est :"+somme);
	}

}
