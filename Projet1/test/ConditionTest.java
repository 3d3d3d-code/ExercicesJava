/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ConditionTest {
	/** Test des if et else */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean estVrai = false;
		System.out.println("Debut programme");

		if (estVrai == true) {
			System.out.println("YES");
			System.out.println("WE CAN");

		} else {
			System.out.println("NO");
			System.out.println("WE CAN'T");
		}
		System.out.println("Fin programme");

		int nb = 25;
		String chaine = "OK";

		// syntaxe else if

		if (nb > 10 && chaine.equals("OK")) {
			System.out.println("condition remplie");

		} else if (nb > 10 || chaine.equals("OK")) {
			System.out.println("Une des 2 conditions est remplie");

		} else
			System.out.println("Aucune Condition n'est remplie");

		// if imbriqué

		if (nb > 10 && chaine.equals("OK")) {
			System.out.println("Condition remplie");

		} else {
			if (nb > 10 || chaine.equals("OK")) {
				System.out.println("Une des 2 conditions est remplie");

			}

		}
	}
}
