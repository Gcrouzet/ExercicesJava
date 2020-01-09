package Exercice;
import java.util.Scanner;

public class Exercice15 {

	public static void main(String[] args) {

		float sommeInitiale, interet, année, sommeFinaleAvecInteretSimple, sommeFinaleAvecInteretComposé, tmpSF, tmpSF1;
		tmpSF =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez inserer la somme initiale");
		sommeInitiale = sc.nextFloat();
		System.out.println("Veuillez inserer les interets");
		interet = sc.nextFloat();
		System.out.println("Veuillez inserer le nombre d'année");
		année = sc.nextFloat();
		
		sommeFinaleAvecInteretSimple = sommeInitiale*(1+année*interet);
		System.out.println("La somme finale avec interet simple est de " + sommeFinaleAvecInteretSimple);

	
			while (année > '0');{
				tmpSF1 = (1+interet)*(1+interet);
				tmpSF = tmpSF1 + tmpSF;
				année = année-1; 
			}
			sommeFinaleAvecInteretComposé = tmpSF * sommeInitiale;
			System.out.println("La somme finale avec interet composé est de " + sommeFinaleAvecInteretComposé);
	}	
}

