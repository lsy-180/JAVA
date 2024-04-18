package jiekou;

public class LanTeacher extends JiaoLian{
    public LanTeacher() {
    }

    public LanTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach(){
        System.out.println("教打篮球");
    }
}
