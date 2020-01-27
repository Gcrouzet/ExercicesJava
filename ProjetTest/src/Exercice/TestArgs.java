/**
 * 
 */
package Exercice;

/**
 * @author CRM
 *
 */
public class TestArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int y;
		int somme=0 ;
		if(args != null) {
			System.out.println("La taille du tableau args est : "+args.length);
			
			for(String str: args) {
				System.out.println(str);
			}
			for(int i=0;i<args.length;i++) {
			
			y = Integer.parseInt(args[i]);
				somme += y;
				
			}
			System.out.println("la somme des nombres du tableau est "+somme);
		}
		

	}

}
