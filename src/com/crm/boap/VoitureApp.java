/**
 * 
 */
package com.crm.boap;

import java.util.Scanner;

import com.crm.bo.Voiture;

/**
 * @author CRM
 *
 */
public class VoitureApp {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i = 0;
		Voiture mini = new Voiture("Tesla", "rouge", 4, 50000, "automatique");
		System.out.println("Votre Voiture est une : ");
		mini.afficherDetail();

		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez-vous démarrer la voiture ? ");
		String choix = sc.nextLine();
		if (choix.equalsIgnoreCase("oui")) {
			mini.demarrer();
		} else {
			System.out.println("Dommage");
		}
		System.out.println("1 : Choisir le type de route");
		System.out.println("2 : Accélérer");
		System.out.println("3 : Décélérer");
		System.out.println("4 : Klaxonner");
		System.out.println("5 : Arrêter la voiture");
		System.out.println("Choisissez (ville/route/autoroute)");
		String route = sc.nextLine();
		if (route.equalsIgnoreCase("ville")) {
			mini.setVille(true);
			mini.setRoute(false);
			mini.setAutoroute(false);
		} else if (route.equalsIgnoreCase("route")) {
			mini.setRoute(true);
			mini.setVille(false);
			mini.setAutoroute(false);
		} else if (route.equalsIgnoreCase("autoroute")) {
			mini.setAutoroute(true);
			mini.setVille(false);
			mini.setRoute(false);
		} else
			System.out.println("Mauvais type de route");
			
		while (mini.isEtatVoiture() == true) {
			if (i < 2) {

				System.out.println("Que voulez vous faire ? ");
				String chiffre = sc.nextLine();
				switch (chiffre) {
				case "1":
					System.out.println("Choisissez (ville/route/autoroute)");
					route = sc.nextLine();
					if (route.equalsIgnoreCase("ville")) {
						mini.setVille(true);
						mini.setRoute(false);
						mini.setAutoroute(false);
					} else if (route.equalsIgnoreCase("route")) {
						mini.setRoute(true);
						mini.setVille(false);
						mini.setAutoroute(false);
					} else if (route.equalsIgnoreCase("autoroute")) {
						mini.setAutoroute(true);
						mini.setVille(false);
						mini.setRoute(false);
					} else
						System.out.println("Mauvais type de route");
					break;
				case "2":
					System.out.println("De combien souhaitez-vous accélérer ?");
					int vitesse = Integer.parseInt(sc.nextLine());
					if (mini.isVille() == true) {
						mini.accélérationVille(vitesse);
						System.out.println("Votre vitesse est de " + mini.getVitesseCourante() + "km/h");
					} else if (mini.isRoute() == true) {
						mini.accélérationRoute(vitesse);
						System.out.println("Votre vitesse est de " + mini.getVitesseCourante() + "km/h");
					} else if (mini.isAutoroute() == true) {
						mini.accélérationAutoroute(vitesse);
						System.out.println("Votre vitesse est de " + mini.getVitesseCourante() + "km/h");
					} else
						System.out.println("erreur");
					break;
				case "3":
					System.out.println("De combien souhaitez-vous décélérer ?");
					vitesse = Integer.parseInt(sc.nextLine());
					mini.ralentir(vitesse);
					System.out.println("Votre vitesse est de " + mini.getVitesseCourante() + "km/h");
					break;
				case "4":
					mini.klaxonner();
					i++;
					break;

				case "5":
					mini.arreter();
					System.out.println("Au revoir");
					break;
				default:
					System.out.println("Choissisez entre 1 et 5 svp");
				}
			}else {
				System.out.println("Arreter de vous amusez avec le klaxon , merci");
				break;
			}
		}
	}

}
