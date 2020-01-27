/**
 * 
 */
package Exercice;

import java.util.Arrays;

/**
 * @author CRM
 *
 */
public class ApiJavaComparerTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tableau1 = { 5, 3, 4 };
		int[] tableau2 = { 2, 3, 4 };

		if (Arrays.equals(tableau1, tableau2)) {
			System.out.println("le tableau est identique");
			
		}else {
			System.out.println("le tableau n'est pas identique");
		}

	}
}
