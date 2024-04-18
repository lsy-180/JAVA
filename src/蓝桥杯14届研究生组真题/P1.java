package 蓝桥杯14届研究生组真题;

import java.util.Scanner;




public class P1 {
    public static int[]months={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        for (int i=19000101;i<=99991231;i++){
            if (check(i)){
                int year=i/10000;
                int month=i/100-year*100;
                int day=i%100;
                int years=0;
                int mon_day=0;
                while (year!=0){
                    int x=year%10;
                    year=year/10;
                    years+=x;
                }
                while (month!=0){
                    int x=month%10;
                    month=month/10;
                    mon_day+=x;
                }
                while (day!=0){
                    int x=day%10;
                    day=day/10;
                    mon_day+=x;
                }
                if (years==mon_day){

                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static boolean check(int x){
        int year=x/10000;
        int month=x/100-year*100;
        int day=x%100;
        if (month<1||month>12) return false;
        if (month==2){
            if (year%400==0||year%4==0&&year%100!=0){
                if (day<1||day>months[2]+1){
                    return false;
                }
            }else {
                if (day<1||day>months[2]) return false;
            }
        }else {
            if (day<1||day>months[month]){
                return false;
            }
        }
        return true;
    }
}
