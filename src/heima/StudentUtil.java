package heima;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}
    public static int getMaxAge(ArrayList<Student> student){
        int max=0;
        for (int i = 1; i < student.size(); i++) {
            if (student.get(i).getAge()>max){
                max= student.get(i).getAge();
            }
        }
        return max;
    }
}
