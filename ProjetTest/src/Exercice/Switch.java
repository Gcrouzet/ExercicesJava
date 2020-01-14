package Exercice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		final String LUNDI = "Monday";
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir un chiffre entier entre 1 et 7 :");
		int str1 = rectangle.nextInt();
		rectangle.close();
		int day = str1;
		switch (day) {
		case 1:
			System.out.println(LUNDI);
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Entre 1 et 7 svp");
			break;
		}

	}

}