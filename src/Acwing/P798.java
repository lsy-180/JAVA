package Acwing;

import java.io.*;

// 差分矩阵
public class P798 {
    static int[][] num = new int[1003][1003];
    static int[][] b = new int[1003][1003];
    public static void main(String[] args) throws IOException {
        // 该方法读取超时
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), q = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                num[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                insert(i, j, i, j, num[i][j]);
            }
        }
        while (q != 0) {
            int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
            int c= scanner.nextInt();
            insert(x1,y1,x2,y2,c);
            q--;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                b[i][j]+=b[i-1][j]+b[i][j-1]-b[i-1][j-1];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%d ",b[i][j]);
            }
            System.out.println();
        }*/
        //  利用BufferedReader 和 BufferedWriter解决
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int q = Integer.parseInt(s[2]);

        for(int i = 1; i <= n; i ++){
            String[] in = br.readLine().split(" ");
            for(int j = 1; j <= m; j ++){
                // a[i][j] = sc.nextInt();
                num[i][j] = Integer.parseInt(in[j - 1]);
            }
        }
        //生成初始化b[i],可以和上面合并
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= m; j ++){
                insert(i, j, i, j, num[i][j]);
            }
        }
        //按区间进行 + c
        while(q -- != 0){
            // int x1, y1, x2, y2, c;
            // x1 = sc.nextInt();
            // y1 = sc.nextInt();
            // x2 = sc.nextInt();
            // y2 = sc.nextInt();
            // c = sc.nextInt();
            String[] info = br.readLine().split(" ");
            int x1 = Integer.parseInt(info[0]);
            int y1 = Integer.parseInt(info[1]);
            int x2 = Integer.parseInt(info[2]);
            int y2 = Integer.parseInt(info[3]);
            int c = Integer.parseInt(info[4]);
            insert(x1, y1, x2, y2, c);
        }

        //前缀和
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= m; j ++){
                b[i][j] = b[i - 1][j] + b[i][j - 1] - b[i - 1][j - 1] + b[i][j];
            }
        }
        //可以和上面合并
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= m; j ++){
                //System.out.print(b[i][j] + " ");  //超时
                bw.write(b[i][j] + " ");
            }
            //System.out.println();  //超时
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    public static void insert(int x1, int y1, int x2, int y2, int c) {
        b[x1][y1] += c;
        b[x1][y2 + 1] -= c;
        b[x2 + 1][y1] -= c;
        b[x2 + 1][y2 + 1] += c;
    }
}
