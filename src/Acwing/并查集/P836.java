package Acwing.并查集;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
class UnionFind{
    int[] parent;// parent[i]表示i这个元素指向的父亲节点
    int[] size;//size[i]表示以i为根节点的集合中元素个数
    int n;//节点的个数，初始化每一个节点都是一个单独的连通分量
    int setCount;//连通分量的数目
    public UnionFind(int n){
        this.size=new int[n];
        this.parent=new int[n];
        this.n=n;
        this.setCount=n;
        Arrays.fill(size,1);
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int x){
        return parent[x]==x?x:find(parent[x]);
    }
    public boolean unit(int x,int y){
        x=find(x);
        y=find(y);
        if(x==y){
            return false;
        }
        if(size[x]<size[y]){
            int tem=x;
            x=y;
            y=tem;
        }

        parent[y]=x;
        size[x]+=size[y];
        --setCount;
        return true;
    }
    public boolean connected(int x, int y) {
        x = find(x);
        y = find(y);
        return x == y;
    }
}
public class P836 {
    public static int N=100010;
    public static int[]q=new int[N];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        UnionFind uf = new UnionFind(n +1);
        while (m!=0){
            m--;
            String qs= scanner.next();
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            if (Objects.equals(qs, "M")){
                uf.unit(a, b);
            }else {
                if (!uf.connected(a,b)){
                    System.out.println("No");
                }else {
                    System.out.println("Yes");
                }
            }
        }
    }
}
