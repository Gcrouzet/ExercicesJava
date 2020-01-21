/**
 * 
 */
package com.crm.formation;



/**
 * @author CRM
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String tableau[] = { "Gabriel", "Crouzet"};
//		System.out.println(tableau[0]+" "+tableau[1]);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Veuillez saisir  :");
//		int nbr = sc.nextInt();
//		sc.close();

//		Déclarer un tableau
		int tableau[] = new int[5];

//		Initialiser un tableau
		int tableau1[] = { 0, 1, 2, 3} ;

//		Accéder à un élément du tableau
		int test1 = tableau1[0];
		System.out.println(test1);

//		Modifier la valeur d'un élément du tableau
		tableau1[0] = 10;
		System.out.println(tableau1[0]);

//		Afficher la taille du tableau
		System.out.println("La taille du tableau est : " + tableau1.length);

//		Parcourir le tableau
		System.out.println("Parcours du tableau :");
		for (int i = 0; i < tableau1.length; i++) {
			System.out.println(tableau1[i]);
		}
//		Parcours du tableau v2
		System.out.println("Parcours du tableau :");
		for (int nb : tableau1) {
			System.out.println(nb);
		}

	}

}
