/**
 * 
 */
package LeagueOfLegend;

import java.util.Scanner;

/**
 * 
 *
 */
public class Champion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String YASUO = "yasuo";
		final String TEEMO = "teemo";
		Scanner sc = new Scanner(System.in);
		System.out.println("What champ you need pick ? ");
		String pick = sc.nextLine();
		sc.close();
		while (pick.equalsIgnoreCase(YASUO));
		System.out.println("GAME IS LOST,GO NEXT");
		if (TEEMO == pick) {
			System.out.println("TROLL AGAIN");
		}else {
			System.out.println("WE CAN TRY WIN");
		}
	}

}
