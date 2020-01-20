/**
 * 
 */
package Exercice;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class TableauTrad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un jour de la semaine :");
		String day = sc.nextLine();
		sc.close();

		String [] tablJour = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };

		String [] tablJourAnglais = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
		
		
			
		for (int i=0;i<tablJour.length;i++) {
			if (tablJour[i].equals(day)) {
				System.out.println(tablJourAnglais[i]);
				return;
			}
			
		}
			

			
		

	}

}