package Acwing.单链表;

import java.util.*;
public class P826{
    // head 表示头结点的下标
    // e[i] 表示节点i的值
    // ne[i] 表示节点i的next指针是多少
    // idx 存储当前已经用到了哪个点
    static int N = 100010;
    static int head = - 1;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int idx = 0;
    // 将x插到头结点
    public static void add_to_head(int x)
    {
        e[idx] = x;
        ne[idx] = head;
        head = idx ++;
    }
    // 将下标是k的点后面的点删掉
    public static void remove(int k)
    {
        ne[k] = ne[ne[k]];
    }
    // 将x插到下标是k的点后面
    public static void add(int k,int x)
    {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx ++ ;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        while(m -- > 0)
        {
            String op = scan.next();
            if(op.equals("H"))
            {
                int x = scan.nextInt();
                add_to_head(x);
            }
            else if(op.equals("D"))
            {
                int k = scan.nextInt();
                if(k == 0) head = ne[head];
                else remove(k - 1);
            }
            else
            {
                int k = scan.nextInt();
                int x = scan.nextInt();
                add(k - 1, x);
            }
        }
        for(int i = head; i != -1; i = ne[i])
            System.out.print(e[i]+ " ");
    }

}

