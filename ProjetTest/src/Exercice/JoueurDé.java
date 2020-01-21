/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class JoueurDé {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le prénom du premier joueur :");
		String Joueur1 = sc.nextLine();
		System.out.println("Veuillez saisir le prénom du deuxiéme joueur :");
		String Joueur2 = sc.nextLine();
		sc.close();

		int sommeJetDé = 0;
		int sommeJetDé2 = 0;
		int dé, dé2;

		for (int i = 0; i != 3; i++) {
			dé = (int) (Math.random() * 6) + 1;
			sommeJetDé = sommeJetDé + dé;
			if (dé == 6) {
				i--;
				continue;
			}

		}
		System.out.println(Joueur1 + " à " + sommeJetDé + " points");
		for (int i = 0; i != 3; i++) {
			dé2 = (int) (Math.random() * 6) + 1;
			sommeJetDé2 = sommeJetDé2 + dé2;
			if (dé2 == 6) {
				i--;
				continue;
			}

		}
		System.out.println(Joueur2 + " à " + sommeJetDé2 + " points");
		if (sommeJetDé > sommeJetDé2) {
			System.out.println(Joueur1 + " gagne le duel !!!");

		} else if (sommeJetDé == sommeJetDé2) {
			System.out.println("égalité");
		} else {
			System.out.println(Joueur2 + " gagne le duel !!!");

		}
	}
}
