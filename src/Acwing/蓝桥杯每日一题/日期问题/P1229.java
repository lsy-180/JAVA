package Acwing.蓝桥杯每日一题.日期问题;

import java.util.Scanner;

public class P1229 {
    public static int[]months={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String  string= scanner.next();
        String[]strings=string.split("/");
        int one=Integer.parseInt(strings[0]);
        int two=Integer.parseInt(strings[1]);
        int three=Integer.parseInt(strings[2]);
        for (int i=19600101;i<20591231;i++){
            int year=i/10000;
            int month=i/100-year*100;
            int day=i%100;
            if (check(year,month,day)){
                if (year%100==one&&month==two&&day==three||
                month==one&&day==two&&year%100==three||
                day==one&&month==two&&year%100==three){
                    System.out.printf("%d-%02d-%02d",year,month,day);
                    System.out.println();
                }
            }
        }
    }
    public static boolean check(int year,int month,int day){
        if (month<0||month>12){
            return false;
        }
        if (year>2059||year<1960){
            return false;
        }
        if (day==0){
            return false;
        }
        if (month!=2){
            if (day>months[month]){
                return false;
            }
        }else {
            if (year%400==0||(year%4==0&&year%100!=0)){
                if (day>months[month]+1){
                    return false;
                }
            }else {
                if (day > months[month]) {
                    return false;
                }
            }
        }
        return true;
    }
}
