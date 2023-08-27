package euler6;

public class Main {

	public static void main(String[] args) {
		/*
		 * The sum of the squares of the first ten natural numbers is, 385 The square of
		 * the sum of the first ten natural numbers is 3025 Hence the difference between
		 * the sum of the squares of the first ten natural numbers and the square of the
		 * sum is 3025-385=2640 Find the difference between the sum of the squares of
		 * the first one hundred natural numbers and the square of the sum
		 */

		long sumSqrt = 0;
		for (int i = 1; i <= 100; i++)
			sumSqrt = sumSqrt + i * i;
		long answer = ((101 * 50) * (101 * 50)) - (sumSqrt);
		System.out.println(answer);
	}
}
