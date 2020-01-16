/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class BoucleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);

		for (int x = -5; x <= 5; x++) {
			if (x == 0) {
				System.out.println("division par 0");
//				break;
//				continue;
				 return;
				
			}
			System.out.println(1.0 / x);
		}
		System.out.println("ça ne marchera pas");
	}

}
