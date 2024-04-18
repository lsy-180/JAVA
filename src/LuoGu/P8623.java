package LuoGu;

import java.util.Scanner;

public class P8623 {
    public static int temp=0;
    public static int s=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt(), m = scanner.nextInt(), n = scanner.nextInt();
        int k=1;
        int[][]num=new int[10000][w];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < w; j++) {
                if (i%2==0){
                    num[i][j]=k++;
                }
                else {
                    num[i][j]=w*(i+1)-j;
                    k++;
                }
            }
        }
        int min=Math.min(m,n);
        int max=Math.max(m,n);
        if (min%w==0){
            s=min/w-1;
        }else {
            s=min/w;
        }
        if (max%w==0){
            temp=max/w-1;
        }else {
            temp=max/w;
        }
        int count=0;
        count+=temp-s;
        if (s%2==0){
            int tmp=0;
            for (int i = 0; i < w; i++) {
                if (num[s][i]==min){
                    tmp=i;
                }
            }
            if ((temp-s)%2==0){
                if (num[temp][tmp]>max){
                    for (int i = tmp-1; i >=0; i--) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }else {
                    for (int i = tmp+1; i <w; i++) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }
            }else {
                if (num[temp][tmp]>max){
                    for (int i = tmp+1; i <w; i++) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }else {
                    for (int i = tmp-1; i >=0; i--) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }
            }
        }else {
            int tmp=0;
            for (int i = 0; i < w; i++) {
                if (num[s][i]==min){
                    tmp=i;
                }
            }
            if ((temp-s)%2==0){
                if (num[temp][tmp]>max){
                    for (int i = tmp+1; i <w; i++) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }else {
                    for (int i = tmp-1; i >=0; i--) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }
            }else {
                if (num[temp][tmp]>max){
                    for (int i = tmp-1; i >=0; i--) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }else {
                    for (int i = tmp+1; i <w; i++) {
                        count++;
                        if (num[temp][i]==max){
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
