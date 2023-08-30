package euler10;

import java.math.*;

public class Main {

	public static void main(String[] args) {
		// Find the sum of all the primes below two million.

		System.out.println(primeSum());

	}

	public static long primeSum() {
		int count = 0;
		// locating the least possible space, by estimating the ammount of primes under
		// N, and multiplying to make sure its higher. (Prime number theorem)
		int[] arr = new int[(int) ((2000000 / (int) Math.log(2000000)) * 1.05)];
		arr[0] = 2;
		long primesum = 2;
		int primesfound = 1;
		for (int i = 3; i <= 2000000; i += 2) {

			for (int j = 0; j < primesfound; j++) {
				if (i % arr[j] == 0) {
					break;

				} else
					count++;

			}
			if (count == primesfound) {
				arr[primesfound] = i;
				primesum += i;
				primesfound += 1;

			}
			count = 0;

		}
		return primesum;

	}

}
