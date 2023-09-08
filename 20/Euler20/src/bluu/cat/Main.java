package bluu.cat;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("1");
        for (int i = 1; i <= 100; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        String sumString = String.valueOf(num);
        int digitSum = 0;
        for (int i = 0; i < sumString.length(); i++) {
            digitSum += Integer.parseInt(sumString.charAt(i) + "");
        }
        System.out.println(num);
        System.out.println(digitSum);
    }
}
