package com.crm.formation;

public class ConditionTest {

	public static void main(String[] args) {

		boolean estVrai = true;
		System.out.println("Début programme");
		if (estVrai == true) {
			System.out.print("YES");
			System.out.println(" WE CAN");
		} else {
			System.out.println("NO WE CAN'T");
		}

		System.out.println("Fin programme");

		int nb = 3;
		String chaine = "OK";

		if (nb > 10 && chaine.equals("OK")) {
			System.out.println("conditions remplie");
		} else if (nb > 10 || chaine.equals("OK")) {
			System.out.println("Une des deux condition remplie");
		} else {
			System.out.println("Condition non remplie");
		}

	}
}