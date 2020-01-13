/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class MaxNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Veuillez saisir trois nombres différents.");
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier nombre :");
		int nb1 = rectangle.nextInt();
		System.out.println("Veuillez saisir le second nombre :");
		int nb2 = rectangle.nextInt();
		System.out.println("Veuillez saisir le troisième nombre :");
		int nb3 = rectangle.nextInt();
		rectangle.close();
		
		if(nb1>nb2 && nb1>nb3 ) {
			System.out.println("Le plus grand nombre est :"+nb1);
		}
		if(nb2>nb1 && nb2>nb3) {
			System.out.println("Le plus grand nombre est :"+nb2);
		}
		if(nb3>nb1 && nb3>nb2) {
			System.out.println("Le plus grand nombre est :"+nb3);
		}
		
			
		

	}

 }
