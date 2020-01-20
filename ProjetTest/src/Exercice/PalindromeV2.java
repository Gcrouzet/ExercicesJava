/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class PalindromeV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un mot ");
		String mot = sc.nextLine();
		sc.close();
		String mot1 =new StringBuilder(mot).reverse().toString();
		if (mot.equals(mot1)) {
			System.out.println(mot + " est un palindrome");
		} else {
			System.out.println(mot + " n'est pas un palindrome");

		}
	}

}
