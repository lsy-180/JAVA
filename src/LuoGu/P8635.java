package LuoGu;

import java.util.Scanner;

public class P8635 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for (int i = 0;i*i<=N; i++) {
            if (i*i+i*i+i*i+i*i>N) break;
            for (int j = i;i*i+j*j<=N; j++) {
                if (i*i+j*j+j*j+j*j>N) break;
                for (int k = j;i*i+j*j+k*k<=N; k++) {
                    int p= (int) Math.sqrt(N-i*i-j*j-k*k);
                    if (i*i+j*j+k*k+p*p==N){
                        System.out.printf("%d %d %d %d",i,j,k,p);
                        return;
                            }
                        }
                    }
                }

            }
}
