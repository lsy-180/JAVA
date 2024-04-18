package duotai;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(18);
        student.setName("吴芸娜");
        Teacher teacher=new Teacher();
        teacher.setAge(55);
        teacher.setName("刘苏漾");
        Admin admin=new Admin();
        admin.setAge(99);
        admin.setName("admin");
        register(student);
        register(teacher);
        register(admin);
        StringBuilder stringBuilder=new StringBuilder();
        ArrayList<Object> list=new ArrayList<>();
        list.add(teacher);
        System.out.println( list.get(0));
    }

    public static void register(Person p){
        p.show();
    }
}
