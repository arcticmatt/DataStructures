import java.util.Scanner;


public class general {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Make a 11 item array that will hold words
		// and definitions

		HashFunction3 wordHashTable = new HashFunction3(11);

		String wordLookUp = "a";

		// Keep retrieve requests until x is entered

		while (!wordLookUp.equalsIgnoreCase("x")) {

			System.out.println(": ");

			wordLookUp = input.nextLine();

			// Look for the word requested and print
			// it out to screen

			System.out.println(wordHashTable.find(wordLookUp));

		}

		// Display every item in the array with
		// the index they are associated with

		wordHashTable.displayTheArray();

	}

}
