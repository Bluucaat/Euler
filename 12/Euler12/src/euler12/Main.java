package euler12;

public class Main {
	
	public static void main(String[] args) {
		//What is the value of the first triangle number to have over five hundred divisors?
		int divisorsFound = 0;
		int i = 0;
		boolean numberNotFound = true;

		while (numberNotFound) {
			divisorsFound = (int) getTotalDivisors(getTriangularNumber(i));
			if (divisorsFound >= 500) {
				System.out.println((long) getTriangularNumber(i));
				numberNotFound = false;
			}
			i++;
		}
	}

	public static long getTotalDivisors(long n) {
		int divisors = 0;
		for (int i = 1; i*i < n; i++) {
			if (n % i == 0) {
				divisors += 2;
				if (divisors >= 500) {
					break;
				}
			}
		}

		return divisors;
	}

	public static long getTriangularNumber(int n) {
		return (long)(n*(n+1))/2;

	}
}
