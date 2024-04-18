package LuoGu;

import java.util.Scanner;

public class P1304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 4; i <= N; i+=2) {
            int []ge=oushu(i);
            System.out.println(i+"="+ge[0]+"+"+ge[1]);
        }
    }

    public static int[] oushu(int num) {
        int[]nes=new int[2];
        for (int i = 2; i < num; i++) {
            boolean flag=zhishu(i);
            if (flag){
                int p=num-i;
                if (zhishu(p)){
                    nes[0]=i;
                    nes[1]=p;
                    break;
                }
            }
        }
        return nes;
    }
    public static boolean zhishu(int num){
        if (num==2||num==3){
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
