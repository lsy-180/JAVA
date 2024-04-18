package LuoGu;

import java.util.Scanner;

public class P2669 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int i=1;
        int count=0;
        while (k!=0){
            if (k-i>=0){
                k-=i;
                count=count+i*i;
            }
            else {
                count=count+i*k;
                k=0;
            }
            i++;
        }
        System.out.println(count);
    }
}
