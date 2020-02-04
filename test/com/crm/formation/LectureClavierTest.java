/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class LectureClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : "+str);
		sc.close();
	}

}
