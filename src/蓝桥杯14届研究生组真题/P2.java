package 蓝桥杯14届研究生组真题;

public class P2 {
    public static int[][] arr = new int[5][5];
    public static int count=0;
    public static void main(String[] args) {
        arr[0] = new int[]{1, 0, 1, 0, 1};
        dfs(arr,1,0);
        System.out.println(count);
    }

    public static int yumen(int a, int b) {
        return a & b;
    }

    public static int huomen(int a, int b) {
        return a | b;
    }

    public static int yihuomen(int a, int b) {
        return a ^ b;
    }
    static void dfs(int[][]ans,int i,int j){//第一步：定变量，定所需值
        if(i==5){             //第二步：终止条件及完成终止条件后更新所求值
            if(ans[4][0]==1){
                count++;//静态变量
//count作为计数的变量，它的值应在递归过程中保持稳定。如果放到dfs（count）中，返回来时count的值也在变化
            }
            return;
        }
        for(int k=0;k<3;k++){//第三步：for循环，遍历可能存在的选项（如|,&,^每次循环选一个）
            if(k==0){
                ans[i][j]=ans[i-1][j]&ans[i-1][j+1];
            }else if(k==1){
                ans[i][j]=ans[i-1][j]|ans[i-1][j+1];
            }else{
                ans[i][j]=ans[i-1][j]^ans[i-1][j+1];
            }

            if(j==4-i){    //第四步：更新该行状态后进入下一行,更新列数
                dfs(ans,i+1,0);
            }else{
                dfs(ans,i,j+1);//更新行数
            }

        }

    }
}

