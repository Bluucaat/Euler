public class Main {
    public static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };

    public static String convert(final int n) {
        if (n < 20) return units[n]+ " ";

        if (n < 100) return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];

        if (n < 1000) return units[n / 100] + " hundred" + ((n % 100 != 0) ? " and " : "") + convert(n % 100);

        return "One Thousand";
    }

    public static void main(final String[] args) {
        StringBuilder finalAnswer = new StringBuilder(10000);

        for (int i = 0; i <= 1000; i++) {
            finalAnswer.append(convert(i));
        }
        System.out.println(finalAnswer);

        for (int i = 0; i < finalAnswer.length(); ++i) {
            if (Character.isWhitespace(finalAnswer.charAt(i))) {
                finalAnswer.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(finalAnswer.length());
    }
}

