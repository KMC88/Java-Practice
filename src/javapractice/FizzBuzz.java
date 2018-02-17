package javapractice;

import java.util.Scanner;

/**
 * Runs through the game FizzBuzz
 * @author KMcE
 *
 */
public class FizzBuzz {
	

	public static void main(String[] args) {
		 fizzBuzz();

	}
	
	/**
	 * The method iterates through a loop 100 times. For each multiple of five, "Fizz" is printed to screen;
	 * for each multiple of seven, "Buzz" is printed; for each multiple of both seven and five, "FizzBuzz" is printed.
	 * 
	 */
	public static void fizzBuzz() {
		String fizz, buzz, fizzBuzz;
		fizz= "Fizz";
		buzz = "Buzz";
		fizzBuzz = "FizzBuzz";
		
		for (int loop = 1; loop<=100; loop++) {
			if ((loop % 7) == 0 && (loop % 5) == 0) {
				System.out.println(fizzBuzz);
			} else if ((loop % 5) == 0) {
				System.out.println(fizz);
			} else if ((loop % 7) == 0) {
				System.out.println(buzz);
			} else {
			System.out.println(loop);
			}
			System.out.println();
		}
	}

}
