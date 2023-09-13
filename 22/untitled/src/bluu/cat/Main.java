package bluu.cat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("../names.txt");
            Scanner sc = new Scanner(fr);
            ArrayList<String> namesStored = new ArrayList<>(5000);
            ArrayList<Long> nameValues = new ArrayList<>(5000);
            BigInteger bigint = new BigInteger("0");

            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().replaceAll("\"", "").split(",");
                namesStored.addAll(Arrays.asList(line));
            }


            namesStored.sort(Comparator.naturalOrder());
            for (int i = 0; i < namesStored.size(); i++) {
                nameValues.add(getNameValue(namesStored.get(i).trim(), i+1));
                bigint = bigint.add(BigInteger.valueOf(getNameValue(namesStored.get(i), i+1)));
            }

            System.out.println(bigint);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }

    private static long getNameValue(String name, int posMultiplier) {
        long nameValue = 0;
        for (int i = 0; i < name.length(); i++) {
            nameValue = nameValue + (byte)(name.charAt(i)) - 'A' +1;
        }
        nameValue *= posMultiplier;
        return nameValue;
    }
}
