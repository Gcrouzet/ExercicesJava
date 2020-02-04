/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author Crouzet Gabriel
 * @version 3.0
 * @since 22/01/20
 *
 */
public class MaxNombreV3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier nombre :");
		int nb1 = rectangle.nextInt();
		System.out.println("Veuillez saisir le second nombre :");
		int nb2 = rectangle.nextInt();
		
		if(nb1>nb2) {
			nb2=nb1;
			
		}
		
		System.out.println("Veuillez saisir le troisième nombre :");
		int nb3 = rectangle.nextInt();
		rectangle.close();
		if(nb2>nb3) {
			nb3=nb2;
		}
		else {
			nb2=nb3;
		}
		System.out.println("Le plus grand nombre est: " + nb3);
	}

}
