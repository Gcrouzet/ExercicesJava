package Exercice;
import java.util.Scanner;

/** Exercice 1.2 algo
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class Exercice12 {
	

	public static void main(String[] args) {

		float aire, volume;

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le rayon en cm");
		float rayon = sc.nextFloat();
		aire = (float) (4*3.14*rayon*rayon);
		volume = (float) (4*(3.14*(rayon*rayon*rayon)/3));
		System.out.println("L'aire de la sphère est: " +aire +"cm²" +  " Son volume est: " + volume +"cm³");
		
	}
	

}
