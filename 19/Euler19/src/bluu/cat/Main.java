package bluu.cat;

public class Main {
    public static void main(String[] args) {

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,};
        int dayoftheweek = 1;
        int dayIsFirstSunday = 0;
        //Technically speaking, 1900 is not a leap year, because a leap is skipped when it's divisible by 100 and not by 400
        //since that's the only year in this program that will be, it makes no sense to write the maths for this, just the 1900 itself
        for (int year = 1900; year <= 2000; year++) {
            if (year != 1900 && year % 4 == 0) {
                daysInMonth[2] = 29;
            } else {
                daysInMonth[2] = 28;
            }
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= daysInMonth[month]; day++) {
                    if (dayoftheweek % 7 == 0 && year != 1900) {
                        dayIsFirstSunday += (day == 1) ? 1 : 0;
                        dayoftheweek = 0;
                    }
                    dayoftheweek++;
                }
            }
        }
        System.out.println(dayIsFirstSunday);
    }
}
