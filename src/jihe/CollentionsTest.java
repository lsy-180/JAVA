package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollentionsTest {
    public static void main(String[] args) {
        // 班里有n个学生 实现随机点名
        ArrayList<String> stringArrayList=new ArrayList<>();
        Collections.addAll(stringArrayList,"高福昕","杨林江","刘苏漾","张文硕","李家欣");
        Random random=new Random();
        int index= random.nextInt(stringArrayList.size());
        System.out.println(stringArrayList.get(index));

        // 班里有n个学生 70%抽男生 30%抽女生
        ArrayList<Integer> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,1,1,1,1,1,1,1,0,0,0);

        int indexs= random.nextInt(arrayList.size());
        int number=arrayList.get(indexs);
        ArrayList<String> stringArrayListGirl=new ArrayList<>();
        Collections.addAll(stringArrayListGirl,"吴芸娜","柳颖","石瑞","刘哲","美女");
        if (number==1){
            System.out.println(number);
            int boys= random.nextInt(stringArrayList.size());
            System.out.println(stringArrayList.get(boys));
        }else {
            System.out.println(number);
            int girls= random.nextInt(stringArrayListGirl.size());
            System.out.println(stringArrayListGirl.get(girls));
        }

    }
}
