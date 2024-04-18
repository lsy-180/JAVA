package Acwing.模拟;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P466 {
    public static int count = 0;
    // 40111104
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int one = scanner.nextInt(), two = scanner.nextInt();
        int year_old = one / 10000;
        int month_old = one / 100 - year_old * 100;
        int day_old = one - (one / 100) * 100;
        int year_new = two / 10000;
        int month_new = two / 100 - year_new * 100;
        int day_new = two - (two / 100) * 100;
        System.out.println(year_old);
        System.out.println(month_old);
        System.out.println(day_old);
        if (year_old != year_new) {
            for (int i = year_old; i <= year_new; i++) {
                if (i == year_old) {
                    for (int j = month_old; j <= 12; j++) {
                        if (j == month_old) {
                            if (j == 1 || j == 3 | j == 5 || j == 7 || j == 8 || j == 10 | j == 12) {
                                for (int k = day_old; k <= 31; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else if (j == 4 || j == 6 || j == 9 || j == 11) {
                                for (int k = day_old; k <= 30; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else if (j == 2 && (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)) {
                                for (int k = day_old; k <= 29; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else {
                                for (int k = day_old; k <= 28; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            }
                        } else if (j == 1 || j == 3 | j == 5 || j == 7 || j == 8 || j == 10 | j == 12) {
                            for (int k = 1; k <= 31; k++) {
                                count = getCount(count, i, j, k);
                            }
                        } else if (j == 4 || j == 6 || j == 9 || j == 11) {
                            for (int k = 1; k <= 30; k++) {
                                count = getCount(count, i, j, k);
                            }
                        } else if (j == 2 && (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)) {
                            for (int k = 1; k <= 29; k++) {
                                count = getCount(count, i, j, k);
                            }
                        } else {
                            for (int k = 1; k <= 28; k++) {
                                count = getCount(count, i, j, k);
                            }
                        }
                    }
                } else if (i != year_new) {
                    for (int j = 1; j <= 12; j++) {
                        if (j == 1 || j == 3 | j == 5 || j == 7 || j == 8 || j == 10 | j == 12) {
                            for (int k = 1; k <= 31; k++) {
                                count = getCount(count, i, j, k);
                            }
                        } else if (j == 4 || j == 6 || j == 9 || j == 11) {
                            for (int k = 1; k <= 30; k++) {
                                count = getCount(count, i, j, k);
                            }
                        } else if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                            for (int k = 1; k <= 29; k++) {
                                count = getCount(count, i, j, k);
                            }
                        } else {
                            for (int k = 1; k <= 28; k++) {
                                count = getCount(count, i, j, k);
                            }
                        }
                    }
                } else if (i==year_new){
                    for (int j = 1; j <= month_new; j++) {
                        if (j == month_new) {
                            if (j == 1 || j == 3 | j == 5 || j == 7 || j == 8 || j == 10 | j == 12) {
                                for (int k = 1; k <= day_new; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else if (j == 4 || j == 6 || j == 9 || j == 11) {
                                for (int k = 1; k <= day_new; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else if (j == 2 && (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)) {
                                for (int k = 1; k <= day_new; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else {
                                for (int k = 1; k <= day_new; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            }
                        } else {
                            if (j == 1 || j == 3 | j == 5 || j == 7 || j == 8 || j == 10 | j == 12) {
                                for (int k = 1; k <= 31; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else if (j == 4 || j == 6 || j == 9 || j == 11) {
                                for (int k = 1; k <= 30; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else if (j == 2 && (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)) {
                                for (int k = 1; k <= 29; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            } else {
                                for (int k = 1; k <= 28; k++) {
                                    count = getCount(count, i, j, k);
                                }
                            }
                        }

                    }
                }
            }
        } else {
            for (int i = month_old; i <= month_new; i++) {
                if (i == month_new) {
                    if (i == 1 || i == 3 | i == 5 || i == 7 || i == 8 || i == 10 | i == 12) {
                        for (int k = 1; k <= day_new; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                        for (int k = 1; k <= day_new; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    } else if (i == 2 && (year_old % 400 == 0 || year_old % 4 == 0 && year_old % 100 != 0)) {
                        for (int k = 1; k <= day_new; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    } else {
                        for (int k = 1; k <= day_new; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    }
                } else {
                    if (i == 1 || i == 3 | i == 5 || i == 7 || i == 8 || i == 10 | i == 12) {
                        for (int k = 1; k <= 31; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                        for (int k = 1; k <= 30; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    } else if (i == 2 && (year_old % 400 == 0 || (year_old % 4 == 0 && year_old % 100 != 0))) {
                        for (int k = 1; k <= 29; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    } else {
                        for (int k = 1; k <= 28; k++) {
                            count = getCount(count, year_new, i, k);
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }

    private static int getCount(int count, int i, int j, int k) {
        long p =  i * 10000 + j * 100 + k;
        long temp = p;
        long y = 0;
        if (p==40111104){
//            System.exit(0);
        }
        while (temp > 0) {
            y = y * 10 + temp % 10;
            temp = temp / 10;
        }
        if (y == p) {
            System.out.println(p);
            count++;
        }

        return count;
    }
}
