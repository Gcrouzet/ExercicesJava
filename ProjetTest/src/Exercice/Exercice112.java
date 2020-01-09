package Exercice;
import java.util.Scanner;

public class Exercice112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char reponse = 'O';
		float resultat;

		while (reponse == 'O') {

			System.out.println("veuillez saisir un nombre :");
			float x = sc.nextFloat();
			System.out.println("veuillez saisir un nombre :");
			float y = sc.nextFloat();

			resultat = (x + y) / 2;
			System.out.println("La moyenne est de " + resultat);

			System.out.println("Voulez-vous réessayer ? (O/N)");
			Scanner sc2 = new Scanner(System.in);
			reponse = sc2.nextLine().charAt(0);

		}
		System.out.println("Au revoir…");
	}
}
