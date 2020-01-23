package com.crm.formation;

/**
 * 
 */

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
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
		
		// comparaison de chaine
		String chaine1="test";
		String chaine2= "TEST";
		System.out.println(chaine1.equals(chaine2));
		System.out.println(chaine1.equalsIgnoreCase(chaine2));		
	}

}
