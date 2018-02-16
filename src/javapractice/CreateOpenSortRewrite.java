package javapractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Prompts the user for a series of numbers, sorts them in ascending order 
 * and writes them to a file 
 * @author Kieran
 *
 */
public class CreateOpenSortRewrite {
	private static final int ARRAY_LENGTH = 5;

	public static void main(String[] args) {

		// create and array to hold the user input integers
		int[] numArray = new int[ARRAY_LENGTH];
		Scanner input = new Scanner(System.in);

		// populate the array with the user input
		for (int loop = 0; loop < numArray.length; loop++) {
			System.out.println("Please enter five numbers between 1 and 20");
			numArray[loop] = input.nextInt();

		}
		// sort the array in ascending order
		Arrays.sort(numArray);
		System.out.println(Arrays.toString(numArray));

		try {
			File file = new File("sortedNumbers.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, true);

			BufferedWriter bw = new BufferedWriter(fw);
			// writing the array to external file
			for (int loop = 0; loop < numArray.length; loop++) {
				bw.write(numArray[loop] + " ");
			}
			bw.close();
			input.close();
			System.out.println("Write complete");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
