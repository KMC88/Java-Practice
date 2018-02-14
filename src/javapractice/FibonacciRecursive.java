package javapractice;

/**
 * Contains methds responsible for printing out the fibonnaci series
 * @author kieranmcerlean
 *
 */
public class FibonacciRecursive {

	public static void main(String[] args) {
		
		FibonacciRecursive result = new FibonacciRecursive();
		int n = 20;
		for(int loop =0; loop<=n; loop++) {
			System.out.print(result.fiboRecursive(loop) + " ");
		}
	}
	
	/**
	 * calculates and returns the fibonacci series
	 * @param n - an <code>integer</code> specifying the value of n, the length of the series
	 * @return 
	 */
	public int fiboRecursive(int n) {
		
		if(n == 0) {
			return 0;
		} 
		if (n==1) {
			return 1;
		} else {
			return (fiboRecursive(n-1) + fiboRecursive(n-2));
		}
	}

}
