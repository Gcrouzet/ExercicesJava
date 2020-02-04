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
public class ArgumentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args != null) {
			System.out.println("La taille du tableau args est : "+args.length);
			
			for(String str: args) {
				System.out.println(str);
			}
		}
		
	}

}
