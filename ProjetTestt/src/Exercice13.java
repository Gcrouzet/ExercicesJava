import java.util.Scanner;

public class Exercice13 {

	public static void main(String[] args) {
		float surface, rayon, angle;
		surface = 0;
		rayon = 0;
		angle = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez indiquer le rayon");
		rayon = sc.nextFloat();
		System.out.println("Veuillez indiquer l'angle");
		angle = sc.nextFloat();		
		surface = (float) (3.14*rayon*rayon*(angle/360));
		System.out.println("La surface est de:" +surface);

	}

}
