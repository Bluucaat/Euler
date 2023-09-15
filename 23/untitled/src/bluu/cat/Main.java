package bluu.cat;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static boolean isAbundant(int n) {
        int divisorSum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == (n / i)) {
                    divisorSum += i;
                } else {
                    divisorSum += (i + (n / i));
                }
                if (divisorSum > n) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        long notAbundantSum = 0;
        ArrayList<Integer> abundantSumList = getSumList();
        HashSet<Integer> abundantSumHashSet = new HashSet<>(abundantSumList);
        for (int i = 1; i <= 28123; i++) {
            if (!abundantSumHashSet.contains(i)) {
                notAbundantSum += i;
            }
        }
        System.out.println(notAbundantSum);
    }

    private static ArrayList<Integer> getSumList() {
        ArrayList<Integer> abundantList = new ArrayList<>(5000);
        ArrayList<Integer> abundantSumList = new ArrayList<>(5000);

        for (int i = 1; i <= 28123; i++) {
            if (isAbundant(i)) {
                abundantList.add(i);
            }
        }

        for (int i = 0; i < abundantList.size(); i++) {
            for (int j = i; j < abundantList.size(); j++) {
                int sum = (abundantList.get(i) + abundantList.get(j));
                if (sum <= 28123) abundantSumList.add(sum);

            }
        }
        return abundantSumList;
    }
}