import java.util.Scanner;
/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class PerimRectangle {

	public static void main(String[] args) {
		float perim;

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir la longeur :");
		float longeur1 = sc.nextFloat();
		System.out.println("veuillez saisir la largeur :");
		float largeur1 = sc.nextFloat();
		
		
		perim = longeur1 + largeur1;
		perim = perim + perim;
		
		System.out.println("Le perimetre est de : "+perim);
		sc.close();
		
		
		

	}

}
