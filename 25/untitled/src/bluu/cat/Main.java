package bluu.cat;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        System.out.println(getIndexOf1000DigitFibonacci());

    }

    private static int getIndexOf1000DigitFibonacci() {
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("0");
        BigInteger num3;

        int i = 0;
        boolean runCond = true;

        while (runCond) {
            if (String.valueOf(num1).length() == 1000) {
                runCond = false;
            }
            num3 = num2.add(num1);
            num1 = num2;
            num2 = num3;
            i++;
        }
        return i-2;
    }
}