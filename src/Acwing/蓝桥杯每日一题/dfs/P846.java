package Acwing.蓝桥杯每日一题.dfs;

import java.util.*;

public class P846 {
    static int N = 100010, M = N * 2, idx, n;
    static int[] h = new int[N];
    static int[] e = new int[M];  //因为是无向邻接表，存的是正反两个方向，所以是M
    static int[] ne = new int[M];  //存的是双倍，所以是M
    static boolean[] flag = new boolean[N];   //存这个点是否被遍历过
    static int ans = N;   //用来求各个连通块中最小的最大值
    private static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }    //以u为根节点的子树中点的数量
    private static int dfs(int u) {  //深度优先搜索
        flag[u] = true;  //true表示这个节点被遍历过了
        int sum = 1;   //u这个根节点算一个点，所以从1开始
        int res = 0;  //这个点删掉后，各个连通块大小的最大值
        for (int i = h[u]; i != -1; i = ne[i]) {
            int j = e[i];  //将每一个点指向的点用变量表示出来
            if (!flag[j]) {  //如果是没用过，没被标记过的，就可以执行
                int s = dfs(j);   //s表示当前子树的大小
                //递归他邻接表上面所有能够抵达的点,返回的数量是他所删除的点下面的连通块的大小
                res = Math.max(res, s);  //当前的子树s也是一个连通块，和res比较一下大小，求最大连通块
                sum += s;  //每递归一个点就增加一个返回的s值，可以将这个值累加成为最大连通块
            }
        }
        res = Math.max(res, n - sum);  //删除的点的上面的连通块(n - sum)可能是最大的连通块
        ans = Math.min(ans, res); //将每次求出的连通块的最大值进行比较，留下最小的最大值
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Arrays.fill(h, -1);  //将每一个头节点都赋值成-1
        for (int i = 0; i < n - 1; i++) {    //n-1条边
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a, b);  //因为是无向边，所以两个数同时指向对方
            add(b, a);
        }
        dfs(1);
        System.out.println(ans);
    }
}
