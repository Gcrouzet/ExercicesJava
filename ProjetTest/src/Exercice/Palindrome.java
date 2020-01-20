package Exercice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un mot ");
		String mot = sc.nextLine();
		sc.close();
		if (pal(mot))
			System.out.println("'" + mot + "' est un palindrome");
		else
			System.out.println("'" + mot + "' n'est pas un palindrome");
	}

	public static boolean pal(String mot) {
		boolean egale = true;
		for(int i = 0, longueur = mot.length() - 1;i < longueur / 2 && egale;i++) {
			if (mot.charAt(i) == mot.charAt(longueur - i))
				egale = true;
			else
				egale = false;
			
		}
		return egale;
	}
}
