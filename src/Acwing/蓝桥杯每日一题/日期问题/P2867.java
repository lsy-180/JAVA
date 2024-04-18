package Acwing.蓝桥杯每日一题.日期问题;

import java.util.Scanner;

public class P2867 {
    public static int[]months={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        for (int i = n+1; i <=99991231 ; i++) {
            if (check(i)){
                if (hui_wen(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
        for (int i = n+1; i <=99991231 ; i++) {
            if (check(i)){
                if (AB_hui_wen(i)){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
    public static boolean check(int n){
        int year=n/10000;
        int month=n/100-year*100;
        int day=n%100;
        if (month<0||month>12) return false;
        if (month==2){
            if (year%400==0||year%4==0&&year%100!=0){
                if (day<0||day>29){
                    return false;
                }
            }else {
                if (day<0||day>28){
                    return false;
                }
            }
        }else{
            if (day<0||day>months[month]){
                return false;
            }
        }
        return true;
    }
    public static boolean hui_wen(int n){
        int A1=n/10000000;
        int B1=n/1000000-A1*10;
        int A2=n/100000-(n/1000000)*10;
        int B2=n/10000-(n/100000)*10;
        int B3=n/1000-(n/10000)*10;
        int A3=n/100-(n/1000)*10;
        int B4=n/10-(n/100)*10;
        int A4=n%10;
        if (A1==A4&&B1==B4&&A2==A3&&B2==B3){
            return true;
        }
        return false;
    }
    public static boolean AB_hui_wen(int n){
        int A1=n/10000000;
        int B1=n/1000000-A1*10;
        int A2=n/100000-(n/1000000)*10;
        int B2=n/10000-(n/100000)*10;
        int B3=n/1000-(n/10000)*10;
        int A3=n/100-(n/1000)*10;
        int B4=n/10-(n/100)*10;
        int A4=n%10;
        if (A1==A2&&A2==A3&&A3==A4&&B1==B2&&B2==B3&&B3==B4&&A1!=B1){
            return true;
        }
        return false;
    }
}
