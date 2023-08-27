package euler4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * A palindromic number reads the same both ways. The largest palindrome made
		 * from the product of two -digit numbers is 9009 = 91 x 99 Find the largest
		 * palindrome made from the product of two 3-digit numbers.
		 */

		System.out.println(largestPalindrome(3));

	}

	public static int largestPalindrome(int n) {

		String n1 = "0";
		ArrayList<Integer> palindromes = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			n1 = n1 + "9";

		}
		n1 = n1.substring(1, n1.length());

		final int number = Integer.parseInt(n1);

		for (int i = number; i >= 1; i--) {
			for (int j = number; j >= 1; j--) {
				final int multp = i * j;
				if (isPalindrome(multp)) {
					palindromes.add(multp);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < palindromes.size(); i++) {
			if (max < palindromes.get(i)) {
				max = palindromes.get(i);
			}
		}
		return max;
	}

	public static boolean isPalindrome(int n) {
		int rev = 0;
		int temp = n;

		while (n > 0) {
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
		}

		if (rev == temp) {
			return true;
		} else {
			return false;
		}
	}
}
