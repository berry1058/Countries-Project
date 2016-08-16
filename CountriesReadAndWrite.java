package countriesProject;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesReadAndWrite {
	static String aCountry = null;
	static ArrayList<String> countriesToBeAdded = new ArrayList<>();
	static String country = null;

	static Path ourNewPath = Paths
			.get("\\Users\\admin\\rolandsshinnynewworkspace\\CountriesApp\\src\\countriesProject\\countriesProject.txt");
	static File aNewCountry = ourNewPath.toFile();
	static Scanner keyboard = new Scanner(System.in);

	public static void write() {
		boolean countryOptions = true;
		
		
		while (countryOptions) {
			try

			(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewCountry, true)))) {
				System.out.println("What country would you like to enter?:");
				country = keyboard.nextLine();

				out.println(country);
				countriesToBeAdded.add(country);

				System.out.println("Would you like to add another Country?");
				System.out.println("Please Enter Yes or No.");
				String breakOut = keyboard.nextLine();

				do {
					switch (breakOut.toLowerCase()) {
					case "yes":
						countryOptions = true;
						break;

					case "no":
						countryOptions = false;
						break;

					default:

						break;
					}
				} while (!breakOut.equals("yes") && !breakOut.equals(("no")));

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public static void read() {
		try (BufferedReader in = new BufferedReader(new FileReader(aNewCountry))) {
			String countriesInTheFile;

			while ((countriesInTheFile = in.readLine()) != null) {
				System.out.println(countriesInTheFile);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void delete(){
		String lineToRemove = null;
		String currentLine;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(aNewCountry));
			BufferedWriter writer = new BufferedWriter(new FileWriter(aNewCountry));
		while((currentLine = reader.readLine()) != null) {
		    // trim newline when comparing with lineToRemove
			lineToRemove = keyboard.nextLine();
			
	//		out.println(lineToRemove);
			
		    String trimmedLine = currentLine.trim();
		    
		    if(trimmedLine.equals(lineToRemove)) continue;
		    writer.write(currentLine + System.getProperty("line.separator"));
		}
		
		}catch (IOException ex) {
				ex.printStackTrace();
			}
//		writer.close(); 
//		reader.close(); 
//		boolean successful = tempFile.renameTo(inputFile);
	
	}
	
}
