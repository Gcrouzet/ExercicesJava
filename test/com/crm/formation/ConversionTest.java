package com.crm.formation;
/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class ConversionTest {

	public static void main(String[] args) {
	
		int x = 123456;
		long y = x;
		
		System.out.println(y);
		System.out.println(x);
		
		int x2 = 987654;
		short y2 = (short) x2;
		
		System.out.println(x2);
		System.out.println(y2);
		
		
		long l1 = 123456789;
		long l2 = 123456788;
		float f1 = l1;
		float f2 = l2;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(l1-l2);
		System.out.println(f1-f2);
		
		
	}

}
