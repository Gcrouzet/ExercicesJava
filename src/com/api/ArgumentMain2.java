/**
 * 
 */
package com.api;

/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 27/01/20
 *
 */
public class ArgumentMain2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 2) {
			String[] tableauNom = args[0].split("=");
			String[] tableauPrenom = args[1].split("=");

			if (tableauNom[0].equals("nom")) {
				System.out.println(tableauNom[1] + " " + tableauPrenom[1]);
			} else {
				System.out.println(tableauPrenom[1] + " " + tableauNom[1]);
			}

		}
	}
}
