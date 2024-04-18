package LuoGu;

import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]num=new int[102];
        int i=0;
        while (true){
            int s= scanner.nextInt();
            if (s!=0){
                num[i]=s;
                i++;
            }
            else {
                break;
            }
        }
        for (int j = i-1; j >=0 ; j--) {
            System.out.printf("%d ",num[j]);
        }
    }
}
