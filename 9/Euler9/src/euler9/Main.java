package euler9;

public class Main {

	public static void main(String[] args) {
		// Special Pythagorean Triplet

		for (int a = 1; a <= 1000; a++) {
			for (int b = a + 1; b <= 1000; b++) {
				int c = 1000 - a - b;

				if (a + b + c == 1000) {

					if ((a * a) + (b * b) == (c * c)) {

						System.out.println(a + " " + b + " " + c + " is your triplet.");
						System.out.println(a * b * c);
					}
				}

			}
		}

	}

}
