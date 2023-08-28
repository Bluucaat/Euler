package euler7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = 2;
		arr.add(n);

		while (arr.size() <= 10000) {
			n += 1;
			int count = 0;
			for (int i = 0; i < arr.size(); i++) {
				if (n % arr.get(i) == 0) {
					count++;
					break;
				}

			}
			if (count == 0) {
				arr.add(n);
			}
		}
		System.out.println(arr.get(10000));
	}
}
