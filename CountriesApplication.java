package countriesProject;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApplication {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userInput = null;
		String breakOut = null;
		boolean countryOptions = true;
		System.out.println("Hello \n" + "Welcome to our Countries App: \n");
//		ArrayList<String> countryList = new ArrayList();
		String List = null;
		
		while (countryOptions) {
			countryOptions = true;
			do {

				System.out.println("Would you like to add the Country (1): \n"
						+ "Would you like to Print out the Countries (2): \n"
						+ "Would you like to Delete a Country (3): \n" + "Would you like to Exit the app (4): \n");
				
				userInput = keyboard.nextLine();
				CountryValidator.numberVal(userInput);
				
				
			} while (CountryValidator.numberVal(userInput));

			switch (userInput) {
			case "1":
				
				CountriesReadAndWrite.write();
				System.out.println();
				break;
			case "2":

				CountriesReadAndWrite.read();
				System.out.println();

				break;

			case "3":
				
	  System.out.println("You have chosen to delete all information within you file!!");
				CountriesReadAndWrite.delete();
				break;
			case "4":
				System.out.println("Thank you for using our app and have a great day!!");
				System.exit(0);  
				
				break;
			default:
				break;
			}
	

		}

	}
}
