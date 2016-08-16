package countriesProject;

public class CountryValidator {

	public static boolean numberVal(String userInput) {

		if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4")) {
			try {
				int number = Integer.parseInt(userInput);
				return false;

			} catch (NumberFormatException e) {

				return true;
			}
		}
		return false;
	}
	
}
