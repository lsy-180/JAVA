package LeetCode;

public class L {
    public static void main(String[] args) {
        int[][]moves ={{0,0},{2,0},{1,1},{2,1},{2,2}};
        int len=moves.length;
        if(len<9){
            System.out.println("Pending");
        }
        String[][] num=new String[3][3];
        int s=2;
        for(int i=0;i<len;i++){
            if(s%2==0){
                int[]arr=moves[i];
                num[arr[0]][arr[1]]="A";
            }
            else{
                int[]arr=moves[i];
                num[arr[0]][arr[1]]="B";
            }
            s++;
        }
        
        for(int i=0;i<3;i++){
            String string="";
            for(int j=0;j<3;j++){
                string+=num[i][j];
            }
            if(string.equals("AAA")){
                System.out.println("A");
            }
            if(string.equals("BBB")){
                System.out.println("B");
            }
        }
        for(int i=0;i<3;i++){
            String string="";
            for(int j=0;j<3;j++){
                string+=num[j][i];
            }
            if(string.equals("AAA")){
                System.out.println("A");
            }
            if(string.equals("BBB")){
                System.out.println("B");
            }
        }
        if((num[0][0].equals("A") &&num[1][1].equals("A")&&num[2][2].equals("A")) ||(num[0][2].equals("A") &&num[1][1].equals("A")&&num[2][0].equals("A")) ){
            System.out.println("A");
        }
        if((num[0][0].equals("B") &&num[1][1].equals("B")&&num[2][2].equals("B")) ||(num[0][2].equals("B")&&num[1][1].equals("B")&&num[2][0].equals("B")) ){
            System.out.println("B");
        }
        System.out.println("Draw");

    }
}
