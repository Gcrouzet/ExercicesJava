/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
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
