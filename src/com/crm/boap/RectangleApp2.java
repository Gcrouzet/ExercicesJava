/**
 * 
 */
package com.crm.boap;

import com.crm.bo.Rectangle;

/**
 * @author CRM
 *
 */
public class RectangleApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(5,4);
		rect1.perimetreRectangle();
		rect1.surfaceRectangle();
		
		Rectangle rect2 = new Rectangle(8,2);
		rect2.perimetreRectangle();
		rect2.surfaceRectangle();
		
	}

}
