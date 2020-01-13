/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class NoteBac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String raté = "Examen raté";
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Veuillez saisir votre note:");
		int note = rectangle.nextInt();
		rectangle.close();
				
		if (note >= 10) {

			System.out.print("Vous êtes reçu à l'examen");
			if (12 <= note && note < 14) {
				System.out.println(" avec mention assez bien.");
			}
			if (14 <= note && note < 16) {
				System.out.println(" avec mention bien.");
			}
			if (16 <= note) {
				System.out.println(" avec mention très bien.");
			}

		} else {
			System.out.println(raté);
		}if (8<=note && note<10) {
			System.out.println("Vous devez passer le rattrapage");
		}

	}
}