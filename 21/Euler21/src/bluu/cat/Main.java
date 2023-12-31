package bluu.cat;

public class Main {

    public static int sumOfDivisors(int n) {
        int divisorsSummed = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisorsSummed = divisorsSummed + i + (n / i);
            }
        }
        return divisorsSummed;
    }

    public static boolean isAmicable(int a, int b) {
        return sumOfDivisors(a) == b && sumOfDivisors(b) == a && a != b;
    }

    public static void main(String[] args) {

        long amicableSummed = 0;
        for (int i = 1; i < 10000; i++) {
            int divisorsOfNumber = sumOfDivisors(i);
            if (isAmicable(i, divisorsOfNumber)) {
                amicableSummed += i;
            }

        }
        System.out.println(amicableSummed);
    }
}
