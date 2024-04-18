package Acwing.模拟;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class P3498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        ArrayList<String> arrayList=new ArrayList<>();
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int[] months2={31,29,31,30,31,30,31,31,30,31,30,31};
        while (scanner.hasNextLine()) {
            String string=scanner.nextLine();
            if (string.isEmpty()){
                break;
            }
            arrayList.add(string);
        }
        for (int i = 0; i < arrayList.size(); i+=2) {
            int olds= Integer.parseInt(arrayList.get(i));
            int newss= Integer.parseInt(arrayList.get(i+1));
            int old=Math.min(olds,newss);
            int news=Math.max(olds,newss);
            int old_year=old/10000;
            int old_month=(old/100)%100;
            int old_day=old%100;
            int new_year=news/10000;
            int new_month=(news/100)%100;
            int new_day=news%100;
            int old_run=run(old_year);
            long old_year_days=(old_year-1)*365+old_run;
            int old_month_day=0;
            long old_end=0;

            int new_run=run(new_year);
            long new_year_days=(new_year-1)*365+new_run;
            int new_month_day=0;
            long new_end=0;
            if (old_year%4==0&&old_year%100!=0||old_year%400==0){
                for (int j = 0; j < old_month-1; j++) {
                    old_month_day+=months2[j];
                }
                old_end=old_year_days+old_month_day+old_day;
            }else {
                for (int j = 0; j < old_month-1; j++) {
                    old_month_day+=months[j];
                }
                old_end=old_year_days+old_month_day+old_day;
            }
            if (new_year%4==0&&new_year%100!=0||new_year%400==0){
                for (int j = 0; j < new_month-1; j++) {
                    new_month_day+=months2[j];
                }
                new_end=new_year_days+new_month_day+new_day;
            }else {
                for (int j = 0; j < new_month-1; j++) {
                    new_month_day+=months[j];
                }
                new_end=new_year_days+new_month_day+new_day;
            }
            long end=new_end-old_end+1;
            System.out.println(end);
        }

    }
    public static int run(int year){
        int end=0;
        for (int i=1;i<year;i++){
            if (i%4==0&&i%100!=0||i%400==0){
                end++;
            }
        }
        return end;
    }
}
