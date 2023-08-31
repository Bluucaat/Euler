package euler13;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("number.txt");
			Scanner sc = new Scanner(fr);
			BigInteger[] storedNumberArray = new BigInteger[100];
			String storedNumber = sc.nextLine().trim();

			while (sc.hasNextLine())
				storedNumber += (sc.nextLine().trim());

			int arrayIndex = 1;
			for (int i = 0; i <= 4950; i += 50) {
				storedNumberArray[arrayIndex - 1] = new BigInteger(storedNumber.substring(i, i + 50));
				arrayIndex++;
			}
			BigInteger numsum = new BigInteger("0");
			for (int i = 0; i < storedNumberArray.length; i++)
				numsum = numsum.add(storedNumberArray[i]);

			System.out.println(numsum.toString().substring(0, 10));
			fr.close();
			sc.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
