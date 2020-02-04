package Exercice;
import java.util.Scanner;
/** Exercice 1.1.1 algo
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class Exercice111 {

	public static void main(String[] args) {

		float resultat;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un nombre :");
		float x = sc.nextFloat();
		System.out.println("veuillez saisir un nombre :");
		float y = sc.nextFloat();
		
		resultat = (x+y)/2;
		System.out.println("La moyenne est de" +resultat);
		
		
		
		sc.close();

	}

}
