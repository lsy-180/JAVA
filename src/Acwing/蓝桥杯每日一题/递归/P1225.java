package Acwing.蓝桥杯每日一题.递归;

import java.util.Scanner;

public class P1225 {
    public static String string;
    public static int k=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        string= scanner.next();
        System.out.println(dfs());
    }
    public static int dfs(){
        int res=0;
        while (k<string.length()){
            if (string.charAt(k)=='('){
                k++; //跳过左括号
                res+=dfs();
                k++; //跳过右括号
            } else if (string.charAt(k)=='|') {
                k++;
                res=Math.max(res,dfs());
            } else if (string.charAt(k)==')') {
                break;
            }else {
                k++;
                res++;
            }
        }
        return res;
    }
}
