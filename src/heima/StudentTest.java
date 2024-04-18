package heima;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student[]students= new Student[3];
        Student one=new Student("吴芸娜",18,"女");
        Student two=new Student("吴芸娜",60,"女");
        Student three=new Student("吴芸娜",100,"女");
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(one);
        stringBuilder.append(two);
        stringBuilder.append(three);
        students[0]=one;
        students[1]=two;
        students[2]=three;
//        int age =StudentUtil.getMaxAge(students);
        ArrayList<Student> list=new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        int age =StudentUtil.getMaxAge(list);
        System.out.println(age);
        System.out.println(args[0]);
    }
}
