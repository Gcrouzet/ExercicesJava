package com.crm.formation;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texte;
		texte = "hello world";
		
		//compter les caractères
		System.out.println (texte.length());
		
		// Mettre en majuscule
		String str2 =texte.toUpperCase();
		System.out.println(str2);
		
		//Suppression des blancs
		String str3 = texte.replaceAll(" ", "");
		System.out.println(str3);
		
		//remplacer des caractères
		String str4 = texte.replace('e', 'a');
		System.out.println(str4);
		
		//Extraction d'une sous chaine
		String str5 = texte.substring(0, 4);
		System.out.println(str5);
				
	}

}
