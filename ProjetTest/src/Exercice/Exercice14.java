package Exercice;
import java.util.Scanner;
/** Exercice 1.4 algo
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class Exercice14 {

	public static void main(String[] args) {
		float a, b, tmp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ajoutez un nombre a");
		a = sc.nextFloat();
		System.out.println("Ajoutez un nombre b");
		b = sc.nextFloat();

		tmp = a;
		a = b;
		b = tmp;

		System.out.println("La nouvelle valeur de a est " + a + " La nouvelle valeur de b est " + b);

	}

}
