package 蓝桥杯14届研究生组真题;

public class SpecialDatesCounter {

    public static void main(String[] args) {
        int count = countSpecialDates(1900, 1, 1, 9999, 12, 31);
        System.out.println("满足条件的日期总数量是: " + count);
    }

    public static int countSpecialDates(int startYear, int startMonth, int startDay,
                                        int endYear, int endMonth, int endDay) {
        int count = 0;
        for (int year = startYear; year <= endYear; year++) {
            for (int month = 1; month <= 12; month++) {
                int maxDay = getMaxDayOfMonth(year, month);
                for (int day = 1; day <= maxDay; day++) {
                    if (isSpecialDate(year, month, day)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isSpecialDate(int year, int month, int day) {
        return digitSum(year) == digitSum(month) + digitSum(day);
    }

    public static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int getMaxDayOfMonth(int year, int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return (isLeapYear(year)) ? 29 : 28;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}