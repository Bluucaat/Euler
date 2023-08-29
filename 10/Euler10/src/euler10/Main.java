package euler10;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Find the sum of all the primes below two million.

		System.out.println(primeSum());

	}

	public static long primeSum() {
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		long primesum = 2;
		for (int i = 3; i <= 2000000; i += 2) {

			for (int j = 0; j <= arr.size() - 1; j++) {
				if (i % arr.get(j) == 0) {
					break;
				} else if (i % arr.get(j) != 0) {
					count++;
				}

			}
			if (count == arr.size()) {
				arr.add(i);
				primesum += i;

			}
			count = 0;

		}

		return primesum;

	}

}
