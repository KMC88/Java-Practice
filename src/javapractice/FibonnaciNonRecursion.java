package javapractice;

import java.util.Scanner;

public class FibonnaciNonRecursion {

	/**
	 * DEfault no-argument constructor for Fibonacci class
	 */
	public FibonnaciNonRecursion() {

	}

	public static void main(String[] args) {
		fiboOutput();

	}

	/**
	 * Prompts the user to input the required length of the series and outputs the
	 * result
	 */
	public static void fiboOutput() {
		Scanner scanner = new Scanner(System.in);
		int length = 0;
		System.out.println("Enter required length of fibinnaci series: ");
		length = scanner.nextInt();

		int[] numArray = new int[length];
		numArray[0] = 0;
		numArray[1] = 1;

		for (int loop = 2; loop < length; loop++) {
			numArray[loop] = numArray[loop-1] + numArray[loop-2];
		}

		for (int loop = 0; loop < numArray.length; loop++) {
			System.out.print(numArray[loop] + " ");
		}
		scanner.close();

	}

}
