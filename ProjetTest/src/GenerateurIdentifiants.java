import java.util.Scanner;
/**
 * @author Crouzet Gabriel
 * @version 1.0
 * @since 22/01/20
 *
 */
public class GenerateurIdentifiants {

	public static void main(String[] args) {

		Scanner simple = new Scanner(System.in);
		System.out.println("Veuillez saisir votre prénom :");
		String chaine1 = simple.nextLine();
		System.out.println("Veuillez saisir votre nom :");
		String chaine2 = simple.nextLine();
		simple.close();
		String prénom1 = chaine1.toUpperCase();
		String prénom2 = prénom1.substring(0, 1);
		String nom1 = chaine2.toUpperCase();
		System.out.println("Votre login sera :" + prénom2 + "." + nom1);
		String mdp1 = chaine2.substring(0, 2).toUpperCase() + chaine2.substring(2);
		String mdp2 = mdp1.replace('a', '@').replace('o', '0');
		System.out.println("Votre mot de passe est :" + mdp2 + mdp2.length());
	}

}
