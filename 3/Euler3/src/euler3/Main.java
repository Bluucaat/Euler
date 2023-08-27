package euler3;

public class Main {

	public static void main(String[] args) {

		// The prime factors of 13195 are 5,7,13 and 29.
		// What is the largest prime factor of the number 600851475143?

		System.out.println(isPrime(1));

		System.out.println(largestPrimeFactorNumber(600851475143L));

	}

	public static long largestPrimeFactorNumber(long n) {
		int lastprime = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				while (n % i == 0) {
					lastprime = i;
					n = n / i;
				}

			}

		}
		return lastprime;

	}

	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;

	}

}
