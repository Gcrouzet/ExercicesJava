/**
 * 
 */
package LeagueOfLegend;

import java.util.Scanner;

/**
 * 
 * @author Expert TCP/IP
 */
public class Champion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final String YASUO = "yasuo";
		final String TEEMO = "teemo";
		Scanner sc = new Scanner(System.in);
		System.out.println("What champ do you want to pick ?");
		String pick = sc.nextLine();
		sc.close();
		if (pick.equalsIgnoreCase(YASUO)) 
			System.out.println("GAME IS LOST, GO NEXT");
		else if (TEEMO == pick) 
			System.out.println("TROLL AGAIN");
		else 
			System.out.println("WE CAN TRY TO WIN");
		
	}

}
