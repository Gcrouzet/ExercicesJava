package com.crm.formation;

import java.util.Scanner;

public class WraperTest {

	public static void main(String[] args) {
		Scanner message = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		String chaine1 = message.nextLine();
		int nombre = Integer.parseInt(chaine1);
		System.out.println(nombre);
		message.close();

	}

}
