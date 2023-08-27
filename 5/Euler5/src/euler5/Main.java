package euler5;

public class Main {

	public static void main(String[] args) {

		/*
		 * 2520 is the smallest number that can be divided by each of the numbers from 1
		 * to 10 without any remainder. What is the smallest positive number that is
		 * evenly divisible by all of the numbers from 1 to 20?
		 */
		int numberstofind = 20;
		boolean breakouter = false;
		for (int i = numberstofind; i < Integer.MAX_VALUE && breakouter == false; i++) {
			numberstofind = 20;
			for (int j = 0; j < 20 && i % numberstofind == 0; j++) {
				if (numberstofind == 0) {

					break;
				}
				if (i % numberstofind == 0) {
					numberstofind--;

					if (numberstofind == 1) {
						System.out.println(i);
						breakouter = true;
						break;
					}
				}

			}
		}
	}
	
}
