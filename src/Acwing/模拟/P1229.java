package Acwing.模拟;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class P1229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String string = scanner.next();
        String[] strings = string.split("/");
        System.out.println(Arrays.toString(strings));
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int[] months2={31,29,31,30,31,30,31,31,30,31,30,31};
        int p = 0;
        int[] num = new int[3];
        int n = 3;
        while (n != 0) {
            if (n == 3) {
                int year = Integer.parseInt(strings[0]);
                int month = Integer.parseInt(strings[1]);
                int day = Integer.parseInt(strings[2]);

                System.out.println(month);
                System.out.println(day);
                if (year >= 60 && year <= 99) {
                    year = 1900 + year;
                } else {
                    year = 2000 + year;
                }
                System.out.println(year);
                if(year%400==0||(year%4==0&&year%100!=0)){
                    for (int i = 0; i < months2.length; i++) {
                        if (month==i+1){
                            if (day>0&&day<=months2[i]){
                                num[p++] = year * 10000 + month * 100 + day;
                            }
                        }
                    }
                }else {
                    for (int i = 0; i < months.length; i++) {
                        if (month==i+1){
                            if (day>0&&day<=months[i]){
                                num[p++] = year * 10000 + month * 100 + day;
                            }
                        }
                    }
                }
            } else if (n == 2) {
                int month = Integer.parseInt(strings[0]);
                int day = Integer.parseInt(strings[1]);
                int year = Integer.parseInt(strings[2]);
                if (year >= 60 && year <= 99) {
                    year = 1900 + year;
                } else {
                    year = 2000 + year;
                }
                if (year%400==0||year%4==0&&year%100!=0){
                    for (int i = 0; i < months2.length; i++) {
                        if (month==i+1){
                            if (day>0&&day<=months2[i]){
                                num[p++] = year * 10000 + month * 100 + day;
                            }
                        }
                    }
                }else {
                    for (int i = 0; i < months.length; i++) {
                        if (month==i+1){
                            if (day>0&&day<=months[i]){
                                num[p++] = year * 10000 + month * 100 + day;
                            }
                        }
                    }
                }
            } else {
                int day = Integer.parseInt(strings[0]);
                int month = Integer.parseInt(strings[1]);
                int year = Integer.parseInt(strings[2]);
                if (year >= 60 && year <= 99) {
                    year = 1900 + year;
                } else {
                    year = 2000 + year;
                }
                if (year%400==0||(year%4==0&&year%100!=0)){
                    for (int i = 0; i < months2.length; i++) {
                        if (month==i+1){
                            if (day>0&&day<=months2[i]){
                                num[p++] = year * 10000 + month * 100 + day;
                            }
                        }
                    }
                }else {
                    for (int i = 0; i < months.length; i++) {
                        if (month==i+1){
                            if (day>0&&day<=months[i]){
                                num[p++] = year * 10000 + month * 100 + day;
                            }
                        }
                    }
                }
            }
            n--;
        }
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        if (num[0]==num[1]&&num[1]==num[2]){
            int year = num[0] / 10000;
            int monthtemp = num[0] / 100;
            int month = 0;
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    int x = monthtemp % 10;
                    monthtemp = monthtemp / 10;
                    month += x;
                } else {
                    month += (monthtemp % 10) * 10;
                }
            }
            int day = num[0] % 10 + ((num[0] / 10) % 10) * 10;
            if (month < 10 && month > 0) {
                if (day < 10 && day > 0) {
                    System.out.println(year + "-" + 0 + month + "-" + 0 + day);
                } else if (day >= 10 && day <= 31) {
                    System.out.println(year + "-" + 0 + month + "-" + day);
                }
            } else if (month >= 10 && month <= 12) {
                if (day < 10 && day > 0) {
                    System.out.println(year + "-" + month + "-" + 0 + day);
                } else if (day >= 10 && day <= 31) {
                    System.out.println(year + "-" + month + "-" + day);
                }
            }
        } else if (num[0]==num[1]&&num[1]!=num[2]) {
            for (int i = 1; i < num.length; i++) {
                int year = num[i] / 10000;
                int monthtemp = num[i] / 100;
                int month = 0;
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        int x = monthtemp % 10;
                        monthtemp = monthtemp / 10;
                        month += x;
                    } else {
                        month += (monthtemp % 10) * 10;
                    }
                }
                int day = num[i] % 10 + ((num[i] / 10) % 10) * 10;
                if (month < 10 && month > 0) {
                    if (day < 10 && day > 0) {
                        System.out.println(year + "-" + 0 + month + "-" + 0 + day);
                    } else if (day >= 10 && day <= 31) {
                        System.out.println(year + "-" + 0 + month + "-" + day);
                    }
                } else if (month >= 10 && month <= 12) {
                    if (day < 10 && day > 0) {
                        System.out.println(year + "-" + month + "-" + 0 + day);
                    } else if (day >= 10 && day <= 31) {
                        System.out.println(year + "-" + month + "-" + day);
                    }
                }
            }
        }else {
            for (int i = 0; i < num.length; i++) {
                int year = num[i] / 10000;
                int monthtemp = num[i] / 100;
                int month = 0;
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        int x = monthtemp % 10;
                        monthtemp = monthtemp / 10;
                        month += x;
                    } else {
                        month += (monthtemp % 10) * 10;
                    }
                }
                int day = num[i] % 10 + ((num[i] / 10) % 10) * 10;
                if (month < 10 && month > 0) {
                    if (day < 10 && day > 0) {
                        System.out.println(year + "-" + 0 + month + "-" + 0 + day);
                    } else if (day >= 10 && day <= 31) {
                        System.out.println(year + "-" + 0 + month + "-" + day);
                    }
                } else if (month >= 10 && month <= 12) {
                    if (day < 10 && day > 0) {
                        System.out.println(year + "-" + month + "-" + 0 + day);
                    } else if (day >= 10 && day <= 31) {
                        System.out.println(year + "-" + month + "-" + day);
                    }
                }
            }
        }
        System.out.printf("%02d",15);
    }
}
