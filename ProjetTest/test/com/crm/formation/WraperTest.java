package com.crm.formation;

import com.api.Utils;
/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class WraperTest {

	public static void main(String[] args) {
//		Scanner message = new Scanner(System.in);
//		System.out.println("Veuillez saisir un nombre :");
//		String chaine1 = message.nextLine();
//		int nombre = Integer.parseInt(chaine1);
//		System.out.println(nombre);
//		message.close();

		String nb1 = Utils.scannerSimpleTexte();
		int nombre1 = Integer.parseInt(nb1);
		System.out.println(nombre1);
			
		
		
	}

}
