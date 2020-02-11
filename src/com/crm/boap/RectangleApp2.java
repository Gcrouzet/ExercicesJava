/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Rectangle;

/**classe application Rectangle calculer périmètre et surface
 * @author Crouzet Gabriel
 * @version 2.0
 * @since 05/02/20
 *
 */
public class RectangleApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(5,4);
		System.out.println(rect1.perimetreRectangle());
		System.out.println(rect1.surfaceRectangle());
		
		Rectangle rect2 = new Rectangle(8,2);
		System.out.println(rect2.perimetreRectangle());
		System.out.println(rect2.surfaceRectangle());
		System.out.println("Le périmètre du rectangle est : "+rect2.perimetreRectangle(" cm"));
		System.out.println("La surface du rectangle est : "+rect2.surfaceRectangle(" cm²"));
	}

}
