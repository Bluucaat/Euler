package euler7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * By listing the first six prime numbers: 2, 3,5 ,7, 11, and 13, we can see
		 * that the 6th prime is 13 . What is the 10001st prime number?
		 */

		/*
		 * ArrayList<Integer> arr = new ArrayList<Integer>(); int index = 0; while
		 * (arr.size() <= 10000) { index++; if (isPrime(index) == true) {
		 * arr.add(index);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println(arr.get(10000)); }
		 * 
		 * public static boolean isPrime(int n) { int count = 0; for (int i = 1; i <= n;
		 * i++) { if (n % i == 0) { count++; } }
		 * 
		 * if (count == 2) { return true; } else return false;
		 */

		// 2nd try, improving efficiency/runtime
		int index = 2;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (arr.size() <= 10000) {
			if (index == 2) {
				arr.add(index);
				index++;
			} else {
				int count = 0;
				for (int i = arr.size() - 1; i >= 0; i--) {
					if (index % arr.get(i) != 0) {
						count++;
					}

				}
				if (count == arr.size()) {
					arr.add(index);
				}
			}
			index++;
		}
		System.out.println(arr.get(10000));

	}

	/*
	 * public static boolean isPrime(int n) { int count = 0; for (int i = 1; i <= n;
	 * i++) { if (n % i == 0) { count++; } }
	 * 
	 * if (count == 2) { return true; } else return false;
	 * 
	 * }
	 */
}
