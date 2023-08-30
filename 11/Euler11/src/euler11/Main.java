package euler11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try {
			ArrayList<Long> products = new ArrayList<Long>();
			FileReader fr = new FileReader("text.txt");
			Scanner sc = new Scanner(fr);
			int[][] grid = new int[20][20];
			int c = 0;

			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] nums = line.split(" ");
				for (int r = 0; r < nums.length; r++) {
					grid[c][r] = Integer.parseInt(nums[r]);
				}
				c++;
			}

			// trough row
			for (c = 0; c < grid.length; c++) {
				for (int r = 0; r < grid.length - 3; r++)
					products.add((long) grid[c][r] * grid[c][r + 1] * grid[c][r + 2] * grid[c][r + 3]);
			}

			// trough column
			for (c = 0; c < grid.length - 3; c++) {
				for (int r = 0; r < grid.length; r++)
					products.add((long) grid[c][r] * grid[c + 1][r] * grid[c + 2][r] * grid[c + 3][r]);
			}

			// diagonal up
			for (c = 0; c < 20; c += 4) {
				for (int r = grid.length - 1; r > 3; r--) {
					products.add((long) grid[r][c] * grid[r - 1][c + 1] * grid[r - 2][c + 2] * grid[r - 3][c + 3]);
				}
			}

			// diagonal down
			for (c = 0; c < 20; c += 4) {
				for (int r = 0; r < grid.length - 3; r++)
					products.add(
							(long) grid[0 + r][0 + c] * grid[1 + r][1 + c] * grid[2 + r][2 + c] * grid[3 + r][3 + c]);
			}

			// reverse diagonal down
			for (c = 0; c < 20; c += 4) {
				for (int r = grid.length - 1; r > 3; r--)
					products.add((long) grid[c][r] * grid[c + 1][r - 1] * grid[c + 2][r - 2] * grid[c + 3][r - 3]);
			}

			// reverse diagonal up
			for (c = 0; c < 20; c += 4) {
				for (int r = grid.length - 1; r > 3; r--)
					products.add(
							(long) grid[19 - c][r] * grid[18 - c][r - 1] * grid[17 - c][r - 2] * grid[16 - c][r - 3]);

			}

			Collections.sort(products);
			System.out.println(products.get(products.size() - 1));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
