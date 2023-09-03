import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger num = new BigInteger("2").pow(1000);
        String storednum = String.valueOf(num);
        int sum = 0;

        for(int i = 0; i<storednum.length(); i++){
            sum += Integer.parseInt(String.valueOf(storednum.charAt(i)));
        }

        System.out.println(sum);
    }
}
