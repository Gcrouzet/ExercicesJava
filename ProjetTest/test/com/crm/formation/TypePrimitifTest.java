package com.crm.formation;

public class TypePrimitifTest {

	public static void main(String[] args) {
		Byte a, b, c;
		Float d;
		String texte;
		a = -55;
		b = 41;
		c = 15;
		d = (float)a+4;
		texte = "Le resultat de a+4 est "+d;
		System.out.println(texte);
		d = (float)b * 6;
		texte = "Le resultat de b*6 est "+d;
		System.out.println(texte); 
		d = (float)c/4;
		texte = "Le resultat de c/4 est "+d;
		System.out.println(texte); 
		b = ++b;
		System.out.println(b);
		b= ++b;
		System.out.println(b);
		b= --b;
		System.out.println(b);
	}

}
