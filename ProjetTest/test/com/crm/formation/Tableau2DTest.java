/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Tableau2DTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// déclaration d'un tableau 2D
		int[][] tab2D = new int[2][3];

		// Déclaration avec initialisation
		int[][] tab2Dim = { { 0, 1, 2 }, { 4, 5, 6 } };

		// Accès aux éléments
		System.out.println("élément [0][0] : " + tab2Dim[0][0]);
		System.out.println("élément [1][2] : " + tab2Dim[1][2]);

		// Modification d'un élément
		tab2Dim[1][2] = 6;
		System.out.println("élément [1][2] après modif : " + tab2Dim[1][2]);

		// Taille du tableau
		System.out.println("Taille du tableau tab2Dim :" + tab2Dim.length);

		// Nombre de colonnes
		System.out.println("Nombre de colonnes : " + tab2Dim[0].length);

		// Parcours du tableau
		for (int i = 0; i < tab2Dim.length; i++) {
			for (int j = 0; j < tab2Dim[i].length; j++) {
				System.out.println("élément [" + i + "][" + j + "] : " + tab2Dim[i][j]);

			}
			// Déclaration avec initialisation
			int[][] tab2Dvar1 = new int[3][];
			tab2Dvar1[0] = new int[1];
			tab2Dvar1[1] = new int[2];
			tab2Dvar1[2] = new int[1];
			tab2Dvar1[0][0] = 1;
			tab2Dvar1[1][0] = 1;
			tab2Dvar1[1][1] = 1;
			tab2Dvar1[2][0] = 1;
			// Parcours du tableau
			for (int a = 0; a < tab2Dvar1.length; a++) {
				for (int j = 0; j < tab2Dvar1[a].length; j++) {
					System.out.print(tab2Dvar1[a][j]);
				}
				System.out.println();
			}
			System.out.println("\n\n");
			int[][] tab2var2 = { { 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
			
			for (int z = 0; z < tab2var2.length; z++) {
				for (int j = 0; j < tab2var2[z].length; j++) {
					System.out.print(tab2var2[z][j]);
				}
				System.out.println();
			}
		}
	}

}
