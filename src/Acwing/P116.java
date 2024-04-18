package Acwing;

import java.util.Scanner;

public class P116 {
    public static int N=5;
    public static char [][]num=new char[N][N];
    public static char [][]back=new char[N][N];
    public static String end="";
    public static int R=66536;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            num[i]=scanner.next().toCharArray();
        }

        for (int op = 0; op < Math.pow(2,16); op++) {
            int temp=0;
            StringBuilder str= new StringBuilder();
            for (int i = 0; i < num.length; i++) {
                back[i]=num[i].clone();
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if ((op >>getN(i,j)&1)==1){
                        turn(i,j);
                        temp++;
                        str.append(i);
                        str.append(j);
                    }
                }
            }
            boolean flag=true;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (back[i][j]=='+'){
                        flag=false;
                        break;
                    }
                }
            }
            if (flag){
                if (R>temp){
                    R=temp;
                    end= String.valueOf(str);
                }
            }
        }
        System.out.println(R);
        for (int i = 0; i < end.length(); i+=2) {
            int a=end.charAt(i)-'0'+1;
            int b=end.charAt(i+1)-'0'+1;
            System.out.printf("%d %d",a,b);
            System.out.println();
        }
    }

    private static void turn(int i, int j) {
        for (int k = 0; k < 4; k++) {
            if (back[i][k]=='-'){
                back[i][k]='+';
            }else {
                back[i][k]='-';
            }
        }
        for (int k = 0; k < 4; k++) {
            if (back[k][j]=='-'){
                back[k][j]='+';
            }else {
                back[k][j]='-';
            }
        }
        if (back[i][j]=='-'){
            back[i][j]='+';
        }else {
            back[i][j]='-';
        }
    }

    public static int getN(int x,int y){
        return 4*x+y;
    }

}
