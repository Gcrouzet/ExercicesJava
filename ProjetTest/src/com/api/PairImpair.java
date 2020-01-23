/**
 * 
 */
package com.api;

import java.util.Scanner;

/**S
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class PairImpair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	Scanner rectangle = new Scanner(System.in);
	System.out.println("Veuillez saisir un nombre :");
	int nb1 = rectangle.nextInt();
	rectangle.close();
	if (nb1%2==0){
		System.out.println("Ce nombre est pair.");
	} else {
		System.out.println("Ce nombre est impair.");
		
	}

	}

}
