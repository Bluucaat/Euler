import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int max = 0;
        int index = 0;
        for (int i = 1; i < 1000000; i++) {
            int result = getSequenceLength(i);
            if (max < result) {
                max = result;
                index = i;
            }

        }


        System.out.println("The number with the longest sequence is: " + index + " ammount of numbers in the sequence is: " + max);
    }


    public static int getSequenceLength(long n) {

        int count = 1;
        while (n != 1) {

            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n = (3 * n) + 1;
                count++;
            }
        }
        return count;
    }

}